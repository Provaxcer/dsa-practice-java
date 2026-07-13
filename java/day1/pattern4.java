void main() {
    for (int row = 1; row<=4;row++) {
        for (int col = 1; col<=6;col++) {
            if (row== 1 || row == 4) {
                System.out.print("* ");
            }
            else {
                if (col == 1 || col == 6) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
    }
}