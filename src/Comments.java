import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Comments {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
