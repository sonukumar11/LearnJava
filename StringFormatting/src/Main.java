public class Main {
    public static void main(String[] args){
        String str = "hello World";
        String newStr = str.concat(" And Goodbye");

        StringBuilder strBuilder = new StringBuilder("hello World");
        strBuilder.append(" And GoodBye");

        printInformation(newStr);
        printInformation(strBuilder);


        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        printInformation(emptyStart);
        printInformation(emptyStart32);
    }

    public static void printInformation(String str){
        System.out.println("String = " + str);
        System.out.println("String Length is : " + str.length());


    }

    public static void printInformation(StringBuilder strbuilder){
        System.out.println("StringBuilder = " + strbuilder);
        System.out.println("StringBuilder Length is : " + strbuilder.length());
        System.out.println("Capacity is : " + strbuilder.capacity());

    }

    public static void stringInspection(String str){
        if(str.isEmpty()){
            System.out.println("String is Empty..");
        }
        int len = str.length();
        System.out.println("\nLength = " + len);
        System.out.println("First char is : " + str.charAt(0));
        System.out.println("Last char is  : " + str.charAt(len - 1));

        System.out.println("The index of r is : " + str.indexOf('r'));
        System.out.println("The index of World is : " + str.indexOf("world"));
    }

    public static void stringComparisonMethods(){
        String str = "Hello World";

        String helloworldLower = str.toLowerCase();

        if(str.equals(helloworldLower)){
            System.out.println("Values match totally");
        }

        if(str.equalsIgnoreCase(helloworldLower)){
            System.out.println("Values match totally but by Ignoring the case");
        }

        if(str.startsWith("Hello")){
            System.out.println("String StartsWith Hello");

        }

        if(str.endsWith("World")){
            System.out.println("String end with World");
        }

        if(str.contentEquals("Hello World")){
            System.out.println("Content Matches exactly...");
        }


    }
}
