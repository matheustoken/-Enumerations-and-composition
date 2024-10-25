package Entities;

public class Addres {
    private String email;
    private String telefone;

    public Addres(){
    }

    public Addres(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String gettelefone() {
        return telefone;
    }

    public void setPhone(String telefone) {
        this.telefone = telefone;
    }
}
