public class file4 {
    public static String compare(String str1,String str2){
      int res =str1.compareTo(str2);

      if(res==0){
        return "Equal";
      }
      else if(res < 0){
        return "second is bigger";
      }
      else{
        return "First is larger";
      }
    }
    public static void main(String[] args) {
        //String name="itsmy name";
       System.out.println(compare("anana","anana"));
        
}
}