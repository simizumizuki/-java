
public class DisplayFaceObject extends MyFrame{
	public void run() {
		int x = 30;
		Face facel = new Face();
		facel.x = 100;
		facel.y = 50;
		facel.drow(this);
		
		Face face2 = new Face();
		face2.x = 200;
		face2.y = 150;
		face2.drow(this);
	}

}
