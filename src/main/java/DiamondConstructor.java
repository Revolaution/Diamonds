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

    public void diamondWithName(int rowForName) {
        for (int i = 1; i < (rowForName + 1); i += 2){
            for (int k = 0; k < (4 - (i / 2)); k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < ( 4 - (rowForName/2)); i++){
            System.out.print(" ");
        }
        System.out.println("Ryan");

        for (int i = (rowForName + 1); i > 0; i -= 2){
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
