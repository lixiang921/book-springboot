package book.dao;

import book.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getByUserMessage(@Param("username")String username,
                          @Param("password") String password);
}
