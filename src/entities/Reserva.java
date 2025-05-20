package entities;

public class Reserva {

    private String nome;
    private String email;

    //Cosntrutor padrão
    public Reserva (){

    }
    //Construtor
    public Reserva(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return nome +" , "+ email;
    }
}
