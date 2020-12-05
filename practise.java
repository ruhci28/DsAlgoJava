
        import java.util.Scanner;


public class practise {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str="?3?1???????2";
        StringBuilder s=new StringBuilder(str);
        char one='1';
        char two='2';
        char three='3';

        for(int i=0;i<s.length();i++){


            if(s.charAt(i)=='?'){

                if(i==0){
                    if(s.length()==1){
                        s.setCharAt(i,one);
                    }else{
                        if(s.charAt(i+1)=='1'){
                            s.setCharAt(i,two);
                        }

                        else  if(s.charAt(i+1)=='2'){
                            s.setCharAt(i,one);
                        }

                        else  if(s.charAt(i+1)=='3'){
                            s.setCharAt(i,one);
                        }

                        else  if(s.charAt(i+1)=='?'){
                            s.setCharAt(i,one);
                        }

                    }

                    continue;
                }//first cahracter

                if(i==s.length()-1){

                    if(s.charAt(i-1)=='1'){
                        s.setCharAt(i,two);
                    }

                    else if(s.charAt(i-1)=='2'){
                        s.setCharAt(i,one);
                    }

                    else if(s.charAt(i-1)=='3'){
                        s.setCharAt(i,one);
                    }


                    continue;
                }//last character

                else{

                    if((s.charAt(i-1)=='1' && s.charAt(i+1)=='1')){
                        s.setCharAt(i,two);
                    }

                    else if((s.charAt(i-1)=='2' && s.charAt(i+1)=='2') || (s.charAt(i-1)=='3' && s.charAt(i+1)=='3')){
                        s.setCharAt(i,one);
                    }

                    else if((s.charAt(i-1)=='1' && s.charAt(i+1)=='?')){
                        s.setCharAt(i,two);
                    }

                    else if((s.charAt(i-1)=='2' && s.charAt(i+1)=='?') || (s.charAt(i-1)=='3' && s.charAt(i+1)=='?')){
                        s.setCharAt(i,one);
                    }

                    else if((s.charAt(i-1)=='1' && s.charAt(i+1)=='2') || (s.charAt(i-1)=='2' && s.charAt(i+1)=='1')){
                        s.setCharAt(i,three);
                    }


                    else if((s.charAt(i-1)=='1' && s.charAt(i+1)=='3') || (s.charAt(i-1)=='3' && s.charAt(i+1)=='1')){
                        s.setCharAt(i,two);
                    }

                    else if((s.charAt(i-1)=='2' && s.charAt(i+1)=='3') || (s.charAt(i-1)=='3' && s.charAt(i+1)=='2')){
                        s.setCharAt(i,one);
                    }

                }//In between


            }//if ?


        }//for

        System.out.println("string is: "+s);
    }

}
