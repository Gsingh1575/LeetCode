class Solution {
    public void rotate(int[][] arr) {
     
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
System.out.println();
        reverse(arr);
       
    }
    private static void reverse(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int start=0;
            int end=arr[0].length-1;
            
            while(start<end){
                int t=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=t;
                start++;
                end--;
            }
        }
    }
}