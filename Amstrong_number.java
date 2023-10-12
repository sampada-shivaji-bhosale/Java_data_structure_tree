package java_concepts;

public class Amstrong_number {
    static boolean Amstrong_num(int num){
        int num1=num;
        int num2=num;
        int count=0;
        while(num1!=0){
            count++;
            num1=num1/10;
        }
        int total=0;
        while(num!=0){
            int val=num%10;
            int mult=1;
            for(int j=1;j<count;j++){
                mult=mult*val;
            }
            total=total+mult;
            num=num/10;
        }
        if(total==num2){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        System.out.println(Amstrong_num(1));
    }
}
