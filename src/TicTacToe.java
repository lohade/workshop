import java.util.Scanner;

public class TicTacToe {
    private static int pos;
    char letter;
    String[] board = new String[10];
    //  int pos =0;
    //public static void userinput(){
    //    Scanner input = new Scanner(System.in);//
    public void inputArray(){
        //String[] board = new String[10];
        for(int i=1;i<board.length;i++){
            board[i]=" ";
        }
    }
    private static char chooseLetter(Scanner userinput){
        System.out.println("Enter the number you want to choose X or O");
        return userinput.next().charAt(0);

    }
    // showBoard method is for showing the board
    public void showBoard() {
        System.out.println("The board is");
        System.out.println("| 1 | 2 | 3 |\n| 4 | 5 | 6 | \n| 7 | 8 | 9 |");
    }
    public void inputboard() {
        //System.out.println("Enter the position you want to insert");
        System.out.println(board[pos]+"X");
        showBoard();
    }
    public static void main(String args[]){
        // int pos=0;
        TicTacToe obj = new TicTacToe();
        Scanner input = new Scanner(System.in);
        //    System.out.println("Enter the number you want to choose X or O");
        char userinput = chooseLetter(input);
        obj.inputArray();
        obj.showBoard();
        System.out.println("Enter the position you want to insert");
        pos = input.nextInt();
        obj.inputboard();
    }

}