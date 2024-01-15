package subtask2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Guitar implements Instrument {
    private int stringsCount;

    @Override
    public String toString() {
        return "Guitar{" +
                "stringsCount=" + stringsCount +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Now playing: " + "Guitar{" + "stringsCount=" + stringsCount +'}');
    }
}
