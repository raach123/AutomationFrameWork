package objectRepository;



	import org.testng.Assert;
	import org.testng.annotations.Test;
	
	public class HardAssertion {
	
		@Test
		public void strictLevelComparison() {
			String expecteddata="raja";
			String actualData="Raja";
			
			Assert.assertEquals(actualData, expecteddata);
			System.out.println("strick comaprson passed!!");

		}
		
		@Test
		public void containsLevelComparison() {
			String expecteddata="raja";
			String actualData="maharaja";
			
			Assert.assertTrue(actualData.contains(expecteddata));
			System.out.println("conteins Level comparison passed!!");
			
		}
	}

