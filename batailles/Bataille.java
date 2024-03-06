package tp_m_chaudet.batailles;

import tp_m_chaudet.personnages.Personnage;

public class Bataille {
    private String contexte;
    private Personnage[] combattants;

    public Bataille(String contexte, Personnage[] combattants) {
        this.contexte = contexte;
        this.combattants = combattants;
    }

    public void preparerCombat() {
        System.out.println("Préparation du combat en cours...");
    }

    public void decrireCombat() {
        StringBuilder description = new StringBuilder();
        description.append("Dans le contexte de ").append(contexte).append(", les combattants ");
        for (int i = 0; i < combattants.length; i++) {
            description.append(combattants[i].getNom());
            if (i < combattants.length - 1) {
                description.append(", ");
            }
        }
        description.append(" s'affrontent.");
        System.out.println(description.toString());
    }

    public void donnerResultat() {
        System.out.println("Le résultat de la bataille est...");
    }

    public String getContexte() {
        return contexte;
    }

    public Personnage[] getCombattants() {
        return combattants;
    }
}