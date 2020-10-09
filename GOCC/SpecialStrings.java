package GOCC;

import java.util.Scanner;

public class SpecialStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases>0) {
            int stringLength = sc.nextInt();
            char[] string = new char[stringLength];
            for(int i =0; i < stringLength;i++){
                string[i] = sc.next().charAt(0);
            }
            int noOfChanges = stringLength;
            int temp = 0;
//          S[i] > S[j]
            for(int i =0; i < stringLength/2;i++) {
                if(string[i]<string[(i+(stringLength/2))])
                    temp++;
            }
            if(temp <= noOfChanges) noOfChanges = temp;
            temp = noOfChanges;
//          S[i] < S[j]
            for(int i =0; i < stringLength/2;i++) {
                if(string[i]>string[(i+(stringLength/2))])
                    temp++;
            }
            if(temp <= noOfChanges) noOfChanges = temp;
//          S[i] = S[j]
            for(int i =0; i < stringLength/2;i++) {
                if(string[i]!=string[(i+(stringLength/2))])
                    temp++;
            }
            if(temp <= noOfChanges) noOfChanges = temp;
            System.out.println(noOfChanges);
        }
    }
}
