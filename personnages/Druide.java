package tp_m_chaudet.personnages;
import java.security.SecureRandom;
public class Druide extends Gaulois{
    private int quantitePotion = 0;

    public Druide(String nom ,int force){
        super(nom , force) ;

    }


    public void fabriquerPotion(int quantitepotion  ){
        this.quantitePotion = this.quantitePotion + quantitepotion ;
        SecureRandom random = new SecureRandom();
        this.puissancePotion = random.nextInt(5) +2;
        System.out.println("Le "+donnerAuteur() + " "+getNom()+" : "+"J'ai concocté "+this.quantitePotion +" doses de potion magique. Elle a une force de "+this.puissancePotion);

    }
    public boolean donnerPotion(Gaulois gogo){
        if(gogo.nom.equals("Obélix")){
            System.out.println("Tu ne peux pas boire la potion Obélix!");
            return false ;
        }
        else if(this.quantitePotion == 0){
            System.out.println("Il ne reste pas une goutte de potion pour toi "+gogo.getNom());
            return false ;
        }
        else {
            System.out.println("Tiens "+gogo.nom +" un peu de potion magique.");
            gogo.setSousPotion(true);
            gogo.setPuissancePotion(this.puissancePotion);
            this.quantitePotion-- ;
            return true ;
        }
    }


    @Override
    protected String donnerAuteur() {
        return "druide";
    }
}





