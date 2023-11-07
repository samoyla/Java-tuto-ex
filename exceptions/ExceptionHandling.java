public class ExceptionHandling {
     public static void main(String[] args){
       
         try{
             getInt();
        }catch(NumberFormatException | NullPointerException e){
            System.out.println("hey dude, you can't make an int out of that");
        }
        finally{
            System.out.println("in the finally block");
        }
        System.out.println("end here");
    }

        private static void getInt(){
         int myInt = Integer.parseInt("1");
         System.out.println("in try");
         return;
    }
}
