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

    /**
     * Tests the addItem method to ensure items are added correctly to the order.
     */
    @Test
    public void testAddItem() {
        // Arrange
        Order order = new Order();
        order.addItem("Garden Salad");
        order.addItem("Water");

        // Act
        boolean containsGardenSalad = order.getItems().contains("Garden Salad");
        boolean containsWater = order.getItems().contains("Water");
        int size = order.getItems().size();

        // Assert
        assertTrue(containsGardenSalad);
        assertTrue(containsWater);
        assertEquals(2, size);
    }

    /**
     * Tests the getItems method to ensure it returns the correct list of items.
     */
    @Test
    public void testGetItems() {
        // Arrange
        Order order = new Order();
        order.addItem("Garden Salad");
        order.addItem("Water");

        // Act
        int size = order.getItems().size();
        boolean containsGardenSalad = order.getItems().contains("Garden Salad");
        boolean containsWater = order.getItems().contains("Water");

        // Assert
        assertEquals(2, size);
        assertTrue(containsGardenSalad);
        assertTrue(containsWater);
    }

    /**
     * Tests the getTotalPrice method to ensure it returns the correct total price.
     */
    @Test
    public void testGetTotalPrice() {
        // Arrange
        Order order = new Order();
        order.setTotalPrice(15.65);

        // Act
        double totalPrice = order.getTotalPrice();

        // Assert
        assertEquals(15.65, totalPrice);
    }

    /**
     * Tests the orderTicket method to ensure it generates the correct order ticket string.
     */
    @Test
    public void testOrderTicket() {
        // Arrange
        Order order = new Order();
        order.addItem("Garden Salad");
        order.addItem("Water");
        order.setTotalPrice(15.65);

        // Act
        String orderTicket = order.toString();
        String expectedOutput = "===== ORDER TICKET =====\n" +
                                "Order Number: " + order.getOrderNumber() + "\n" +
                                "------------------------\n" +
                                "Garden Salad\n" +
                                "Water\n" +
                                "------------------------\n" +
                                "Total Price: $15.65\n" +
                                "========================";

        // Assert
        assertEquals(expectedOutput, orderTicket);
    }

    /**
     * Tests the writeOrderToFile method to ensure it writes the correct order ticket to a file.
     */
    @Test
    public void testWriteOrderToFile() {
        // Arrange
        Order order = new Order();
        order.addItem("Garden Salad");
        order.addItem("Water");
        order.setTotalPrice(15.65);
        String filename = "test_order_ticket.txt";

        // Act
        order.writeOrderToFile(filename);

        // Assert
        try (Scanner scanner = new Scanner(new File(filename))) {
            StringBuilder fileContent = new StringBuilder();
            while (scanner.hasNextLine()) {
                fileContent.append(scanner.nextLine()).append("\n");
            }
            String expectedOutput = "===== ORDER TICKET =====\n" +
                                    "Order Number: " + order.getOrderNumber() + "\n" +
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