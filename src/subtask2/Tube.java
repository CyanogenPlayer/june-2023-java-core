package subtask2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Tube implements Instrument {
    private double diameter;

    @Override
    public void play() {
        System.out.println("Now playing: " + "Tube{" + "diameter=" + diameter +'}');
    }
}
