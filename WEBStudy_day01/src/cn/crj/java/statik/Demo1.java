package cn.crj.java.statik;

import org.junit.Test;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


//静态导入
public class Demo1 {
	@Test
	public void test(){
		double r=2.3;
//		System.out.println("圆的面积："+Math.PI*r*r);
		System.out.println(PI*pow(r,2));
	}
}
