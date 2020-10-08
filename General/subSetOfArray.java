package General;

public class subSetOfArray {
    public static void printSubsets(char [] arr) {
        int n = arr.length;
        for(int i = 0; i < (1<<n);i++) {
            System.out.print("{ ");
            for(int j =0; j < n; j++)
            if((i&(1<<j))>0)
                System.out.print(arr[j]+", ");
            System.out.println("}");
        }
    }
    public static void main(String[] args) {
        char set[] = {'a','b','c','d'};
        printSubsets(set);
    }
}
