import java.util.Scanner;

public class compute{
    //Scanner in = new Scanner(System.in);
    static void chooseInput(){
        Scanner in = new Scanner(System.in);
        String turn ="X";
        System.out.println("Enter the choice X or Y");
        String input = in.nextLine();
        if(input.equals("X")){
            turn = "Y";
        }
            else{
                turn ="Y";
            }
        }
    }
public class TicTacToe {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String[] board = new String[10];
        String turn = "x";
        String winner=null;
        for(int i=1;i< board.length;i++)
        {
            board[i]="";

        }

    }
}
