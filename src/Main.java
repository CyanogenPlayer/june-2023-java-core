import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        String[] authors = {"1", "2", "3"};
        books.add(new Book("1dsad", 111, authors,"drama"));
        books.add(new Book("2dsad", 111, authors,"drama"));
        books.add(new Book("3dsad", 111, authors,"drama"));
        books.add(new Book("4dsad", 111, authors,"drama"));

        for (Book book : books) {
            System.out.println(book);
        }

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("dkjhaskd", 1, 2, true));
        cars.add(new Car("dkjhaskd", 1, 2, false));
        cars.add(new Car("dkjhaskd", 1, 2, false));
        cars.add(new Car("dkjhaskd", 1, 2, true));
        cars.add(new Car("dkjhaskd", 1, 2, true));

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}