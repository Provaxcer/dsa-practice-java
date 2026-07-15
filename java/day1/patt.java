void main() {
    int n = 5;
    for (int row =1; row<=n;row++){
        //row 1 & 5
        if (row == 1 || row == 5){
            for (int col = 1; col<=n-row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col<=2*row-1; col++) {
                System.out.print("* ");
            }
        }
        // other rows
        else {
            for (int col = 1; col<=n-row; col++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int col = 1; col<=2*row-3; col++) {
                System.out.print("  ");
            }
            System.out.print("* ");
        }
        System.out.println();
    }
}