
public class fouthpattern {
    public static void main(String[] args) {
        int row = 1;

        for(int i = row; i <= 5; i++){
            for(int j = 1; j <= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}