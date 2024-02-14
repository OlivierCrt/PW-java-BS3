package tp_m_chaudet.personnages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GauloisTest {

    private Gaulois asterix;
    private Gaulois obelix ;
    private Soldat minus ;
    private Druide panoramix;
    private Gaulois assurancetourix ;
    private  Gaulois abraracourcix;
    private Gaulois agecononix ;


    @BeforeEach
    void setUp() {
        asterix = new Gaulois("asterix" , 2);
        minus = new Soldat("Minus" , 6,Grade.SOLDAT);
        panoramix = new Druide("Panoramix" , 0) ;
        obelix = new Gaulois("Obélix",5);
        assurancetourix = new Gaulois("Assurancetourix",5);
        agecononix = new Gaulois("Agecanonix",5);
        abraracourcix = new Gaulois("Abraracourcix", 5);

    }

    /*@Test
    void testGetNom() {

        assertNotNull(asterix);

    }*/
   /* @Test
    void testGetForce(){
        assertNotNull(asterix);

        assertEquals(0,asterix.getForce());
    }*/
    @Test
    void main(){
        minus.equiperEquipement("bouclier");
        minus.equiperEquipement("casque");
        minus.equiperEquipement("plastron");
        panoramix.fabriquerPotion(3);
        panoramix.donnerPotion(asterix);
        panoramix.donnerPotion(abraracourcix);
        panoramix.donnerPotion(obelix);
        panoramix.donnerPotion(assurancetourix);
        panoramix.donnerPotion(agecononix) ;
        asterix.parler("Salut à tous");
        minus.parler("Des gaulois! Je suis dans la sauce.");
        System.out.println(minus.force);
        asterix.frapper(minus);
        System.out.println(minus.force);
        asterix.frapper(minus);
        minus.frapper(asterix);

    }
}
