/*Write a program to print _ _ _ _ _ *
                           _ _ _ _ * *
                           _ _ _ * * *
                           _ _ * * * *
                           _ * * * * *           
 */
public class Ex {
    public static void main(String[] args) {
        for(int j=1;j<=5;j++){
            // k loop is taking care of spaces
            for(int k=5;k>=j;k--){
                System.out.print(" ");
            }
            for(int i=1;i<=j;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
