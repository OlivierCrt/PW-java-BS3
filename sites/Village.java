package tp_m_chaudet.sites;

import tp_m_chaudet.personnages.Gaulois;

public class Village {
    protected Gaulois[] habitants =new Gaulois[50];
    protected  Gaulois chef ;
    protected int nbhabitant ;

    public Village(Gaulois chef,int nbhabitant ){
        this.chef = chef ;
        this.nbhabitant = nbhabitant ;

    }
    public void addVillageois(Gaulois villageois) {
        if (nbhabitant == 4) {chef.parler("Désolé "+ villageois.getNom()+" mon village est deja bien rempli." );}
        else {
            this.habitants[nbhabitant] = villageois;
            nbhabitant++;
            chef.parler("Bienvenue " + villageois.getNom());
        }
    }

    public void afficherVillage() {
        System.out.println("Le village de " + chef.getNom() +" est habité par: ");
        for (int i=0;i<nbhabitant;i++) {
            System.out.println("- "+ this.habitants[i].getNom());
        }
    }

    public void changerChef(Gaulois gaulois) {
        this.chef.parler("Je laisse mon grand bouclier au grand Abraracourcix");
        this.chef= gaulois;
        this.chef.parler("Merci !");
    }
    public Gaulois getChef() {return chef;}





}
