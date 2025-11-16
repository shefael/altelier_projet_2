

public class Audio extends Fichier{
    private double frenquence;
    private double dure;
    private String source;
    private String artise;
    private String public_clible;

    public Audio(){}
    public void setFrenquence(double frenquence){
        this.frenquence = frenquence;
    }
    public double getFrenquence(){
        return this.frenquence;
    }
    public void setDure(double dure){
        this.dure = dure;
    }
    public double getDure(){
        return this.dure;
    }
    public void setSource(String source){
        this.source = source;
    }
    public String getSource(){
        return this.source;
    }
    public void setArtise(String artise){
        this.artise = artise;
    }
    public String getArtise(){
        return this.artise;
    }
    public void setPublic_clible(String public_clible){
        this.public_clible = public_clible;
    }
    public String getPublic_clible(){
        return this.public_clible;
    }


}
