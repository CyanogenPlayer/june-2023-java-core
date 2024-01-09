import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Product {
    protected String name;
    protected Double price;
    protected ArrayList<Review> reviews;

    public void printInfo() {
        System.out.println("Product name: " + name + ", price: " + price);
    }

    public void addReview(String text, int rating) {
        Review review = new Review();
        review.setText(text);
        review.setRatings(rating);

        if (reviews == null) {
            reviews = new ArrayList<>();
        }

        reviews.add(review);
    }
}
