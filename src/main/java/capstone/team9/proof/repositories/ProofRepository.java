package capstone.team9.proof.repositories;

import capstone.team9.proof.models.Proofs;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProofRepository extends MongoRepository<Proofs, String> {
    Proofs findByIdEquals(String id);
    //comment
}
