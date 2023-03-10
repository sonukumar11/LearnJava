public class JavaMethods {
    public static void main(String [] args){
        System.out.println("Methods in Java Programming");
        boolean gameOver = true;
        int score = 100;
        int levelCompleted = 7;
        int bonus = 200;
        int finalScore = calculateScore(gameOver , score , levelCompleted , bonus);
        System.out.println("The Final Score is : " + finalScore);
        score = 1500;
        levelCompleted = 3;
        bonus = 300;
        finalScore = calculateScore(gameOver , score , levelCompleted , bonus);
        System.out.println("The Final Score is : " + finalScore);
    }

    public static int calculateScore(boolean gameOver , int score , int levelCompleted , int bonus){
        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted  * bonus);
            finalScore += 100;

        }
        return finalScore;
    }
}
