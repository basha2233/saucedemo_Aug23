package util;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.IReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.Testbase;
public class Testlistener implements ITestListener
{

	public void onTestStart(ITestResult result) {
		System.out.println("onStart method started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(" method pass");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(" method fail");
		//Extent
		 try {
			webutils.test.log(LogStatus.INFO,"Screenshot -> "+ webutils.test.addScreenCapture(webutils.getScreenshot(Testbase.driver,"screenshotName")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(" method skip");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
	System.out.println("Start");
	
		
	}
	public void onFinish(ITestContext context) {
		
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}