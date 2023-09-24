package api;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class SuccessReg {
    private Integer id;
    private String token;

    public SuccessReg(int id, String token) {
        this.id = id;
        this.token = token;
    }

    public SuccessReg() {

    }
}
