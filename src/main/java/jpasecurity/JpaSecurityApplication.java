package jpasecurity;

import jpasecurity.model.Post;
import jpasecurity.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaSecurityApplication {
	public static void main(String[] args) {
		SpringApplication.run(JpaSecurityApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository postRepository){
		return args -> {
			postRepository.save(new Post("Hello!", "hello-world", "Welcome to my blog", "Dan Vega"));
		};
	}
}
