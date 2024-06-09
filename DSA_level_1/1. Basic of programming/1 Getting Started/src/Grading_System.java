import java.util.Scanner;

class Grading_System{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int user_input = scan.nextInt();

        // int user_input = marks;
        if ( user_input>90  ) System.out.println("excellent");
        else if ( user_input>80 && user_input<=90 ) System.out.println("good");
        else if ( user_input>70 && user_input<=80 ) System.out.println("fair");
        else if ( user_input>60 && user_input<=70 ) System.out.println("meets expectations");
        else System.out.println("below par");
    }
}