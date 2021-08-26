import org.testng.annotations.Test;

public class Tests extends DriverInit{

    @Test
    public void tests() throws InterruptedException {
        SwipingAndScrolling ss = new SwipingAndScrolling();
                ss.testingHorizontalSwipe();
    }
}
