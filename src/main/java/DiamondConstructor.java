public class DiamondConstructor {
    public void fullDiamond(int upperRows){
        for (int i = 1; i < (upperRows + 4); i += 2){
            for (int k = 0; k < (4 - (i / 2)); k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = (upperRows + 1); i > 0; i -= 2){
            for (int k = 0; k < (5 - (i / 2)); k++){
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
