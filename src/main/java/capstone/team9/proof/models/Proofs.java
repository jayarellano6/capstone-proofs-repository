package capstone.team9.proof.models;

import org.springframework.data.annotation.Id;

import java.util.Arrays;

public class Proofs {

    @Id
    private String id;
    private String[] Premise;
    private String[] Logic;
    private String[] Rules;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String[] getPremise() { return Premise; }

    public void setPremise(String[] premise) { Premise = premise; }

    public String[] getLogic() { return Logic; }

    public void setLogic(String[] logic) { Logic = logic; }

    public String[] getRules() { return Rules; }

    public void setRules(String[] rules) { Rules = rules; }

    @Override
    public String toString() {
        return "Proof{" +
                "Premise=" + Arrays.toString(Premise) +
                ", Logic=" + Arrays.toString(Logic) +
                ", Rules=" + Arrays.toString(Rules) +
                '}';
    }


}
