package EmbeddedSystemsLab.Lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories		// evtl. muss da noch ein pfad oder ähnliches hin
public class LabApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabApplication.class, args);
	}

}
