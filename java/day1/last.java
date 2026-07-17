void main() {
    int n =4;
    for (int row = 1; row<=n;row++){
        for (int col =1;col<=n-row;col++){
            System.out.print(" ");
        }
        char alpha = 'A';
        for (int col =1;col<=row;col++){
            System.out.print(alpha);
            alpha++;
        }
        //part c
        char newAlpha = (char)(alpha - 2);
        for (int col=1;col<=row-1;col++){
            System.out.print((char)(newAlpha));
            newAlpha--;
        }
        System.out.println();
    }
}