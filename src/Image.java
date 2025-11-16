

public class Image extends Fichier {
    private String format_couluer;
    private double longue;
    private String couleur;
    private double lageur;
    private double resolution;

    public Image() {}
    public void setFormat_couluer(String format_couluer) {
        this.format_couluer = format_couluer;
    }
    public String getFormat_couluer() {
        return format_couluer;
    }
    public void setLongue(double longue) {
        this.longue = longue;
    }
    public double getLongue() {
        return longue;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setLageur(double lageur) {
        this.lageur = lageur;
    }
    public double getLageur() {
        return lageur;
    }
    public void setResolution(double resolution) {
        this.resolution = resolution;
    }
    public double getResolution() {
        return resolution;
    }



}