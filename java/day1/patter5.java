void main() {
    for (int row = 1; row<=5;row++) {
        for (int col =1; col<= 5;col++) {
            if (row == 3 || row == 4) {
                if (col == 1 || col == 3) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            else {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
}