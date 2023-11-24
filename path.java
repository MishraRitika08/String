public class path {
    public static double shortestDistance(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length()-1;i++){

         if(str.charAt(i)=='N'){
            y++;
         }
         if(str.charAt(i)=='S'){
            y--;
         }
         if(str.charAt(i)=='E'){
            x++;
         }
         if(str.charAt(i)=='W'){
            x--;
         }
         
        }

        int xDist = x*x;
        int yDist = y*y;
        double dist = Math.sqrt(xDist+yDist);

     return  dist;
    }

    public static void main(String[] args) {
        String str="NNNWEEEEW";
        System.out.println(shortestDistance(str));
    }
}
