package projetoyoutube;

public abstract class Users{
      protected String nome;
      protected int idade;
      protected String sexo;
      protected float experiencia;

      public void setNome(String nome){
          this.nome =  nome;
      }
      public String getNome(){
          return nome;
      }
      public void setIdade(int idade){
          this.idade = idade;
      }
      public int getIdade(){
          return idade;
      }
      public void setSexo(String sexo){
          this.sexo = sexo;
      }
      public String getSexo(){
          return sexo;
      }
      public void setExperiencia(float experiencia){
          this.experiencia = experiencia;
      }
      public float getExperiencia(){
          return experiencia;
      }


      public Users(String nome, int idade, String sexo) {
          this.nome = nome;
          this.idade = idade;
          this.sexo = sexo;
          this.experiencia = 0;
      }

}