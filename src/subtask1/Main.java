package subtask1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Printable> printableList = new ArrayList<>();

        printableList.add(new Book("lol", 12));
        printableList.add(new Magazine("kek", 100));

        for (Printable printable : printableList) {
            printable.print();
        }
    }
}