import java.util.Scanner;
public class M2Q6{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = 0;
        boolean flag = true;
        for(int i=2 ; i<=n ;i++){
        if(n%i==0){
           flag = false;
           break;
        }           
        }
        if(flag){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
    }
