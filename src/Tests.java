import io.appium.java_client.events.api.Listener;
import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(TestingListners.class)
public class Tests extends DriverInit implements Listener {

    @Test
    public void tests() throws InterruptedException {
        SwipingAndScrolling ss = new SwipingAndScrolling();
       //ss.testingHorizontalSwipe();
       //ss.testingVerticalSwipe();
       //ss.testingSwipeToElement();
        //ss.scrollToElement();

        Act a = new Act();
        a.actSomething();

        RotationTesting rt = new RotationTesting();
        rt.landscapeMode();

        ScreenReolutionTesting sr = new ScreenReolutionTesting();
        sr.getResolution();


    }
}
