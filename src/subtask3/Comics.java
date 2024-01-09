package subtask3;

public class Comics extends Book {
    private String kind;

    public Comics(String typeOfPaper, int numberOfPages, String kind) {
        super(typeOfPaper, numberOfPages);
        this.kind = kind;
    }

    @Override
    public String infoAbout() {
        return "I'm interesting because i'm comics about batman";
    }
}
