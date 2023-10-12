package java_concepts;

public class problem_10 {
    public static void main(String[]args){
        System.out.println("In the main()");
        String str="mam";
        boolean bool=true;
        int len=str.length()/2;
        for(int i=0;i<len;i++){
            int n=str.charAt(i);
            int last=str.charAt((str.length()-1)-i);
            if(Character.toLowerCase((char)n)!=Character.toLowerCase((char)last)){
                bool=false;
                break;
            }
        }
        System.out.println(bool);
    }
}
