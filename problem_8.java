package java_concepts;

public class problem_8 {
    public static void main(String[]args){
        String str="adgtioseobju";
        int counta=0,counte=0,counti=0,counto=0,countu=0;
        for(int i=0;i<str.length();i++){
            switch(str.charAt(i)){
                case 'a':
                    counta++;
                    break;
                case 'e':
                    counte++;
                    break;
                case 'i':
                    counti++;
                    break;
                case 'o':
                    counto++;
                    break;
                case 'u':
                    countu++;
            }
        }
        System.out.println("a="+counta);
        System.out.println("e="+counte);
        System.out.println("i="+counti);
        System.out.println("o="+counto);
        System.out.println("u="+countu);
    }
}
