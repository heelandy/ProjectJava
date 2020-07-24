package projetoyoutube;

public class Video implements inter {
    private String titel;
    private int avaliation;
    private int views;
    private int like;
    private boolean play;

    @Override
    public void Play() {

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

    public int getAvaliation() {
        return avaliation;
    }

    public void setAvaliation(int avaliation) {
        this.avaliation = avaliation;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    @Override
    public void Pausa() {
       

    }

    @Override
    public void like() {
       
    }

    public Video(String titel) {
        this.titel = titel;
        this.avaliation = 1;
        this.views = 0;
        this.play = false;
        this.like = 0;
    }
   
}