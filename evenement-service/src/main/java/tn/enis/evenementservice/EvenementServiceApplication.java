package tn.enis.evenementservice;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.enis.evenementservice.dao.EvenementRepository;
import tn.enis.evenementservice.entity.Evenement;
import tn.enis.evenementservice.service.IEventService;

import java.util.Date;

@SpringBootApplication
@AllArgsConstructor
public class EvenementServiceApplication implements CommandLineRunner {

	IEventService iEventService ;

	public static void main(String[] args) {
		SpringApplication.run(EvenementServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



		Evenement evenement1 = Evenement.builder()
				.title("youssef mrith")
				.lieu("Monafrik")
				.date(new Date())
				.build();
		iEventService.addEvenement(evenement1);
		System.out.printf("added");


	}
}
