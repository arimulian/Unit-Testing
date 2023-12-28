package armul.java.junit;

import org.junit.jupiter.api.*;


@Tag("Calculator Test")
class CalculatorTest {

	private final Calculator calculator = new Calculator();

	@BeforeAll
	static void BeforeAll(){
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void AfterAll(){
		System.out.println("AfterAll");
	}


	@BeforeEach
	void  setUp(){
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown(){
		System.out.println("After Each");
	}

	@Test
	@DisplayName("Test susses method add(int, int)")
	 void testAddSuccess(){
//		if(result != 20){
//			throw new AssertionError("Test failed);
//		}

		var result = calculator.add(10,10);
		Assertions.assertEquals(20, result);

	}

	@Test
	@DisplayName("Test return throws exception method divide(int, int)")
	void testDivideThrow(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		calculator.divide(10,0);
		});
	}

	@Test
	@Disabled
	void TestComingSoon(){
		// TODO ComingSoon Test
	}


	@Test
	void testAborted(){
		Assumptions.assumeTrue("DEV".equals(System.getenv("PROFILE")));
	}

}
