void main() {
    int n= 4;
    for (int row=1; row<= n;row++){
        if (row== 1|| row==2||row==3){
          for (int col =1; col<=n-row;col++){
              System.out.print("  ");
          }
            System.out.print("* ");
          for (int col =1; col<=2*row-3;col++){
                System.out.print("  ");
            }
          if (row == 2|| row ==3){
              System.out.print("* ");
          }

        } else {
            System.out.print("* ");
            for (int col=1; col<=row+1;col++) {
                System.out.print("  ");
            }
            System.out.print("* ");
        }
        System.out.println();
    }


    for (int row = 1; row<= n-1;row++){
        for (int col = 1; col<=row; col++) {
            System.out.print("  ");
        }
        System.out.print("* ");
        //tr
        if (row == 1|| row==2){
            for (int col = 1; col<=n-2*(row-1)-1;col++){
                System.out.print("  ");
            }
            System.out.print("* ");
        }

        System.out.println();
    }

}