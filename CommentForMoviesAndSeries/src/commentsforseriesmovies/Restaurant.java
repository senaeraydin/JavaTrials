package commentsforseriesmovies;

import java.util.ArrayList;

public class Restaurant {
    private String restaurantName;

    private ArrayList<Comments> commentsforRestaurant;

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
        this.commentsforRestaurant = new ArrayList<Comments>();
    }

    public String getRestaurantName() {
        return restaurantName;
    }
    public void addComments(Comments comments){
        this.commentsforRestaurant.add(comments);
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public ArrayList<Comments> getCommentsforRestaurant() {
        return commentsforRestaurant;
    }

    public void setCommentsforRestaurant(ArrayList<Comments> commentsforRestaurant) {
        this.commentsforRestaurant = commentsforRestaurant;
    }
}
