package com.Dome;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dometest {
    @Test
    public void TestCase1(){
      System.out.print("这是测试用例测试1");
    }
    @BeforeMethod
    public void beforeMethod(){

        System.out.println("测试之前运行");
    }
}
