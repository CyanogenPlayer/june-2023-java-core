import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Notebook extends Product {
    private int numberOfSheets;

    @Override
    public void printInfo() {
        System.out.println("Name: " + name + ", price: " + price + ", numberOfSheets: " + numberOfSheets);
    }
}
