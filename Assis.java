package projetoyoutube;

//adding class 
public class Assis {
    private Userlog viewers;
    private Video movie;

    public Assis(Userlog viewers, Video movie) {
        this.setViewers(viewers);
        this.setMovie(movie);
        this.viewers.setTotAssis(this.viewers.getTotAssis() + 1);
        this.movie.setViews(this.movie.getViews() + 1);
    }
     
    public void evalua(){
        this.movie.setEvaluation(5);
    }
    public void evalua(int nota){
        this.movie.setEvaluation(nota);
    }
    public void evalua(float porc){
      int tot = 0;
       if (porc <= 20) {
           tot = 3;
       }else if (porc <= 50) {
           tot = 50;
       }else if (porc <= 90) {
           tot = 8;
       }else {
           tot = 10;
       }
       this.movie.setEvaluation(tot);
    }

    public Video getMovie() {
        return movie;
    }

    public void setMovie(Video movie) {
        this.movie = movie;
    }

    public Userlog getViewers() {
        return viewers;
    }

    public void setViewers(Userlog viewers) {
        this.viewers = viewers;
    }

    public String toString(){
     return "Assist{ " + " viewres = " + viewers + " movie = " + movie + "}" ;   
    } 
    
}