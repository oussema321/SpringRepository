package tn.enis.menbreservice;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.enis.menbreservice.dao.MemberRepository;
import tn.enis.menbreservice.entity.EnseignantChercheur;
import tn.enis.menbreservice.entity.Etudiant;
import tn.enis.menbreservice.entity.Membre;

import java.util.Date;


@SpringBootApplication
@AllArgsConstructor
public class MenbreServiceApplication implements  CommandLineRunner {

	MemberRepository memberRepository;

	public static void main(String[] args) {
		SpringApplication.run(MenbreServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Etudiant etudiant1 =Etudiant.builder()
				.cin("123456")
				.dateInscription(new Date()).dateNaissance(new Date())
				.diplome("mastère")
				.email("etd1@gmail.com")
				.password("pass1")
				.encadrant(null)
				.cv("cv1")
				.nom("abid")
				.prenom("youssef")
				.sujet("blockhain")
				.build();
		memberRepository.save(etudiant1);

		Etudiant etudiant2 =Etudiant.builder()
				.cin("523456")
				.dateInscription(new Date()).dateNaissance(new Date())
				.diplome("doctora")
				.email("etd2@gmail.com")
				.password("pass1")
				.encadrant(null)
				.cv("cv2")
				.nom("gassara")
				.prenom("oussema")
				.sujet("blockhain")
				.build();
		memberRepository.save(etudiant2);

		EnseignantChercheur enseignantChercheur1 = EnseignantChercheur.builder()
				.cin("999999")
				.dateNaissance(new Date()).dateNaissance(new Date())
				.email("enseignat1@gmail.com")
				.password("pass1")
				.etudent(null)
				.cv("cv3")
				.nom("elleuch")
				.prenom("mohamed ali")
				.etablissement("")
				.grade("chef departement")
				.build();

		memberRepository.save(enseignantChercheur1);

		EnseignantChercheur enseignantChercheur2 = EnseignantChercheur.builder()
				.cin("222222")
				.dateNaissance(new Date()).dateNaissance(new Date())
				.email("enseignat2@gmail.com")
				.password("pass2")
				.etudent(null)
				.cv("cv4")
				.nom("boujelben")
				.prenom("marwen")
				.etablissement("")
				.grade("chef departement")
				.build();

		memberRepository.save(enseignantChercheur2);

		Iterable<Membre> membres = memberRepository.findAll();

		for (Membre membre : membres) {
			System.out.println(membre);
		}


		// rechercher un membre by id
		Long memberId1 = 1L;
		Membre membre1 = memberRepository.findById(memberId1).orElse(null);
		System.out.println(membre1);

		Long membreId2 = 2L ;
		Membre membre2 = memberRepository.findById(membreId2).orElse(null);
		System.out.println(membre2);


		// modifier le membre numero 1
		if (membre1 != null) {
			membre1.setNom("NouveauNom");
			memberRepository.save(membre1);
			System.out.println("Membre modifié : " + membre1);
		}else {
			System.out.println("didnt acccess");
		}


		// deleted membrer
		Long memberdelet1 = 3L;
		memberRepository.deleteById(memberdelet1);
		System.out.println("membre deleted successfuly");
	}
}
