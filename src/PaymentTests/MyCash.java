package PaymentTests;

import org.testng.annotations.Test;

public class MyCash {

	@Test(priority = 6)
	public void myCasheSale_1() {
		System.out.println("i am # 1 the last one");

	}

	@Test(priority = 3)
	public void myCasheSale_2() {
		System.out.println("i am # 2 the middle one");


	}

	@Test(priority = 1)
	public void myCasheSale_3() {
		System.out.println("i am # 3 the first one");


	}

	@Test(priority = 2)
	public void myCasheSale_4() {
		System.out.println("i am # 4 the second one");


	}

	@Test(priority = 4)
	public void myCasheSale_5() {
		System.out.println("i am # 5 the one in the forth place ");


	}

	@Test(priority = 5)
	public void myCasheSale_6() {
		System.out.println("i am # 6 the one before the last one");


	}

}
