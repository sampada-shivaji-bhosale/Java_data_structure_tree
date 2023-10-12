package java_concepts;

public class problem_4 {
    public static void main(String[]args){
        System.out.println("In the problem_4");
        int temp=5;
        int temp1=0;
        for(int i=temp;i>0;i--){
            for(int j=i;j>0;j--){
                int n='A'+temp1;
                if(j%2==0) {
                    System.out.print(Character.toLowerCase((char) n));
                }else {
                    System.out.print((char) n);
                }
                if(i%2==0){
                    temp1--;
                }
                else{
                    temp1++;
                }
            }
            if(i%2==0){
                temp1++;
            }
            else{
                temp1--;
            }
            System.out.println();
        }
    }
}
