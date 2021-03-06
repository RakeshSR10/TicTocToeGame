//Welcome to TicTocToeGame Computation Program
import java.util.Scanner;
public class TicTocToeGame
{
	static char board[][] = new char[3][3];
	
	
	//display function
	static void Display(char board[][])
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
//-------------------------------------------------------------------------
	//Replace function
	public static void Replace(TicTocToeGame game, char board[][], char find, char replace)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0;j<3; j++)
			{
				if(board[i][j] == find)
				{
					board[i][j] = replace;
					return;
				}
			}
		}
	}
//--------------------------------------------------------------------------
	//checkForRow function
	public boolean checkForRow()
	{
		for(int i=0; i<3; i++)
		{
			if(check(board[i][0],board[i][1],board[i][2]) == true)
				return true;
		}
		return false;
	}
	//checkForColumn function
	public boolean checkForColumn()
	{
		for(int i=0; i<3; i++)
		{
			if(check(board[0][i],board[1][i],board[2][i]) == true)
				return true;
		}
		return false;
	}
	//checkForDiagnol Function
	public boolean checkForDiagnol()
	{
		return((check(board[0][0], board[1][1], board[2][2]) == true) || (check(board[0][2], board[1][1], board[2][0]) == true));
	}
//-------------------------------------------	
	//checkForWinner function
		public boolean checkForWinner()
		{
			return (checkForRow() || checkForColumn() || checkForDiagnol());
		}
	//check Function
	public boolean check(char c1, char c2, char c3)
	{
		return ((c1==c2) && (c2==c3));
		
	}

	public static void main(String[] args)
	{
		//(2)input player name and marker
		Scanner in = new Scanner(System.in);
		//Take player names
		String player1 = null, player2 = null;
		System.out.print("Enter player1 name = ");
		player1=in.nextLine();
		System.out.print("Enter player2 name = ");
		player2=in.nextLine();

		//Take player marker
		char player1Marker = 0, player2Marker=0;
		System.out.print(player1+" select marker (x or o) : ");
		player1Marker=in.nextLine().charAt(0);
		
		while(player1Marker != 'X' && player1Marker != 'x' && player1Marker !='O' && player1Marker !='o')
		{
			System.out.println("Invalid input, Enter Correct Marker Symbol!:");
			player1Marker=in.nextLine().charAt(0);

		}

		if(player1Marker == 'x' || player1Marker == 'X')
			player2Marker = 'o';
		else
			player2Marker = 'x';
		
		TicTocToeGame game = new TicTocToeGame();

		int counter=0;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				game.board[i][j]=Character.forDigit(++counter, 10);

			}
		}
		Display(game.board);
		
		//Take User choice to remove number and add (o or x)
		char choice;
		for(int i=0; i<4; i++)
		{
			System.out.print(player1+" Turn :");
			choice=in.next().charAt(0);
			Replace(game, board, choice, player1Marker);
			Display(game.board);

			System.out.print(player2+" Turn :");
			choice=in.next().charAt(0);
			Replace(game, board, choice, player2Marker);
			Display(game.board);
		}

		System.out.print(player1+" Turn :");
		choice=in.next().charAt(0);
		Replace(game, board, choice, player1Marker);
		Display(game.board);

		if(game.checkForWinner())
			System.out.println("We have a winner:");
		else
			System.out.println("Match is Draw");
	}
}
