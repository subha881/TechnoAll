public class DiamondPrt {
    public static void main(String[] args) {
        int row = 3;
        for(int i = 1;i<=row;i++){
            for(int j = 1;j<=row - i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = row-1;i>=1;i--){
            for(int j = 1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++){
            System.out.print("*");
            }
            System.out.println();
        }
    
    }
    
}
