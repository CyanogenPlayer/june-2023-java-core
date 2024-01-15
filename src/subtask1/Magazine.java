package subtask1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Magazine implements Printable {
    private String thematic;
    private int pageCount;


    @Override
    public void print() {
        System.out.println("Magazine{" + "thematic='" + thematic + '\'' + ", pageCount=" + pageCount + '}');
    }
}
