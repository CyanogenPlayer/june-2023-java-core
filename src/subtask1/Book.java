package subtask1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Book implements Printable {
    private String name;
    private int pageCount;

    @Override
    public void print() {
        System.out.println("Book{" + "name='" + name + '\'' + ", pageCount=" + pageCount + '}');
    }
}
