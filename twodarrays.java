import java.util.*;
public class twodarrays {
    public static void main(String[] args) {
        int marks[][]=new int[3][3];
        
        int n=marks.length,m=marks[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                marks[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                System.out.print(marks[i][j]+" ");


            }
            System.out.println();

        }
    }
    
}
