
//record BaseballPlayer(String name , String poistion){}

record CricketPlayer(String name , String ranking){}

record FootballPlayer(String name , String position){}

public class Main {
    public static void main(String[] args) {

        Team<CricketPlayer> india = new Team<>("India");
        Team<CricketPlayer> pakistan = new Team<>("Pakistan");
        scoreResult(india , 20 , pakistan , 2);

        var player_1 = new CricketPlayer("Virat Kohli" , "Captain");
        var player_2 = new CricketPlayer("Rohit Sharma" , "Vice Captain");
        india.addTeamMember(player_1);
        india.addTeamMember(player_2);
        india.listTeamMembers();

        Team<FootballPlayer> barcelona = new Team<>("FC barcelona");
        Team<FootballPlayer> madrid = new Team<>("Real Madrid");
        scoreResult(barcelona , 100 , madrid , 10);

        var player1 = new FootballPlayer("Messi" , "Midfield");
        var player2 = new FootballPlayer("Neymar" , "MidCenter");
        barcelona.addTeamMember(player1);
        barcelona.addTeamMember(player2);

        barcelona.listTeamMembers();

    }


    public static void scoreResult(Team team1 , int t1_Score , Team team2 , int t2_Score){
        String message = team1.setScore(t1_Score , t2_Score);
        team2.setScore(t2_Score , t1_Score);

        System.out.println(team1 +  " " + message + " " + team2);
    }
}