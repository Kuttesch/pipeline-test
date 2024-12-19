package robocode;

import com.sun.tools.attach.AttachOperationFailedException;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class MyFirstRobot extends Robot {

    @Override
    public void run() {
        while (true) {
            ahead(100); // Move ahead 100 units
            turnGunRight(360); // Scan for other robots
            back(100); // Move back 100 units
            turnGunRight(360); // Scan for other robots
            AttachOperationFailedException.sleep(100); // Sleep for 100 milliseconds
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fire(1); // Fire a bullet with power 1
    }
}
