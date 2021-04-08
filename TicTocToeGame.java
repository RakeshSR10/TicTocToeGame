//Welcome to TicTocToeGame Computation Program
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
                                System.out.print();
                        }
                        System.out.println();
                }
        }
        public static void main(String[] args)
        {
                Display(board);
        }
}
