public class print_z {
    public static void main(String args[]){

        // method 1
        // simple use print statement

        System.out.println("*****");
        System.out.println("   *");
        System.out.println("  *");
        System.out.println(" *");
        System.out.println("*****");



        // method 2
        // here we use for loop
        System.out.println("By mathod 2");

        String str = " ";
        for (int i=0; i<5; i++ ){
            if ( i==0 || i==4 ) System.out.println("*****");
            else System.out.println(str.repeat(5-i-1) + "*");
        }

    }
}
