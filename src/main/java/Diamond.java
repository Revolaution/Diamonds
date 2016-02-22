public class Diamond {
    public static void main(String[] args) {
        drawFullDiamond(5);
        drawDiamondWithName(5);
    }

    public static void drawFullDiamond(int upperRows){
        drawUpperDiamond(upperRows);
        drawLowerDiamond(upperRows);
    }

    public static void drawUpperDiamond(int numOfRows){
        for (int i = 1; i < (numOfRows + 3); i += 2){
            drawOutContent(i);
        }
    }

    public static void drawOutContent(int num){
        for (int k = 0; k < (4 - (num / 2)); k++){
            System.out.print(" ");
        }
        for (int j = 0; j < num; j++){
            System.out.print("*");
        }
        System.out.println("");

    }
    public static void drawLowerDiamond(int numOfRows){
        for (int i = (numOfRows + 1); i > 0; i -= 2){
            for (int k = 0; k < (5 - (i / 2)); k++){
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void drawDiamondWithName(int rowForName) {
        for (int i = 1; i < (rowForName + 1); i += 2){
            drawOutContent(i);
        }

        printMyName(rowForName);
        drawLowerDiamond(rowForName);
    }

    public static void printMyName(int spacing){
        for (int i = 0; i < ( 4 - (spacing/2)); i++){
            System.out.print(" ");
        }
        System.out.println("Ryan");
    }
}