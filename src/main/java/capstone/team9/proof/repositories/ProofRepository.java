package capstone.team9.proof.repositories;

import capstone.team9.proof.models.Proofs;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProofRepository extends MongoRepository<Proofs, String> {
//    Proofs findByIdEquals(String id);
}
