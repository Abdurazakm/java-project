import java.util.Scanner;

class Product {
    String name;
    double price;
    int qty;

    // Constructor
    public Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    // Method to calculate the cost
    public double calcCost() {
        return price * qty;
    }

    // Method to calculate the tax (assume 10% tax rate)
    public double calcTax() {
        return calcCost() * 0.10;
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for N products
        System.out.print("Enter number of products: ");
        int N = input.nextInt();
        input.nextLine(); // consume newline character

        for (int i = 0; i < N; i++) {
            System.out.println("\nEnter details for product " + (i+1));

            // Input values
            System.out.print("Enter product name: ");
            String name = input.nextLine();
            System.out.print("Enter product price: ");
            double price = input.nextDouble();
            System.out.print("Enter product quantity: ");
            int qty = input.nextInt();
            input.nextLine(); // consume newline character

            // Create product and calculate cost and tax
            Product product = new Product(name, price, qty);
            System.out.println("Total cost: " + product.calcCost());
            System.out.println("Tax: " + product.calcTax());
        }
    }
}
