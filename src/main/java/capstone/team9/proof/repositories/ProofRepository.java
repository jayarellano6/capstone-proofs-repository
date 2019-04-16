package capstone.team9.proof.repositories;

import capstone.team9.proof.models.Proofs;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProofRepository extends MongoRepository<Proofs, String> {
    @Query(value = "{'id':?0}")
    Proofs findByRepoId(String id);

    @Query (value = "{'username.username':?0}")
    Proofs findByUsername(String username);
}
