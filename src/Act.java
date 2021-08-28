import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class Act extends DriverInit{
    public void actSomething(){

        TouchAction t = new TouchAction(ad)
                .longPress(longPressOptions()
                        .withPosition(point(75,325))
                        .withDuration(Duration.ofSeconds(1)))
                .moveTo(point(972,1554))
                .release();
                t.perform();

    }
}
