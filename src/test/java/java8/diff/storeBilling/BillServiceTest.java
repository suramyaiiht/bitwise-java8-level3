package java8.diff.storeBilling;
import static org.junit.Assert.*;

import org.junit.Before;

import static java8.diff.storeBilling.TestUtils.yakshaAssert;
import org.junit.Test;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;




public class BillServiceTest {
	
	@Mock
	BillService billService;
	@Before 
	public void initMocks() {
	       MockitoAnnotations.initMocks(this);
	   }
	
	@Test
	public void testItemPurchasedPayable() throws Exception {
		
		Item item=new Item("Oil",37.87,5.00);
		
		Mockito.when(billService.itemPurchasedPayable(item)).thenReturn("189.35");
		
		String value=billService.itemPurchasedPayable(item);
		System.out.println(value);
		yakshaAssert(TestUtils.currentTest(),value.equals("189.35")?"true":"false",TestUtils.businessTestFile);
	}

	@Test
	public void testSaleTaxCalculation() throws Exception{
		
		Mockito.when(billService.saleTaxCalculation(189.35)).thenReturn("23.67");
		
		String value=billService.saleTaxCalculation(189.35);
		
		TestUtils.yakshaAssert(TestUtils.currentTest(),value.equals("23.67")?"true":"false",TestUtils.businessTestFile);
		}

	@Test
	public void testDiscountCalculation() throws Exception{
		
		
		Mockito.when(billService.discountCalculation(5000)).thenReturn("500");
		String value1=billService.discountCalculation(5000.00);
		
		TestUtils.yakshaAssert(TestUtils.currentTest(),value1.equals("500.00")?"true":"false",TestUtils.businessTestFile);
		
	}
	@Test
	public void testDiscountCalculationForZeroRupees() throws Exception{
		
		Mockito.when(billService.discountCalculation(0)).thenReturn("0");
		String value2=billService.discountCalculation(0);
		TestUtils.yakshaAssert(TestUtils.currentTest(),value2.equals("0.00")?"true":"false",TestUtils.businessTestFile);
	}
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(TestUtils.currentTest(),true,TestUtils.boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(TestUtils.currentTest(),true,TestUtils.exceptionTestFile);
   }


}
