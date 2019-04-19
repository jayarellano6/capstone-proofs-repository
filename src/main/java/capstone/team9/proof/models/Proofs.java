package capstone.team9.proof.models;

import org.springframework.data.annotation.Id;

import java.util.Arrays;
import java.util.Date;

public class Proofs {

    @Id
    private String id;
    private String entryType;
    private String userSubmitted;
    private String proofName;
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

    @Override
    public String toString() {
        return "Proofs{" +
                "id='" + id + '\'' +
                ", Premise=" + Arrays.toString(Premise) +
                ", Logic=" + Arrays.toString(Logic) +
                ", Rules=" + Arrays.toString(Rules) +
                ", Conclusion='" + Conclusion + '\'' +
                '}';
    }

}
