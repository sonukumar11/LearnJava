public class IfElse{
        public static void main(String[] args){
            boolean is_valid = false;
            boolean is_perfect = true;

            if(is_valid == true && is_perfect == true){
                System.out.println("The Item is both valid and perfect");
            }
            else if(is_valid == true && is_perfect == false){
                System.out.println("The Item is Valid but not perfect");
            }
            else if(is_valid == true || is_perfect == true){
                System.out.println("The Item is either valid or perfect");
            }
            else{
                System.out.println("The Item is neither valid not perfect");
            }

            String str = 10 > 2 ? "Result is True" : " Result is false";
            System.out.println(str);
        }
}