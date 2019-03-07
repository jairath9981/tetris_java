public class Rotation
{
//Point []p=new Point[4];
Point rot[][][]=new Point[7][4][4];  
public Rotation()
{
	for(int i=0;i<7;i++)
	{
		for(int j=0;j<4;j++)
		{
			for(int k=0;k<4;k++)
			{
				rot[i][j][k]=new Point();
			}
		}
	}
	for(int i=0;i<2;i++)
	{
		rot[0][i][0].x=0;
        rot[0][i][0].y=0;
        rot[0][i][1].x=0;
        rot[0][i][1].y=1;
        rot[0][i][2].x=1;
        rot[0][i][2].y=0;
        rot[0][i][3].x=1;
        rot[0][i][3].y=1;
	}
	for(int i=0;i<4;i++)
	{
		rot[1][0][i].x=0; rot[1][0][i].y=i-1;
    }
	for(int i=0;i<4;i++)
	{
		rot[1][1][i].x=i-1; rot[1][1][i].y=0;
    }
	rot[2][0][0].x=0; rot[2][0][0].y=1;
    rot[2][0][1].x=0; rot[2][0][1].y=0;
	rot[2][0][2].x=1; rot[2][0][2].y=0;
	rot[2][0][3].x=1; rot[2][0][3].y=-1;
	
	
	rot[2][1][0].x=-1; rot[2][1][0].y=0;
    rot[2][1][1].x=0; rot[2][1][1].y=0;
	rot[2][1][2].x=0; rot[2][1][2].y=1;
	rot[2][1][3].x=1; rot[2][1][3].y=1;
	
	rot[3][0][0].x=0; rot[3][0][0].y=-1;
    rot[3][0][1].x=0; rot[3][0][1].y=0;
	rot[3][0][2].x=1; rot[3][0][2].y=0;
	rot[3][0][3].x=1; rot[3][0][3].y=1;
	
	
	rot[3][1][0].x=-1; rot[3][1][0].y=0;
    rot[3][1][1].x=0; rot[3][1][1].y=0;
	rot[3][1][2].x=0; rot[3][1][2].y=-1;
	rot[3][1][3].x=1; rot[3][1][3].y=-1;
	
    rot[4][0][0].x=-1; rot[4][0][0].y=0;  rot[4][0][1].x=0; rot[4][0][1].y=0;    rot[4][0][2].x=1; rot[4][0][2].y=0;   rot[4][0][3].x=1; rot[4][0][3].y=1;
	rot[4][1][0].x=0; rot[4][1][0].y=1;  rot[4][1][1].x=0; rot[4][1][1].y=0;    rot[4][1][2].x=0; rot[4][1][2].y=-1;   rot[4][1][3].x=1; rot[4][1][3].y=-1;
	rot[4][2][0].x=1; rot[4][2][0].y=0;  rot[4][2][1].x=0; rot[4][2][1].y=0;    rot[4][2][2].x=-1; rot[4][2][2].y=0;   rot[4][2][3].x=-1; rot[4][2][3].y=-1;
	rot[4][3][0].x=0; rot[4][3][0].y=-1;  rot[4][3][1].x=0; rot[4][3][1].y=0;    rot[4][3][2].x=0; rot[4][3][2].y=1;   rot[4][3][3].x=-1; rot[4][3][3].y=1;
	
	
	rot[5][0][0].x=-1; rot[5][0][0].y=0;  rot[5][0][1].x=0; rot[5][0][1].y=0;    rot[5][0][2].x=1; rot[5][0][2].y=0;   rot[5][0][3].x=1; rot[5][0][3].y=-1;
	rot[5][1][0].x=0; rot[5][1][0].y=1;  rot[5][1][1].x=0; rot[5][1][1].y=0;    rot[5][1][2].x=0; rot[5][1][2].y=-1;   rot[5][1][3].x=-1; rot[5][1][3].y=-1;
	rot[5][2][0].x=1; rot[5][2][0].y=0;  rot[5][2][1].x=0; rot[5][2][1].y=0;    rot[5][2][2].x=-1; rot[5][2][2].y=0;   rot[5][2][3].x=-1; rot[5][2][3].y=1;
	rot[5][3][0].x=0; rot[5][3][0].y=-1;  rot[5][3][1].x=0; rot[5][3][1].y=0;    rot[5][3][2].x=0; rot[5][3][2].y=1;   rot[5][3][3].x=1; rot[5][3][3].y=1;
	
	rot[6][0][0].x=0; rot[6][0][0].y=-1;  rot[6][0][1].x=0; rot[6][0][1].y=0;    rot[6][0][2].x=0; rot[6][0][2].y=1;   rot[6][0][3].x=1; rot[6][0][3].y=0;
	rot[6][1][0].x=-1; rot[6][1][0].y=0;  rot[6][1][1].x=0; rot[6][1][1].y=0;    rot[6][1][2].x=1; rot[6][1][2].y=0;   rot[6][1][3].x=0; rot[6][1][3].y=-1;
	rot[6][2][0].x=0; rot[6][2][0].y=1;  rot[6][2][1].x=0; rot[6][2][1].y=0;    rot[6][2][2].x=0; rot[6][2][2].y=-1;   rot[6][2][3].x=-1; rot[6][2][3].y=0;
	rot[6][3][0].x=1; rot[6][3][0].y=0;  rot[6][3][1].x=0; rot[6][3][1].y=0;    rot[6][3][2].x=-1; rot[6][3][2].y=0;   rot[6][3][3].x=0; rot[6][3][3].y=1;
}
}