package cleancode;
import static org.junit.Assert.*;
import org.junit.Test;
public class CalculateInterest {
	calculate_Interest calc=new calculate_Interest();
	@Test
	public void testSimpleIntrest(){
		assertEquals(100.0,calc.simpleIntrest(100, 1, 0),0);
	}
	public void testCompoundIntrest() {
		assertEquals(24.0,calc.compoundIntrest(1200, 1, 2),0);
	}

}
