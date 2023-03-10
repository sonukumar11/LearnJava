public class SwitchStatement {
    public static void main(String[] args){
        int value = 1;

//        if(value == 1){
//            System.out.println("Value is 1");
//        }
//        else if(value == 2){
//            System.out.println("value is 2");
//        }
//        else{
//            System.out.println("Value is neither 1 nor 2");
//        }

        int switchValue = 10;

//        switch(switchValue){
//            case 1:
//                System.out.println("value was 1");
//                break;
//            case 2:
//                System.out.println("value was 2");
//                break;
//            default:
//                System.out.println("Value was neither 1 nor 2");
//        }


        //Testing Switch Statement for multiple cases
//        switch(switchValue){
//            case 1:
//                System.out.println("value was 1");
//                break;
//            case 2:
//                System.out.println("value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Value was either 3 or 4 or 5");
//                System.out.println("The value was actually " + switchValue);
//                break;
//            default:
//                System.out.println("Value was neither 1 nor 2");
//        }

        // Enhanced Switch Statement
        switch(switchValue){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");

            case 3 , 4 , 5->{
                System.out.println("Value was either 3 or 4 or 5");
                System.out.println("Value was " + switchValue);
            }
            default -> System.out.println("The Value was neither of the above mentioned value");
        }
    }

//    public static String getQuarter(String month){
//        switch(month){
//            case "January"
//        }
//    }
}
