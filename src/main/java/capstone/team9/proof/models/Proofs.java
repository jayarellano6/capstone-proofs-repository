package capstone.team9.proof.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.Date;

@Document(collection = "proofCheckerDb")
public class Proofs extends ProofCheckerDb {

    @Id
    private String id;
    private String entryType;
    private String userSubmitted;
    private String proofName;
    private String proofType;
    private String[] Premise;
    private String[] Logic;
    private String[] Rules;
    private  String proofCompleted;
    private Date timeSubmitted;
    private String Conclusion;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getUserSubmitted() { return userSubmitted; }

    public void setUserSubmitted(String userSubmitted) { this.userSubmitted = userSubmitted; }

    public String[] getPremise() { return Premise; }

    public void setPremise(String[] premise) { Premise = premise; }

    public String[] getLogic() { return Logic; }

    public void setLogic(String[] logic) { Logic = logic; }

    public String[] getRules() { return Rules; }

    public void setRules(String[] rules) { Rules = rules; }

    public String getConclusion() { return Conclusion; }

    public void setConclusion(String conclusion) { Conclusion = conclusion; }

    public String getProofCompleted() { return proofCompleted; }

    public void setProofCompleted(String proofCompleted) { this.proofCompleted = proofCompleted; }

    public Date getTimeSubmitted() { return timeSubmitted; }

    public void setTimeSubmitted(Date timeSubmitted) { this.timeSubmitted = timeSubmitted; }

    public String getProofName() { return proofName; }

    public void setProofName(String proofName) { this.proofName = proofName; }

    public String getEntryType() { return entryType; }

    public void setEntryType(String entryType) { this.entryType = entryType; }

    public String getProofType() {
        return proofType;
    }

    public void setProofType(String proofType) {
        this.proofType = proofType;
    }


    @Override
    public String toString() {
        return "Proofs{" +
                "id='" + id + '\'' +
                ", entryType='" + entryType + '\'' +
                ", userSubmitted='" + userSubmitted + '\'' +
                ", proofName='" + proofName + '\'' +
                ", Premise=" + Arrays.toString(Premise) +
                ", Logic=" + Arrays.toString(Logic) +
                ", Rules=" + Arrays.toString(Rules) +
                ", proofCompleted='" + proofCompleted + '\'' +
                ", timeSubmitted=" + timeSubmitted +
                ", Conclusion='" + Conclusion + '\'' +
                '}';
    }
}
