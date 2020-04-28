package fr.univlyon1.m1if.m1if03.classes;
import java.util.ArrayList;


public class Billet {
    private String titre, contenu, auteur;
    private ArrayList<Commentaire> lesCommentaires;

    public Billet() {
        this.titre = "Rien";
        this.contenu = "Vide";
        this.auteur = "Personne";
        this.lesCommentaires = new ArrayList<Commentaire>();
        lesCommentaires.add(new Commentaire(""));
    }

    public Billet(String titre, String contenu, String auteur, ArrayList<Commentaire> lesCommentaires) {
        this.titre = titre;
        this.contenu = contenu;
        this.auteur = auteur;
        this.lesCommentaires = lesCommentaires;
    }

    public String getTitre() {
        return titre;
    }
    
    public ArrayList<Commentaire> getLesCommentaires(){
    	return this.lesCommentaires;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    
    public void addCommentaire(String leCom) {
    	Commentaire unCommentaire = new Commentaire(leCom);
    	lesCommentaires.add(unCommentaire);
    }
}
