package subtask3;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Magazine extends Book {
    private String theme;

    public Magazine(String typeOfPaper, int numberOfPages, String theme) {
        super(typeOfPaper, numberOfPages);
        this.theme = theme;
    }

    @Override
    public String infoAbout() {
        return "I'm not interesting because i'm magazine))";
    }
}
