void main() {
    int n = 5;
    for (int row = 1; row<=n;row++){
        for (int col = 1; col<=row;col++) {
            System.out.print((char)(n-col+'A')+ "  ");
        }
        System.out.println();
    }
}