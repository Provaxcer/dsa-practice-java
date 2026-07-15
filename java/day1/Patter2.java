void main() {
    int n = 4;
    for (int row=1;row<=n;row++) {
        //col
        if (row == 1 || row == 4 ) {
            for (int col = 1; col <= 6; col++) {
                System.out.print("* ");
            }

        }else {
            for(int col=1;col<=6;col++){
                if (col==1||col==6){
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