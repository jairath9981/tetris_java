public class Shape
{
Point []p=new Point[4];
int shape,status;
public Shape()
{
	for(int i=0;i<4;i++)
	{
		p[i]=new Point();
	}
}
public void copy(Shape s)
{
for(int i=0;i<4;i++)
{
this.p[i].x=s.p[i].x;
this.p[i].y=s.p[i].y;
this.shape=s.shape;
this.status=s.status;
}	
}
public void setShape(Point p1,Rotation r,int shape,int status)
{
this.shape=shape;
this.status=status;
for(int i=0;i<4;i++)
{
this.p[i].x=p1.x;
this.p[i].y=p1.y;
(this.p[i].x)+=(r.rot[this.shape][this.status][i].x);
(this.p[i].y)+=(r.rot[this.shape][this.status][i].y);
}	
}
}