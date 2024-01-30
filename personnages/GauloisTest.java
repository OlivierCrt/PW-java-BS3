package tp_m_chaudet.personnages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GauloisTest {

    private Gaulois asterix;
    private Romain cesar ;

    @BeforeEach
    void setUp() {
        asterix = new Gaulois("asterix" , 5);
        cesar = new Romain("cesar" , 5);
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
        asterix.parler("Salut à tous");
        cesar.parler("Des gaulois! Je vais perdre");
        asterix.frapper(cesar);
        System.out.println(asterix.nom);

    }
}
