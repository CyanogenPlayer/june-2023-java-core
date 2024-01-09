package subtask2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Workstation extends Laptop {
    public Workstation(String cpu, String ramAmount, String gpu, String romAmount, String os, String monitor,
                       int battery, double weight) {
        super(cpu, ramAmount, gpu, romAmount, os, monitor, battery, weight);
    }

    @Override
    public String showInfo() {
        return "I'm big workstation laptop. You can work and play games on me!!!";
    }
}
