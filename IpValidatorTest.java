package test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.util.IpValidator;

public class IpValidatorTest {

  @Test
  public void validate() {
	  IpValidator valid = new IpValidator();
	  long ms = System.currentTimeMillis();
		List<String> invalidAddr = valid.validate();
		System.out.println("time taken-----"+(System.currentTimeMillis() - ms));
		for (String string : invalidAddr) {
			System.out.println("invalid--"+string);	
			}
		Assert.assertEquals(invalidAddr.get(0), "10.10.10");
  }
}
