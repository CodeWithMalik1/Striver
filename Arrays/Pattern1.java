import java.util.*;
public class Main
{
    public void pattern1(int m ,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Main obj=new Main();
	    System.out.print("Enter the number of Rows : ");
	    int m=sc.nextInt();
	    System.out.print("Enter the number of columns : ");
	    int n=sc.nextInt();
	    obj.pattern1(n,m);
	}
}
