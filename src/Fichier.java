import java.time.LocalDate;

public class Fichier {
    private String nom;
    private LocalDate date_creattion;
    private double taille;
    private String type;
    private String chemin;

    public Fichier(String nom, LocalDate date_creation, double taille) {
        this.nom = nom;
        this.date_creattion = date_creation;
        this.taille = taille;
        this.type = type;
        this.chemin = chemin;

    }

    public Fichier() {}
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public void setDate_creation(String date_creation) {
        this.date_creattion = date_creattion;
    }
    public LocalDate getDate_creation() {
        return date_creattion;
    }
    public void setTaille(double taille) {
        this.taille = taille;
    }
    public double getTaille() {
        return taille;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setChemin(String chemin) {
        this.chemin = chemin;
    }
    public String getChemin() {
        return chemin;
    }




}
