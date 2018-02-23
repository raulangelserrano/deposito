import static org.junit.Assert.*;
import java.util.*;
//import org.junit.*;

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class DepositoCombustibleTestParam2RSS {
	private double max;
	private double lev;
	private double consumir;
	private double res;

	public DepositoCombustibleTestParam2RSS(double m, double l,double c,double r) {
		max =m;
		lev = l;
		consumir = c;
		res = r;
	}
	
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {
			{2000,1000,500,500},{3000,2000,500,1500},{1000,800,200,600}
		});
		
	}
	
	@Test
	public void testConsumirRSS() {
		DepositoCombustible dep = new DepositoCombustible(max,lev);
		dep.consumir(consumir);
		double resultado = dep.getDepositoNivel();
		assertEquals(res,resultado,0);
	}
	
	
	
	

}


