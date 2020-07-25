package cleancode;
import static org.junit.Assert.*;
import org.junit.Test;
public class CostTest {
	Cost cost=new Cost();
	@Test
	public void testCalculateCost() {
		assertEquals(2178000.0,cost.calculateCost(3,871.2, true),0);
	}
}
