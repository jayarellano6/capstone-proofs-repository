package capstone.team9.proof;

import capstone.team9.proof.models.Proofs;
import capstone.team9.proof.models.User;
import capstone.team9.proof.repositories.ProofRepository;
import org.json.JSONArray;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

@CrossOrigin("*")
@RestController
public class ProofController {
    @Autowired
    ProofRepository proofRepository;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="saveproof", method=RequestMethod.POST)
    public boolean saveproof(@RequestBody String input){
        JSONObject jsonObject = new JSONObject(input);

        System.out.println(input);
        Proofs proof = new Proofs();

        proof.setEntryType(jsonObject.get("entryType").toString());
        proof.setUserSubmitted(jsonObject.get("userSubmitted").toString());
        proof.setProofName(jsonObject.get("proofName").toString());

        //converting the JSOArrays to String Arrays
        JSONArray arr = new JSONArray(jsonObject.getJSONArray("Premise").toString());
        String[] Premise = new String[arr.length()];
        for(int i = 0; i < arr.length(); i++){
            Premise[i] = arr.get(i).toString();
        }
        proof.setPremise(Premise);
        JSONArray arr2 = new JSONArray(jsonObject.getJSONArray("Logic").toString());
        String[] Logic = new String[arr2.length()];
        for(int i = 0; i < arr2.length(); i++){
            Logic[i] = arr2.get(i).toString();
        }
        proof.setLogic(Logic);
        JSONArray arr3 = new JSONArray(jsonObject.getJSONArray("Rules").toString());
        String[] Rules = new String[arr3.length()];
        for(int i = 0; i < arr3.length(); i++){
            Rules[i] = arr3.get(i).toString();
        }
        proof.setRules(Rules);
        //done with array converting

        proof.setProofCompleted(jsonObject.get("proofCompleted").toString());
        proof.setConclusion(jsonObject.get("conclusion").toString());
        Date date = new Date();
        proof.setTimeSubmitted(date);

        proofRepository.insert(proof);
        return true;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value="newuser", method=RequestMethod.POST)
    public boolean newUser(@RequestBody String input){
        JSONObject jsonObject = new JSONObject(input);

        System.out.println(input);
        User user = new User();

        user.setEntryType(jsonObject.get("entryType").toString());
        user.setUsername(jsonObject.get("username").toString());
        user.setEmail(jsonObject.get("email").toString());
        user.setPassword(jsonObject.get("password").toString());

        proofRepository.save(user);
        return true;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("user/{user}")
    public List<Proofs> getProofsByUser(@PathVariable String user){
        List<Proofs> pList = proofRepository.findProofsByUser(user);
        return pList;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("getall/{user}")
    public List<User> getAllUsers(@PathVariable String user){
        List<User> uList = proofRepository.getAllUsers(user);
        return uList;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("li/{username}")
    public User userLogin(@PathVariable String username){
        User retUser = proofRepository.getUserByUsername(username);
        return retUser;
    }

}
