package YildirimEnsar;
import robocode.*;


public class FidgetAbi extends JuniorRobot
{

	public void run() {
	
		setColors( orange,blue,black,black,red);
		int heightdistance;
		int widthdistance;
		



		while(true) {

			turnGunLeft(50);
			back(100);
			turnGunRight(360);
			turnBackRight(60,50);
			ahead(50);
			turnRight(10);
			ahead(50);
			out.println("Corner: Bottom right");
			turnRight(10);
			ahead(50);
			turnRight(10);
			ahead(50);
			turnRight(10);
			ahead(50);
			ahead(fieldHeight);
			out.println("Corner: Bottem left");
			ahead(fieldWidth);

			
turnGunTo(scannedAngle);
		if (scannedDistance < 100)
		{
			fire (3);
		} 
		if (scannedDistance < 200)
		{
			fire (2.2);
		} 
		else
		{
			fire (1.5);
		}

			
			
		}
	}


	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		turnGunTo(scannedAngle); 
		fire(3);
	}


	public void onHitByBullet() {
		
		back(10);
	}
	
	
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		
		}
	}
		
