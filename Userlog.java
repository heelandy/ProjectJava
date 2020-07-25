package projetoyoutube;

public class Userlog extends Users {
    private String login;
    private int totAssis;
  
    public Userlog(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
      this.login = login;
      this.totAssis = 0;
    }

    public String getLogin() {
        return login;
    }

    public int getTotAssis() {
        return totAssis;
    }

    public void setTotAssis(int totAssis) {
        this.totAssis = totAssis;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString(){
     return "User { " + super.toString() +  "\nnome = " + nome + ", idade = " + idade + ", sexo = " + sexo + ", login = " + login + " }\n" ;
    }
     



}