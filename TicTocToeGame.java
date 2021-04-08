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
        public static void main(String[] args)
        {
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
                Display(board);
        }
}
