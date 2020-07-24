package projetoyoutube;

public class Video implements Inter {
    private String titel;
    private int evaluation;
    private int views;
    private int like;
    private boolean play;

    @Override
    public void Play() {
     this.play = true;
    }

    public boolean isPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    @Override
    public void Pausa() {
       this.play = false;

    }

    @Override
    public void like() {
       this.like ++;
    }

    public Video(String titel) {
        this.titel = titel;
        this.evaluation = 1;
        this.views = 0;
        this.play = false;
        this.like = 0;
    }
   
    @Override
    public String toString(){
    return "Video { " + "titule = "+ titel + ", evaluation = " + evaluation + ", views = " + views + ", like = " + like + ", play = " + play ;   
    }
}