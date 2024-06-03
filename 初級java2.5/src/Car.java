
public class Car{
	int x,y,vx,vy;
public Car(int x,int y,int vx,int vy){
	this.x=x;
	this.y =y;
	this.vx=vx;
	this.vy=vy;
}
public void draw(MyFrame frame) {
	frame.fillOval(x, y+9, 10, 10);
	frame.fillOval(x+30, y+9, 10, 10);
	frame.fillRect(x, y, 40, 10);
	frame.fillRect(x+10, y-8, 20, 10);
}
public void move() {
	x+=1;
}
}
