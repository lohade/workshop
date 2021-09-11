import java.util.Scanner;

public class TicTacToe {

    static void enterCharacter(){
        System.out.println("enter X or O to enter of person1:");
        Scanner sc=new Scanner(System.in);
        char person1=sc.next().charAt(0);

        char computer;
        if(person1=='x'){
            computer='O';
            System.out.println("computer enter"+ computer);
        }
        else{
            computer='x';
            System.out.println("computer enter"+ computer);
        }

    }
    public static void main(String[] args){
        char board[];
        board=new char[10];
        System.out.println(board);
        enterCharacter();


    }

}
