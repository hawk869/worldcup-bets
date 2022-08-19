package danielesteban.com.worldcupapi.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class AppUser implements Serializable {

    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;


    private static final long serialVersionUID = 36L;
}
