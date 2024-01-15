package subtask2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Drum implements Instrument {
    private String size;

    @Override
    public void play() {
        System.out.println("Now playing: " + "Drum{" + "size=" + size +'}');
    }
}
