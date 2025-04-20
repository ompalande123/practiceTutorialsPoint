package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {

    private ExtentSparkReporter sparkReporter;
    private ExtentReports extent;
    private ExtentTest test;

    // Constructor
    public ExtentManager() {
        // To append current date and time to the report
        String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\test-results\\extentReport_"+timestamp+".html");
        sparkReporter.config().setDocumentTitle("Automation Extent Report");
        sparkReporter.config().setReportName("Tutorials Point Automation Report");
        sparkReporter.config().setTheme(Theme.STANDARD);

        extent=new ExtentReports();
        extent.attachReporter(sparkReporter);

    }

    // Methods
    public void extentCreateTest(String extentTestName){
        test=extent.createTest(extentTestName);
    }

    public void extentTestLog(Status st, String details){
        test.log(st, details);
    }

    public synchronized void extentFlush(){
        extent.flush();
    }



}
