public class file3 {

    public static void toUpper(String str){
        for(int i=0;i<str.length();i++){
            System.out.print((str.charAt(i)).toUpperCase());
        }
    }
    public static void main(String[] args) {
        String name="itsmy name";
        toUpper(name);
        
    }
}
