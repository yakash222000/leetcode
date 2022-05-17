import java.util.*;
public class toh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of rings:");
        int n=scanner.nextInt();
        towerOfHanoi(n,"a","b","c");
    }
//////////////////////////////////////////////////////////////////////////////////
    public static void towerOfHanoi(int n,String from,String to,String aux){
        if(n==1){
            System.out.println("move disk 1 from " + from + " to " + to);
            return ;
        }
        towerOfHanoi(n-1,from,aux,to);{
            System.out.println("move disk " + n + " from " + from + " to " + to);
        }
        towerOfHanoi(n-1,aux,to,from);

    }
    
}
