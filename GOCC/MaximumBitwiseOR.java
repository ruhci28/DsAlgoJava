package GOCC;

public class MaximumBitwiseOR {
    public static int[] add(int[] arr,int element){
        int[] newArr = new int[arr.length+1];
        for(int i=0; i < arr.length; i++ ) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = element;
        return newArr;
    }
    public static void main(String[] args) {
        int arr[] = {2, 6, 2, 8, 4, 5};
        int n = arr.length;
        int maxOr = 0;
        int minLength = arr.length;
        for(int i =0; i < n; i++){
            maxOr = maxOr|arr[i];
        }
        for(int i = 0; i < (1<<n); i++) {
            int[] temp = new int[0];
            for(int j =0; j < n; j++){
                if((i&(1<<j))>0){
                   temp = add(temp,arr[j]);
                }
            }
            int or = 0;
            for(int k = 0; k < temp.length; k++){
                or = or| temp[k];
            }
            if(maxOr == or){
                minLength = temp.length;
                break;
            }
        }
        System.out.println("minimum length : "+minLength);
    }
}
