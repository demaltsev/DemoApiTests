package api;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class UnsuccessReg {

    private String error;

    public UnsuccessReg(String error) {
        this.error = error;
    }

    public UnsuccessReg() {
    }
}
