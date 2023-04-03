
import  java.util.*;

public class Team <T> {
    private String teamName;
    private ArrayList<T> teamMembers = new ArrayList<>();

    private int totalWins = 0;

    private int totalLosses =  0;

    private int totalTies = 0;

    public Team(String teamName){

        this.teamName = teamName;
    }

    public void addTeamMember(T player){
        System.out.println("The type of the parameter is " + player.getClass());
        if(teamMembers.contains(player) == false){
            teamMembers.add(player);
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName + " Roster: ");
        System.out.println(teamMembers.toString());
    }

    public int ranking(){
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore , int theirScore){
        String message = "lost to";

        if(ourScore > theirScore){
            totalWins++;
            message = "beat";
        }
        else if(ourScore == theirScore){
            totalTies++;
            message = "Tied";
        }
        else{
            totalLosses++;
        }

        return  message;

    }

    @Override
    public String toString(){
        return teamName + "( Ranked " + ranking() + ")";
    }
}
