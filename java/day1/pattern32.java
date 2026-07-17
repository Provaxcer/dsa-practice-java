void main() {
  int n = 4;
  for (int row = 1; row<=n;row++) {
      for (int col=1;col<=n-row;col++){
          System.out.print(" ");
      }
      int count =1;
      for (int col=1;col<=row;col++){
          System.out.print(count);
          count++;
      }
      int val = row-1;
      for (int col=1;col<=row-1;col++){
          System.out.print(val);
          val--;
      }
      System.out.println();
  }
}