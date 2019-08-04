import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("");
        System.out.println("Top 25 Players based on Penalty Amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("");
        System.out.println("Statistics For Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("");
        System.out.println("Statistics For Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println("");
        System.out.println("Players In Anaheim Ducks Ordered By Points");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        
    }
}
