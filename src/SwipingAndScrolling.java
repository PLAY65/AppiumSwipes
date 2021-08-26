import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.awt.*;
import java.time.Duration;

public class SwipingAndScrolling extends DriverInit{

    public void testingHorizontalSwipe() throws InterruptedException {
        MobileElement activeScreen = (MobileElement) ad.findElementById("android:id/list");

        Dimension dimension = activeScreen.getSize();
        int vertical = activeScreen.getSize().getHeight()/2;

        Double startSwipe = dimension.getWidth()*0.9;
        int horizontalStart = startSwipe.intValue();

        Double endSwipe = dimension.getWidth()*0.1;
        int horizontalEnd = endSwipe.intValue();

        new TouchAction(ad)
                .press(PointOption.point(horizontalStart,vertical))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(horizontalEnd,vertical))
                .release().perform();

        Thread.sleep(3000);


    }


}
