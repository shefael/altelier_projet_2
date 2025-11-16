public class Main {
    public static void main(String[] args) {
        Texte texte = new Texte();
        Image image = new Image();

        texte.setNom("Atelier 3 " );
        texte.setAuteur("ELVIC et ARSENNE");
        image.setNom(" Diagramme UML ");
        image.setFormat_couluer(" Dessin ( noir et blanc )");

        System.out.println("le nom du text est : " +texte.getNom());
        System.out.println("le nom du image : " +image.getNom());
        System.out.println("les auteurs sont : " +texte.getAuteur());
        System.out.println("le forma de l'image est : " +image.getFormat_couluer());



    }
}