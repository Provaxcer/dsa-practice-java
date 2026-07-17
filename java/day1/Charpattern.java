void main() {
   int n = 5;
   for (int row =1; row<=n;row++){
       for (int col =1;col<=row;col++){
           char result = (char)('A'-1+col);
           System.out.print(result);
       }
       System.out.println();
   }
}