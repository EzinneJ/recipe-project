package ezinne.springframework.recipeproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.servlet.annotation.WebServlet;

@SpringBootApplication
@EntityScan("ezinne.springframework.domain")
public class RecipeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeProjectApplication.class, args);
	}

}
