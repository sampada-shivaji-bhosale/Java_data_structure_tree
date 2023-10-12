package java_concepts;

public class Problem_6 {
    public static void main(String[]args){
        int n=45675962;
        int temp=n;
        int prev=Integer.MIN_VALUE;
        int temp2=0;
        while(temp!=0){
            int val=temp%10;
            if(val<=prev){
                System.out.println(prev);
                break;
            }
            prev=val;
            temp=temp/10;
        }
    }
}
