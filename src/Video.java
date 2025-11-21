

public class Video extends Fichier {
    private double dure;
    private String resolution;
    private String camera;
    private String acteur;
    private String realisateur;

    public Video(String camera, String acteur, String realisateur) {
        this.camera = camera;
        this.acteur = acteur;
        this.realisateur = realisateur;
        this.dure = dure;
        this.resolution = resolution;
    }

    public Video (){}
    public void setdure(double dure) {
        this.dure = dure;
    }
    public double  getdure() {
        return dure;
    }
    public void setresolution(String resolution) {
        this.resolution = resolution;
    }
    public String getresolution() {
        return resolution;
    }
    public void setcamera(String camera) {
        this.camera = camera;
    }
    public String getcamera() {
        return camera;
    }
    public void setacteur(String acteur) {
        this.acteur = acteur;
    }
    public String getacteur() {
        return acteur;
    }
    public void setrealisateur(String realisateur) {
        this.realisateur = realisateur;
    }
    public String getrealisateur() {
        return realisateur;
    }





}
