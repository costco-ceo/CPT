package restaurant;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * author: Maria Alampay
 * date: 19/01/2025
 * Order Test Cases 
 */

 /**
 * Creating a test class for the Restaurant as a way to test the methods to ensure they properly work/return the correct values
 * @param Order is the main class is we're we test the methods with the returns 
 * @return This test class returns the methods such as addItem, getItems, getTotalPrice, orderTicket, and writeOrderToFile
 */

public class OrderTest {

    @Test
    public void testAddItem() {
        Order order = new Order();
        order.addItem("Garden Salad");
        order.addItem("Water");
        assertTrue(order.getItems().contains("Garden Salad"));
        assertTrue(order.getItems().contains("Water"));
        assertEquals(2, order.getItems().size());
    }

    @Test
    public void testGetItems() {
        Order order = new Order();
        order.addItem("Garden Salad");
        order.addItem("Water");
        assertEquals(2, order.getItems().size());
        assertTrue(order.getItems().contains("Garden Salad"));
        assertTrue(order.getItems().contains("Water"));
    }

    @Test
    public void testGetTotalPrice() {
        Order order = new Order();
        order.setTotalPrice(15.65);
        assertEquals(15.65, order.getTotalPrice());
    }

    @Test
    public void testOrderTicket() {
        Order order = new Order();
        order.addItem("Garden Salad");
        order.addItem("Water");
        order.setTotalPrice(15.65);
        String expectedOutput = "===== ORDER TICKET =====\n" +
                                "------------------------\n" +
                                "Garden Salad\n" +
                                "Water\n" +
                                "------------------------\n" +
                                "Total Price: $15.65\n" +
                                "========================";
        assertEquals(expectedOutput, order.toString());
    }

    @Test
    public void testWriteOrderToFile() {
        Order order = new Order();
        order.addItem("Garden Salad");
        order.addItem("Water");
        order.setTotalPrice(15.65);
        order.writeOrderToFile("test_order_ticket.txt");

        // Read the file and verify its contents
        try (Scanner scanner = new Scanner(new File("test_order_ticket.txt"))) {
            StringBuilder fileContent = new StringBuilder();
            while (scanner.hasNextLine()) {
                fileContent.append(scanner.nextLine()).append("\n");
            }
            String expectedOutput = "===== ORDER TICKET =====\n" +
                                    "------------------------\n" +
                                    "Garden Salad\n" +
                                    "Water\n" +
                                    "------------------------\n" +
                                    "Total Price: $15.65\n" +
                                    "========================\n";
            assertEquals(expectedOutput, fileContent.toString());
        } catch (IOException e) {
            fail("An error occurred while reading the order file.");
        }
    }
}