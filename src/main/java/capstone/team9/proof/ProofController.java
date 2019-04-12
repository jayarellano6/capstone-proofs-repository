package capstone.team9.proof;

import capstone.team9.proof.models.Proofs;
import capstone.team9.proof.repositories.ProofRepository;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Date;

@RestController
public class ProofController {

    @Autowired
    ProofRepository proofRepository;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="saveproof", method=RequestMethod.POST)
    public boolean saveproof(@RequestBody String input){
        JSONObject jsonObject = new JSONObject(input);

        Proofs proof = new Proofs();

        proof.setId(jsonObject.get("id").toString());
        proof.setUserSubmitted(jsonObject.get("id").toString());

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

        Date date = new Date();
        proof.setTimeSubmitted(date);

        proofRepository.save(proof);
        return true;
    }
}
