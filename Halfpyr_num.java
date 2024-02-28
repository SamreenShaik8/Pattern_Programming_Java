public class Halfpyr_num {
   public static void main(String[] args) {
    // j loop is taking care of rows
    for(int j=1;j<=5;j++){
        // i loop is taking care of columns ->stars
        for(int i=1;i<=j;i++){
            System.out.print(i);
        }
        System.out.println(" ");
    }
   }
}

/*if we change the statement in the place of i we change it as j then it will print 1 1
 * 222
 * 333
 * 
*/
