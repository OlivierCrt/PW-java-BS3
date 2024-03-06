package tp_m_chaudet.batailles;


import tp_m_chaudet.personnages.Gaulois;
import tp_m_chaudet.personnages.Grade;
import tp_m_chaudet.personnages.Soldat;
import tp_m_chaudet.sites.Camp;
import tp_m_chaudet.sites.Village;

public class BatailleTest {

    public static void main(String[] args) {
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
        Village village = new Village(abraracourcix,0);

        Gaulois agecanonix = new Gaulois("Agecanonix", 1);
        Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
        Gaulois asterix = new Gaulois("Asterix", 5);
        Gaulois obelix = new Gaulois("Obelix", 15);
        Gaulois cetautomatix = new Gaulois("Cetautomatix", 8);
        Gaulois ordralfabetix = new Gaulois("Ordralfabetix", 8);

        village.addVillageois(agecanonix);
        village.addVillageois(assurancetourix);
        village.addVillageois(asterix);
        village.addVillageois(obelix);
        village.addVillageois(cetautomatix);
        village.addVillageois(ordralfabetix);

        Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);
        Camp camp = new Camp(chorus,0);

        Soldat minus = new Soldat("Minus", 2, Grade.SOLDAT);
        Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
        Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
        Soldat tullius = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
        Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);
        Soldat quintilius = new Soldat("Quintilius", 2, Grade.SOLDAT);

        camp.addsoldat(brutus);
        camp.addsoldat(milexcus);
        camp.addsoldat(tullius);
        camp.addsoldat(ballondebaudrus);
        camp.addsoldat(minus);
        camp.addsoldat(quintilius);


        Conteur goscinny=new Conteur("Goscinny");
        Embuscade yo= new Embuscade(village, camp);
        goscinny.raconterHistoire(yo, village.getHabitants(), camp.getSoldats());

    }

}