

public class Texte extends Fichier {
    private String encodage;
    private String langue;
    private int nombreligne;
    private String auteur;
    private String logiciel_texte;

     public Texte(String encodage, String langue, int nombreligne, String auteur, String log) {
        this.encodage = encodage;
        this.langue = langue;
        this.nombreligne = nombreligne;
        this.auteur = auteur;
        this.logiciel_texte = log;
        this.auteur = auteur;

    }



    public Texte() {}
    public void setEncodage(String encodage) {
        this.encodage = encodage;
    }
    public String getEncodage() {
        return encodage;
    }
    public void setLangue(String langue) {
        this.langue = langue;
    }
    public String getLangue() {
        return langue;
    }
    public void setNombreligne(int nombreligne) {
        this.nombreligne = nombreligne;

    }
    public int getNombreligne() {
        return nombreligne;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }
}
