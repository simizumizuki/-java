
public class DisplayAndTree extends MyFrame{
	public void run() {
		Face Face1 = new Face(50,50,10,5);
		tree tree1 =new tree(200,100,-10,-5);
		for (int i = 0;i<30;i++) {
			clear();
			Face1.draw(this);
			tree1.draw(this);
			Face1.move();
			tree1.move();
			sleep(0.1)
			;
		}
	}

}
