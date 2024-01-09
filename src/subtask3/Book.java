package subtask3;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Book extends Papyrus {
    private int numberOfPages;

    public Book(String typeOfPaper, int numberOfPages) {
        super(typeOfPaper);
        this.numberOfPages = numberOfPages;
    }

    public String infoAbout() {
        return "default info";
    }
}
