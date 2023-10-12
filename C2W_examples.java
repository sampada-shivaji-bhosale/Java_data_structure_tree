package java_concepts;

public class C2W_examples {
    public static void main(String[]args){
        System.out.println("In side the main()");
        int temp=4;
        for(int i=1;i<=4;i++){
            if(i%2!=0){
                for(int k=temp-1;k>=temp-4;k--){
                    int n='A'+k;
                    System.out.print(Character.toUpperCase((char)n));
                }
            }
            else{
                for(int k=temp-1;k<temp+3;k++){
                    int n='A'+k;
                    System.out.print(Character.toLowerCase((char)n));
                }
            }
            temp=temp+1;
            System.out.println();
        }
    }
}
