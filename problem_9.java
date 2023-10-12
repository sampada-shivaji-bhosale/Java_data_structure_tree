package java_concepts;

public class problem_9 {
    public static void main(String [] args){
        String str="dFTbnSrOvryT";
        StringBuffer str1=new StringBuffer("");
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                str1.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                str1.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println(str1);
    }
}
