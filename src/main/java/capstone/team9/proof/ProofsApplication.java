package capstone.team9.proof;

import capstone.team9.proof.models.Proofs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import capstone.team9.proof.repositories.ProofRepository;

@SpringBootApplication
public class ProofsApplication implements CommandLineRunner{

	@Autowired
	private ProofRepository proofRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProofsApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		Proofs p1 = new Proofs();
		String prem[] = {"Q ↔ R"};
		String log[] = {"R"};
		String rul[] = {"↔E 1, 2"};
		p1.setPremise(prem);
		p1.setLogic(log);
		p1.setRules(rul);
		proofRepository.save(p1);

	}

}
