package subtask2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Laptop extends PC {
    private String monitor;
    private int battery;
    private double weight;

    public Laptop(String cpu, String ramAmount, String gpu, String romAmount, String os, String monitor, int battery,
                  double weight) {
        super(cpu, ramAmount, gpu, romAmount, os);
        this.monitor = monitor;
        this.battery = battery;
        this.weight = weight;
    }

    public String showInfo() {
        return "default laptop info";
    }
}
