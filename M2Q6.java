import java.util.Scanner;
public class M206{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    int n =scn.nextInt();
    int m =n/2;
    boolean flag = true;
    for( int i=2 ; i<=m ; i++){
        if(n%i==0){
            flag = false;
            break;
        }
    }
    if(flag){
        System.out.println("NO");
    }
    else{
        System.out.println("YES");
    }
}
}
