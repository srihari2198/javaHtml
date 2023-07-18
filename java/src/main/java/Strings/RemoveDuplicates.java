package Strings;

public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(remove("rree ddwerttubdfffgrr"));
    }
    public static String remove(String s){
        String result = " ";
        result+= s.charAt(0);
        int count=0;
        for(int i=1;i<s.length();i++){
            count=0;
            for(int j=0;j<result.length();j++){
                if(s.charAt(i)==result.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                result+=s.charAt(i);
            }

        }




        return result;
    }
}
