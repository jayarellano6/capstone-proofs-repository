package capstone.team9.proof;

import capstone.team9.proof.models.Proofs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import capstone.team9.proof.repositories.ProofRepository;

@SpringBootApplication
public class ProofsApplication{

//	@Autowired
//	private ProofRepository proofRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProofsApplication.class, args);
	}

}
