package tp_m_chaudet.personnages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GauloisTest {

    private Gaulois asterix;
    private Romain cesar ;

    @BeforeEach
    void setUp() {
        asterix = new Gaulois();
        cesar = new Romain();
    }

    @Test
    void testGetNom() {

        assertNotNull(asterix);
        assertEquals("", asterix.getNom());
    }
   /* @Test
    void testGetForce(){
        assertNotNull(asterix);

        assertEquals(0,asterix.getForce());
    }*/
    @Test
    void main(){
        asterix.nom="asterix" ;
        cesar.nom = "Cesar";
        cesar.force = 5 ;
        asterix.force = 20 ;
        asterix.parler("test");
        asterix.frapper(cesar);
        System.out.println(asterix.nom);

    }
}
