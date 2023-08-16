package commentsforseriesmovies;

import java.util.ArrayList;

public class Movies {
    private String movieName;
    private String director;
    private ArrayList<Comments> comments;

    public Movies(String movieName, String director) {
        this.movieName = movieName;
        this.director = director;
        this.comments = new ArrayList<Comments>();
    }

    public void addComments(Comments comments){
        this.comments.add(comments);
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<Comments> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comments> comments) {
        this.comments = comments;
    }
}
