import java.util.Scanner;

public class TicTacToe {
    char letter;
    //public static void userinput(){
    //    Scanner input = new Scanner(System.in);//
    public static void inputArray(){
        String[] board = new String[10];
        for(int i=1;i<board.length;i++){
            board[i]=" ";
        }
    }
    private static char chooseLetter(Scanner userinput){

        System.out.println("Enter the number you want to choose X or O");

        return userinput.next().charAt(0);

    }
    // showBoard method is for showing the board
    public void showBoard(){
        System.out.println("The board is");
        System.out.println("| 1 | 2 | 3 |\n| 4 | 5 | 6 | \n| 7 | 8 | 9 |");
    }

    public static void main(String args[]){
        //   char userinput;
        TicTacToe obj = new TicTacToe();
        Scanner input = new Scanner(System.in);
        char userinput = chooseLetter(input);
        obj.inputArray();
        obj.showBoard();
    }
}