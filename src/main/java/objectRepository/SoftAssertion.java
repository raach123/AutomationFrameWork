package objectRepository;


	import org.testng.Assert;
	import org.testng.asserts.SoftAssert;
	public class SoftAssertion {
	
		public void softAssertStrictComparison()
		{
			String expectedData="raja";
			String actualData="Raja";
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(actualData,expectedData);
			System.out.println("strict comparison passed!!");
			sa.assertAll();
		}
		public void softAssertContainsLevelComparison()
		{
			String expectedData="raja";
			String actualData="maharaja";
			SoftAssert sa=new SoftAssert();
			sa.assertTrue(actualData.contains(expectedData));
			System.out.println("contains comparison passed!!");
			sa.assertAll();
		}
	}


