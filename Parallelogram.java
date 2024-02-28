// write a program to print parallelogram till get towards right
public class Parallelogram {
    public static void main(String[] args) {
        for(int j=1;j<=4;j++){
            // k loop is taking care of spaces
            for(int k=5;k>=j;k--){
                System.out.print(" ");
            }
            for(int i=1;i<=5;i++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
