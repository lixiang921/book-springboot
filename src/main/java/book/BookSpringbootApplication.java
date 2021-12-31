package book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan({"book.dao"})
@SpringBootApplication
public class BookSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookSpringbootApplication.class, args);
	}

}
