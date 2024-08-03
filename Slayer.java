package BasilAgboola;


import robocode.HitByBulletEvent;

import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
// I Imported all of these because on looking at thenthe other robots source code they all had this
// So im doing this to make sure it runs becuase its impossible for me to run it on the thing
//class Slayer{

    //package robotslayeralgo;
    //import robocode.*;
   
//   double degrees = 0;
//   double distance = 0;


    //import java.awt.Color;
    
    // API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html
    
    /**
     * RobotSlayer - a robot by (Basil Agboola)
     */
   
public class Slayer extends Robot
    {
        /**
         * run: RobotSlayer's default behavior
         */
        public void run() {

            while(true) {
                ahead(100);
                turnGunLeft(360);
                back(100);
                turnGunLeft(360);

            }
   
        }
    
        /**
         * onScannedRobot: What to do when you see another robot
         */
        public void onScannedRobot(ScannedRobotEvent e) {
                fire(2);
            
            
           //shoots with strength of two
		  }

        /**
         * onHitByBullet: What to do when you're hit by a bullet
         */
        public void onHitByBullet(HitByBulletEvent e) {
            // Replace the next line with any behavior you would like
            turnLeft(90 - e.getBearing());
            back(40);
            // It should turn and scan the robot that hit it.

            
        }
        
        
        public void onHitWall(HitWallEvent e) {

            back(50);
            turnLeft(90 - e.getBearing());
            ahead(100);
            getEnergy();
            // Should move back and turn fowards to a robot if it is also being hit during beimg cornered
        }

        
    }
//}

















