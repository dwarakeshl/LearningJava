package waterTank;
//Main Class
public class WaterTankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterTank tank = new WaterTank();
		tank.maxCapacity = 100;
		tank.bucketCapacity = 10;
		tank.cutOff = 90;
		tank.currentLevel = 0;
		tank.fillTank();
	}

}
