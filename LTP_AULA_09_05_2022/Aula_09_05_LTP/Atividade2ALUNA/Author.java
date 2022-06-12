package Aula_09_05_LTP.Atividade2ALUNA;
public class Author{
    private String name, email;
    private char gender;

    public void Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Author[name = " + this.name + ", email = " + this.email + ", gender = " + this.gender + "]";
    }
    



    
}