package subtask2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Ultrabook extends Laptop {
    public Ultrabook(String cpu, String ramAmount, String gpu, String romAmount, String os, String monitor, int battery,
                     double weight) {
        super(cpu, ramAmount, gpu, romAmount, os, monitor, battery, weight);
    }

    @Override
    public String showInfo() {
        return "I'm ultrabook. You can work on me!!!";
    }
}
