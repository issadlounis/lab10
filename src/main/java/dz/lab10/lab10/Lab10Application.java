package dz.lab10.lab10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab10Application implements CommandLineRunner {
	@Autowired
	PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab10Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.findAll().forEach(System.out::println);
	}
}
