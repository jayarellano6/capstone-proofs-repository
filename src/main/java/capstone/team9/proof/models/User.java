package capstone.team9.proof.models;

import org.springframework.data.annotation.Id;

public class User extends  AbstractEntryClass{
    @Id
    private String id;
    private String entryType;
    private String username;
    private String email;
    private String password;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getEntryType() { return entryType; }

    public void setEntryType(String entryType) { this.entryType = entryType; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", entryType='" + entryType + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
