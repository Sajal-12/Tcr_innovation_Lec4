// To take 3 subjects marks store in array and calculate total and average

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3] ;
        int total = 0;
        double average ;

        for(int i = 0 ; i<marks.length ; i++)
        {
            System.out.println("please enter marks ");
            marks[i] = sc.nextInt() ;
            total+= marks[i];
        }
        average= total/3 ;
        System.out.println("total of 3 subjects marks : " + total);
        System.out.println("average "+ average);
    }
}