package capstone.team9.proof.repositories;

import capstone.team9.proof.models.Proofs;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProofRepository extends MongoRepository<Proofs, String> {
//    Proofs findByIdEquals(String id);
    @Query(value = "{'userSubmitted': ?0}")
    List<Proofs> findProofsByUser(String user);

}
