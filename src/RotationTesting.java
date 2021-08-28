import org.openqa.selenium.ScreenOrientation;
import org.testng.Assert;

public class RotationTesting extends DriverInit{
    public void landscapeMode(){
        ad.rotate(ScreenOrientation.LANDSCAPE);
        ScreenOrientation orientation = ad.getOrientation();

        System.out.println(orientation.toString());
        Assert.assertEquals(orientation.value(),"landscape");

    }
}
