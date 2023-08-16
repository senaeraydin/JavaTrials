package commentsforseriesmovies;

import java.util.ArrayList;

public class Games {
    private String gameName;
    private String developerCompany;

    private ArrayList<Comments> commentsforGames;

    public Games(String gameName, String developerCompany) {
        this.gameName = gameName;
        this.developerCompany = developerCompany;
        this.commentsforGames = new ArrayList<Comments>();
    }

    public void addComments(Comments comments){
        this.commentsforGames.add(comments);
    }
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getDeveloperCompany() {
        return developerCompany;
    }

    public void setDeveloperCompany(String developerCompany) {
        this.developerCompany = developerCompany;
    }

    public ArrayList<Comments> getCommentsforGames() {
        return commentsforGames;
    }

    public void setCommentsforGames(ArrayList<Comments> commentsforGames) {
        this.commentsforGames = commentsforGames;
    }
}
