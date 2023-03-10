public class Main {

    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            Student s = new Student(
                    "Sonu" ,
                    "1000" + i,
                    "27 July 2002" ,
                    "Java Masterclass"
            );

            System.out.println(s);
        }
    }
}
