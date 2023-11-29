public class anagram{
     public static boolean checkAnagran(String str1,String str2){

        //check length
        if(str1.length()!=str2.length()){
            return false;
        }

        int count[]=new int[26];

    //filling 1 according t index of letter
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i) - 'a']++ ;      
        }

       
        for(int i=0;i<str1.length();i++){
            count[str2.charAt(i) - 'a']--;
        }

        for(int i=0;i<str2.length();i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) {
    String str1="libble";
    String str2="bubble";
    System.out.println(checkAnagran(str1, str2));
}
}