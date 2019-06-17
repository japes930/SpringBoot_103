public class nineLoop {
    static final int MAX = 10;
    public static void main(String[] args) {

        int row, x;

        for (row= 1; row <MAX; row++){
            for (x= 1; x <=row; x++){
                System.out.print(row);
            }
            System.out.println();

        }
    }
}

