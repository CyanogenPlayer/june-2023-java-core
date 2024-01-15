package subtask2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Instrument> instruments = new ArrayList<>();

        instruments.add(new Tube(1.8));
        instruments.add(new Guitar(7));
        instruments.add(new Drum("big"));

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
