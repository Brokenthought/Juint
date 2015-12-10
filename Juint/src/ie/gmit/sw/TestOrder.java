package ie.gmit.sw;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOrder {

	private Order order = null;
	@Before	
	public void setup(){//set up the test fixture{	 
		order = new Order();
	}
	@After
	public void tearDown(){
		order = null;
	}
	
	@Test
	public void validOrderNumber() throws Exception
	{
		order.setOrderNumber("AA-123-89");
		assertNotNull(order.getOrderNumber());
	}
	@Test//(expected_Exception class)
	public void nullOrderNumber() throws Exception
	{
		order.setOrderNumber(null);
	}
	@Test
	public void addValidLineItem(){
		int count = order.itemCount();
		//order.addItem("AA-123-89", partName, quantity, price);
		assertTrue(order.itemCount() == count +1 );
	}

}
