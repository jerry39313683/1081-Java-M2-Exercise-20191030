import java.util.Scanner;
public class M2Q2{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
    int x =scn.nextInt();
    for(int i =1 ; i<=x ; i++){
        for(int j=1 ; j<=i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
