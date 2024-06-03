import java.util.Vector;

public class DisplaycarVactor extends MyFrame{
	public void run() {
		Vector<Car> cars = new Vector <Car>();
		cars.add(new Car(50,50,10,5));
		cars.add(new Car(50,80,10,5));
		cars.add(new Car(50,110,10,5));
		cars.add(new Car(50,140,10,5));
		cars.add(new Car(50,170,10,5));
		for(int i= 0;i<30;i++) {
			clear();
			for(int j = 0; j < cars.size();j++){
			cars.get(j).draw(this);
			for(int v = 0; v<j+1;v++){
			cars.get(j).move();
			}
			}
			sleep(0.1);
		}
	}
}
