import java.util.Scanner;

public class TicTacToe {

    static void enterCharacter(){
        System.out.println("enter X or O to enter of person1:");
        Scanner sc=new Scanner(System.in);
        String person1=sc.next();
        System.out.println("entering computer:");
        String person2=sc.next();

    }
    public static void main(String[] args){
        char charArray[];
        charArray=new char[10];
        enterCharacter();


    }

}
