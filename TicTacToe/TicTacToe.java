import java.util.Random;
import java.util.Scanner;

public class TicTacToe 
{
	static char a[][]=new char[3][3];
	static  int t;
	static void format()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				a[i][j]='-';
		}
	}

	public static void display() 
	{
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}		
	}
	public static void random() 
	{
		Random r=new Random();
		int i=r.nextInt(3);
		int  j=r.nextInt(3);
		System.out.println("Computer entered here");
		if(a[i][j]=='-'){
			a[i][j]='O';
		}
		else
			random();
	}

	public static void setVals() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row no. and col no.");
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println("You entered here ");
		if(a[i][j]=='-')
		{
			a[i][j]='X';
		}
		else
		{
			System.out.println("Choose next location");
			setVals();
		}		
	}
	public static void logic(String name) 
	{
		if((a[0][0]=='X'&& a[0][1]=='X' && a[0][2]=='X')|| 
				(a[1][0]=='X'&& a[1][1]=='X' && a[1][2]=='X')||
				(a[2][0]=='X'&& a[2][1]=='X' && a[2][2]=='X')||
				(a[0][0]=='X'&& a[1][0]=='X' && a[2][0]=='X')||
				(a[0][1]=='X'&& a[1][1]=='X' && a[2][1]=='X')||
				(a[0][2]=='X'&& a[1][2]=='X' && a[2][2]=='X')||
				(a[0][0]=='X'&& a[1][1]=='X' && a[2][2]=='X')||
				(a[0][2]=='X'&& a[1][1]=='X' && a[2][0]=='X'))
		{
			System.out.println("Congrats "+name+" !!! You Won");
			t=1;
		}
		else if((a[0][0]=='O'&& a[0][1]=='O' && a[0][2]=='O')|| 
				(a[1][0]=='O'&& a[1][1]=='O' && a[1][2]=='O')||
				(a[2][0]=='O'&& a[2][1]=='O' && a[2][2]=='O')||
				(a[0][0]=='O'&& a[1][0]=='O' && a[2][0]=='O')||
				(a[0][1]=='O'&& a[1][1]=='O' && a[2][1]=='O')||
				(a[0][2]=='O'&& a[1][2]=='O' && a[2][2]=='O')||
				(a[0][0]=='O'&& a[1][1]=='O' && a[2][2]=='O')||
				(a[0][2]=='O'&& a[1][1]=='O' && a[2][0]=='O'))
		{
			System.out.println("Sorry !!!Computer Won");
			t=1;
		}		
	}


	public static void main(String[] args) 
	{
		System.out.println("Welcome to Cross Game.Here Player 1 is Computer and will play First");
		System.out.println("please enter your name:");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		format();
		int i=0;
		while(i<10)
		{
			if(i%2==0)
			{
				if(i!=9)
				{
					random();
					display();
					logic(name);
					if(t==1)
						return;
				}
				else
					break;
			}
			else
			{  
				if(i!=9)
				{
					setVals();
					display();
					logic(name);
					if(t==1)
						return;
				}
				else
					break;
			}
			i++;
		}
		System.out.println("Draw");
	}
}