import java.util.*;
import java.io.IOException;
public class tetris2
{
	public static void main(String []args) throws IOException, InterruptedException
	{
		int shape,state,state2;
		int x1,y1;
		int x2,y2;
		char input;
		boolean gm; gm=true;
		boolean shgm; shgm=true;
		Scanner sc =new Scanner(System.in);
		Board b1 = new Board();
		b1.constructBoard();
		Random rand=new Random(); 
		Point p = new Point();
		Rotation r = new Rotation();
		Shape sn = new Shape();
		Shape sn2 = new Shape();
		while(gm)
		{
		shape=rand.nextInt(7);
		if(shape<=3)
			state=rand.nextInt(2);
	    else
			state=rand.nextInt(4);
		x1=1;y1=15;
		x2=1;y2=15;
		state2=state;
		System.out.println("Hello");
		shgm=true;
		while(shgm)
		{
		p.setPoint(x1,y1);
		sn.setShape(p,r,shape,state);
		if(b1.validateShapeAccToBoard(sn))
		{
		x2=x1;
		y2=y1;
		state2=state;
		}
		else
			
		{
		x1=x2;
		y1=y2;
		state=state2;
		p.setPoint(x1,y1);
		sn.setShape(p,r,shape,state);
		}
		b1.setShapeInBoard(sn);
		b1.printBoard();
		b1.updateShapeInBoard(sn);
		input=sc.next().charAt(0);
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		if(input=='w')
		{
			state++;
			if(shape<=3)
				state=state%2;
			else
				state=state%4;
			x1++;
		}
		if(input=='s')
		{
			x1++;
		}
		if(input=='d')
		{
			y1++;
		}
		if(input=='a')
		{
			y1--;
		}
		p.setPoint(x1,y1);
		sn2.setShape(p,r,shape,state);
		shgm=b1.currentShapeOver(sn2);
		}
		b1.setShapeInBoard(sn);
		b1.maintainLine(sn);
		}
	
	}
}