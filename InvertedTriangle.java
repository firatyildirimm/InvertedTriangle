import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();


        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*(n-i)+1;k++){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}


