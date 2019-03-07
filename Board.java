public class Board
{
private int r,c,arr[]; 
private char [][] bd;

public Board()
{
	r=30;
	c=30;
	bd=new char[r][c];
	arr=new int[r];
	for(int i=0;i<r;i++)
	{
		arr[i]=0;
	}
	
}
public void constructBoard()
{
	for(int i=0;i<r-1;i++)
	{
		for(int j=0;j<c;j++)
		{
			if(j==0 || j==c-1)
			{
			bd[i][j]='*';	
			}	
			else
			{
			bd[i][j]=' ';
			}
			
		}
	}
	for(int j=0;j<c;j++)
	{
		bd[r-1][j]='*';
	}
}
public void setShapeInBoard(Shape s)
{
	bd[s.p[0].x][s.p[0].y]='#';
	bd[s.p[1].x][s.p[1].y]='#';
	bd[s.p[2].x][s.p[2].y]='#';
	bd[s.p[3].x][s.p[3].y]='#';
}
public void updateShapeInBoard(Shape s)
{
	bd[s.p[0].x][s.p[0].y]=' ';
	bd[s.p[1].x][s.p[1].y]=' ';
	bd[s.p[2].x][s.p[2].y]=' ';
	bd[s.p[3].x][s.p[3].y]=' ';
}
public boolean validateShapeAccToBoard(Shape s)
{
	boolean v; v=true;
	if(bd[s.p[0].x][s.p[0].y]!=' '|| bd[s.p[1].x][s.p[1].y]!=' '|| bd[s.p[2].x][s.p[2].y]!=' '|| bd[s.p[3].x][s.p[3].y]!=' ')
	{
	return false;
	}
	else
		return true;
}
public boolean currentShapeOver(Shape s)
{
	boolean v; v=true;
	if((s.p[0].y>=1 && s.p[0].y<c-1) && (s.p[1].y>=1 && s.p[1].y<c-1) && (s.p[1].y>=1 && s.p[1].y<c-1) && (s.p[1].y>=1 && s.p[1].y<c-1))
	{
		for(int i=0;i<4;i++)
		{
			if((s.p[i].x==r-1) || (bd[s.p[i].x][s.p[i].y]=='#'))
			{
				 
	            return false;
	        }
	   
		}
		
	}
	else 
		return true;
	return true;
}
public void maintainLine(Shape s)
{
	arr[s.p[0].x]+=1;
	arr[s.p[1].x]+=1;
	arr[s.p[2].x]+=1;
	arr[s.p[3].x]+=1;
	if(arr[s.p[0].x]==c-2 || arr[s.p[1].x]==c-2 || arr[s.p[2].x]==c-2 || arr[s.p[3].x]==c-2)
	{
		comeDown(s);
	   
	}
}
public void comeDown(Shape s)
{ 
int t=0;
	for(int k=0;k<4;k++)
	{
		if(arr[s.p[k].x]==c-2)
		{
			t=s.p[k].x;
			
			for(int i=t-1;i>=0;i--)
			{
				for(int j=1;j<=c-2;j++)
				{
					bd[i+1][j]=bd[i][j];
					arr[i+1]=arr[i];
				}
				
			}
		}
	}
}
public void printBoard()
{
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
		 System.out.print(bd[i][j]);
		}
			System.out.println();
	}
}
}