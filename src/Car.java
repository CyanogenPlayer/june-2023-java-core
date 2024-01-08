import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@ToString(exclude = {"turbo"})
// АБО
@ToString
public class Car {
    private String model;
    private int power;
    private int volume;
    @ToString.Exclude
    private boolean turbo;
}
