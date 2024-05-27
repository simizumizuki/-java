
public class syou5 extends MyFrame{
	public void run() {
		int x = 50;
		int y = 50;
		for(int i = 0;i<3;i++) {
			while(x<=170) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x+=5;
				sleep(0.1);
			}
			while(x>=50) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x-=5;
				sleep(0.1);
			}
		}
	}
}

