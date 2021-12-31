package book.controller;
import book.dao.UserMapper;
import book.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class LoginController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping  ("/login")
    public User login(@RequestBody User user){
        User user1 = userMapper.getByUserMessage(user.getUsername(), user.getPassword());
        System.out.println(user1);
        return user1;
    }
}
