package co.box.giga;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@MapperScan(basePackages = "co.box.giga.**.mapper")
@SpringBootApplication
public class GigaboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(GigaboxApplication.class, args);
	}

	// 메인화면
	@GetMapping("/")
	public String main() {
		return "main/main";
	}

}
