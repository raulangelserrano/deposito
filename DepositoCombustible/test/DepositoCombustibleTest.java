import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositoCombustibleTest {

/*	@Test
	void testDepositoCombustible() {
		fail("Not yet implemented");
	}*/

	@Test
	void testGetDepositoNivelRSS() {
		DepositoCombustible dep = new DepositoCombustible(2000,1000);
		double lev = dep.getDepositoNivel();
		assertEquals(1000,lev);
	}

	@Test
	void testGetDepositoMaxRSS() {
		DepositoCombustible dep = new DepositoCombustible(2000,1000);
		double max = dep.getDepositoMax();
		assertEquals(2000,max);
	}

	@Test
	void testEstaVacioRSS() {
		DepositoCombustible dep = new DepositoCombustible(2000,1000);
		boolean vac = dep.estaVacio();
		assertFalse(vac);
		
	}

	@Test
	void testEstaLlenoMitadRSS() {
		DepositoCombustible dep = new DepositoCombustible(2000,1000);
		double lev = dep.getDepositoNivel();
		double max = dep.getDepositoMax();
		assertEquals( max , lev*2 );
	}

	

	@Test
	void testFill() {
		fail("Not yet implemented");
	}

	@Test
	void testConsumir() {
		fail("Not yet implemented");
	}

}
