package cn.tju.swtest.hw3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import cn.tju.swtest.hw3.homework3;
import junit.framework.Assert;
class homework3Test {
	homework3 hw3 = new homework3();
	@Test
	void test() {
		String test1 = "2 3 5 ";
		Assert.assertEquals(test1, hw3.printPrimes(3));
	}

}