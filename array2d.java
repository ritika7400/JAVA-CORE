import java.util.Scanner;

public class array2d{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int rows = sc.nextInt();
        int cols = sc.nextInt();


        int arr[][]= new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                    arr[i][j]=sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==x){
                    System.out.println("number is present at indices "+ rows + ","+ cols);
                }
            }
        }
      }
    }
}
