package learningtestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Atomation {
@BeforeSuite
public void beforesuiteAnnotation() {
	System.out.println("This is Before suite");
}
@BeforeTest
public void beforetestAnnotation() {
	System.out.println("this is before test");
}
@BeforeClass
public void beforeclassAnnotation() {
	System.out.println("this is before class");
	
}
@BeforeMethod
public void beforemethodAnnotation () {
	System.out.println("this is before method");
}
@Test
public void testcase1Annotation() {
	System.out.println("this is test case1");
}
@Test
public void testcase2Annotation() {
System.out.println("this is test case2");
}
@AfterMethod
public void aftermethodAnnotation() {
	System.out.println("this is after method");
	
}
@AfterClass
public void afterclassAnnotation(){
	System.out.println("this is after class ");
}
@AfterTest
public void aftertestAnnotation() {
	System.out.println("this is after test");
}
@AfterSuite
public void aftersuiteAnnotation() {
	System.out.println("this is after suite");
}
}


