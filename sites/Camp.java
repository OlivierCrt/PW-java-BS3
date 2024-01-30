package tp_m_chaudet.sites;

import tp_m_chaudet.personnages.Grade;
import tp_m_chaudet.personnages.Soldat;

public class Camp {
    protected Soldat commandant;
    protected Soldat[] soldats= new Soldat[80];
    protected int nbsoldat ;
    public Camp(Soldat commandant , int nbhab){
        this.commandant = commandant ;
        this.nbsoldat = nbhab ;
    }
    public void addsoldat(Soldat soldat) {
        if (nbsoldat == 3) {commandant.parler("Désolé "+ soldat.getNom()+" mon camp est complet !");}
        else{
            this.soldats[nbsoldat] = soldat;
            nbsoldat++;
            soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par "+ commandant.getNom());

        }
    }

    public void afficherCamp() {
        System.out.println("Le camp dirigé par " + commandant.getNom() +" contient les soldats : ");
        for (int i=0;i<nbsoldat;i++) {
            System.out.println("- "+ this.soldats[i].getNom());
        }
    }

    public void changerCommandant(Soldat commandant) {
        if (commandant.getGrade()!= Grade.CENTURION) {
            commandant.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.");
        }
        else {
            this.commandant=commandant;
            commandant.parler("Moi "+commandant.getNom()+ (" je prends la direction du camp romain."));
        }
    }
    public Soldat getCommandant() {return commandant;}
}
