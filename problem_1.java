package java_concepts;
import java.util.*;
import java.io.*;
public class problem_1 {
    static int fact(int num){
        int fct=1;
        for(int i=1;i<=num;i++){
            fct=fct*i;
        }
        return fct;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int num2=num;
        while(num2!=0){
            int val=num2%10;
            if(val%2==0){
                System.out.println(fact(val));
            }
            num2=num2/10;
        }
    }
}
