
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Filename:");
        String file = scan.nextLine();
        ArrayList<Team> records = readRecordsFromFile(file);
        
            
        System.out.println("Team:");
        String teams = scan.nextLine();
        int teamCount = 0;
        int wins = 0;
        int losses = 0;

        
        while(true){
        for (Team i:records){
            if (i.getHomeTeam().equals(teams) || i.getVisitingTeam().equals(teams)){
                teamCount++;
            }
           
 
            if ((i.getHomeTeam().equals(teams) || i.getVisitingTeam().equals(teams))) {
                if ( i.getHomeTeam().equals(teams) & i.getHomePoints()>i.getVisitingPoints()) {
                    wins++;
                }else if (i.getVisitingTeam().equals(teams)  & i.getVisitingPoints()>i.getHomePoints()){
                    wins++;
                }
            }
            if ((i.getHomeTeam().equals(teams) || i.getVisitingTeam().equals(teams))) {
                if ( i.getHomeTeam().equals(teams) & i.getHomePoints()<i.getVisitingPoints()) {
                    losses++;
                }else if (i.getVisitingTeam().equals(teams)  & i.getVisitingPoints()<i.getHomePoints()){
                    losses++;
                }
                
            
            }
        }
        System.out.println("Games: "+ teamCount);
        System.out.println("Wins: "+ wins);
        System.out.println("Losses: "+ losses);

        break;
        }
    }
    
    
        
    public static ArrayList<Team> readRecordsFromFile(String file) {
        ArrayList<Team> Teams = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();  
                String[] parts = line.split(",");
                String homeName = parts[0];
                String visitingName = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);
                Teams.add(new Team(homeName,visitingName,homePoints,visitingPoints));
            }
        }catch (Exception e){
                System.out.println("Error:"+ e.getMessage());
                }
        return Teams;
        
        
    }

}
