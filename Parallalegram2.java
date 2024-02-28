// write a program to print parallelogram till get towards left
public class Parallalegram2 {
    public static void main(String[] args) {
        for(int j=1;j<=4;j++){
            for(int k=1;k<=j;k++){
                System.out.print(" ");
            }
            for(int i=1;i<=5;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
