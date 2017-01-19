package webhook.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import webhook.app.Application;
@Configuration
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@EnableScheduling
@Component
@ComponentScan(basePackages = "webhook.app")
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
		System.out.println("Done..!!");

	}

}
