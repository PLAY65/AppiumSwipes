import org.openqa.selenium.Dimension;

import java.time.Duration;

public class ScreenReolutionTesting extends DriverInit{
    public void getResolution(){
        Dimension dimension = ad.manage().window().getSize();
        int screenWidth = dimension.getWidth();
        int screenHeight = dimension.getHeight();

        ad.runAppInBackground(Duration.ofSeconds(2));
        ad.launchApp();

        System.out.println("Width= "+screenWidth);
        System.out.println("Height= "+screenHeight);
    }
}
