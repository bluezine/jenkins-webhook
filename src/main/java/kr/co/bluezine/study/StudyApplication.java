package kr.co.bluezine.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) {
		System.out.println("Hello WebHook Test");
		SpringApplication.run(StudyApplication.class, args);
	}

}
