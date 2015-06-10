package cn.crj.java.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo2 {

	@Before
	public void setUp() throws Exception {
		System.out.println("setup()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardown()");
	}

	@Test
	public void test() {
		System.out.println("test()");
	}

}
