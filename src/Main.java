import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Product pencil = new Product();
        pencil.setName("pencil");
        pencil.setPrice(1.99);

        var laptop = new Laptop();
        laptop.setName("asus");
        laptop.setPrice(1999.99);
        laptop.setCpuModel("cora2duba");

        Notebook notebook = new Notebook();
        notebook.setName("note");
        notebook.setPrice(4.99);
        notebook.setNumberOfSheets(12);

        products.add(pencil);
        products.add(laptop);
        products.add(notebook);

        for (Product product : products) {
            product.printInfo();
        }

        laptop.addReview("good", 10);
        System.out.println("review: " + laptop.getReviews());
    }
}
