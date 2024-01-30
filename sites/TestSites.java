package tp_m_chaudet.sites;

import tp_m_chaudet.personnages.Gaulois;
import tp_m_chaudet.personnages.Grade;
import tp_m_chaudet.personnages.Soldat;

public class TestSites {

    public static void main(String[] args) {

        Gaulois vercingetorix = new Gaulois("Vercingérorix", 5);
        Village lagaule = new Village(vercingetorix,0);
        Soldat minus = new Soldat("Minus", 2, Grade.SOLDAT);
        Camp lecamp = new Camp(minus , 0);
        lagaule.getChef().parler("Je suis un grand guerrier et je vais créer mon village");
        lecamp.getCommandant().parler("Je suis en charge de créer un nouveau camp romain");

        Gaulois agecanonix = new Gaulois("Agecanonix", 1);
        Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
        Gaulois asterix = new Gaulois("Astérix", 5);
        Gaulois obelix = new Gaulois("Obélix", 15);
        Gaulois prolix = new Gaulois("Prolix", 2);

        Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
        Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
        Soldat tullius = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
        Soldat ballon = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);

        lagaule.addVillageois(agecanonix);
        lagaule.addVillageois(assurancetourix);
        lagaule.addVillageois(asterix);
        lagaule.addVillageois(obelix);
        lagaule.addVillageois(prolix);

        lecamp.addsoldat(brutus);
        lecamp.addsoldat(milexcus);
        lecamp.addsoldat(tullius);
        lecamp.addsoldat(ballon);

        lagaule.afficherVillage();
        lecamp.afficherCamp();

        Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
        Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);

        lecamp.changerCommandant(briseradius);
        lecamp.changerCommandant(chorus);
        lagaule.changerChef(abraracourcix);
    }
}