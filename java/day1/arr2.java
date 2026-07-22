void main() {
        int arr [][] = {
                {1,23,33},
                {421,32,324},
                {32,123,1323}
        };

        for (int row = 0; row<arr.length;row++) {
            for (int col = 0; col<arr[row].length;col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
}