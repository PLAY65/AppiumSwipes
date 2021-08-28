import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestingListners extends DriverInit implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test-case started!!!");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test-case finished successfully!!!");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ad.quit();
    }
}
