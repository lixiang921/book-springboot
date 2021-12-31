package book.pojo;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "user")
public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    private String role;//角色
    private boolean state;//状态

}
