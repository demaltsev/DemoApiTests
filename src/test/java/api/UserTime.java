package api;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class UserTime

{
    private String name;
    private String job;

    public UserTime(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public UserTime () {

    }
}
