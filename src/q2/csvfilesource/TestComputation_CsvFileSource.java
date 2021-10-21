package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {
   @ParameterizedTest
   @CsvFileSource(resources = "computation_dataset.csv")
   public void testGetDiscount(int input1, int input2, int expected) throws Exception {
	  Computation com = new Computation();
      int result = com.getDiscount(input1, input2); 
      Assert.assertEquals(expected, result);
   }
}
