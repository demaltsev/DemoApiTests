package api;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Register {

    private String email;
    private String password;

    public Register(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public Register(){

    }
}
