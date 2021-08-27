import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

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

    public void testingVerticalSwipe() throws InterruptedException {
        MobileElement activeScreen = (MobileElement) ad.findElementById("android:id/list");

        Dimension dimension = activeScreen.getSize();
        int horizontal = activeScreen.getSize().getWidth()/2;

        Double startSwipe = dimension.getHeight()*0.5;
        int verticalStart = startSwipe.intValue();

        Double endSwipe = dimension.getWidth()*0.2;
        int verticalEnd = endSwipe.intValue();

        new TouchAction(ad)
                .press(PointOption.point(horizontal,verticalStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(horizontal,verticalEnd))
                .release().perform();

        Thread.sleep(3000);
    }


    public void testingSwipeToElement() throws InterruptedException {

        Dimension dimension = ad.manage().window().getSize();

        while (ad.findElements(By.xpath("//*[@text='Back in Black']")).size()==0) {


            Double startSwipe = dimension.getHeight() * 0.5;
            int verticalStart = startSwipe.intValue();

            Double endSwipe = dimension.getWidth() * 0.2;
            int verticalEnd = endSwipe.intValue();

            new TouchAction(ad)
                    .press(PointOption.point(0, verticalStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, verticalEnd))
                    .release().perform();

        }
    }

    public void scrollToElement() throws InterruptedException{
        MobileElement mb = (MobileElement) ad.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"+
                ".scrollIntoView(new UiSelector().text(\"Back In Black\"))"));

        mb.click();
        Thread.sleep(3000);
    }






}
