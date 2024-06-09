import java.util.Arrays;
import java.util.Scanner;

public class Sum_Of_Two_Arrays {

    public static void main(String  args[]){
        Scanner scan = new Scanner(System.in);

        //Array 1
        int num1 = scan.nextInt();
        int[] arr1 = new int[num1];
        for ( int i=0; i<num1; i++) arr1[i]= scan.nextInt();
//        System.out.println("Array 1 is : " + Arrays.toString(arr1));

        //Array 2
        int num2 = scan.nextInt();
        int[] arr2 = new int[num2];
        for ( int i=0; i<num2; i++) arr2[i]= scan.nextInt();
//        System.out.println("Array 2 is : " + Arrays.toString(arr2));



        if ( num1>num2 ) {
            int[] array = arr2;
            arr2 = arr1;
            arr1 = array;
        }


        int[] arr3 = new int[arr2.length+1];

        int index = 0;
        int mul = 1;
        int carry = 0;
        int i=0;
        while (i< arr3.length || carry>0 ){
            if ( index<arr1.length ){
                int val = arr1[arr1.length-1-i] + arr2[arr2.length-1-i] + carry;
                arr3[arr3.length-1-i] = val%10;
                carry = val/10;
                index++;
            }
            else if ( index<arr2.length) {
                int val = arr2[arr2.length-1-i] + carry;
                arr3[arr3.length-1-i] = val%10;
                carry = val/10;
                index++;
            }
            else arr3[arr3.length-1-i]=carry;

            i++;
        }
        int ind = 0;
        for ( int j=0; j<arr3.length; j++){
            if (arr3[ind]!=0) break;
            ind++;
        }


        System.out.println(Arrays.toString(arr3));
        for ( int jj=ind; jj<arr3.length; jj++) System.out.println(arr3[jj]);
    }
}

