import commentsforseriesmovies.*;

import java.awt.print.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Movies movie_1 = new Movies("Iron man", "Jon Favreau");

        Comments comment1 = new Comments("Totally complete sci-fi comic book action movie with an excellent performance from Downey supported by a simple but solid script, superb effects and brilliant score.",
                "Carrie Rickey", 4.7);
        Comments comment2 = new Comments("MUST WATCH!",
                "John Bryan", 5.0);
        Comments comment3 = new Comments("You can spend your time on better things...",
                "Ellia Mondy", 1.6);
        Comments comment4 = new Comments("NOT RECOMMENDED!",
                "Patrick Mess", 1.9);
        Comments comment5 = new Comments("That is a very good romantic and comedy movie.",
                "Patrick Mess", 4.7);
        Comments comment6 = new Comments("Very Scary but recommended",
                "Patrick Mess", 3.8);
        Comments comment7 = new Comments("Interesting",
                "Patrick Mess", 4.0);
        Comments comment8 = new Comments("Not good",
                "Patrick Mess", 1.0);
        Comments comment9 = new Comments("Good",
                "Patrick Mess", 3.5);

        movie_1.addComments(comment1);
        movie_1.addComments(comment2);
        movie_1.addComments(comment3);
        movie_1.addComments(comment4);

        Movies movie_2 = new Movies("One-Way to Tomorrow", "Ozan Açıktan");

        movie_2.addComments(comment2);
        movie_2.addComments(comment5);

        Movies movie_3 = new Movies("Scream", "Wes Craven");
        movie_3.addComments(comment6);

        Books book1 = new Books("Animal Farm", "George Orwell","fable");
        Books book2 = new Books("Alice in Wonderland", "Lewis Carrol", "fable");

        book1.addComments(comment8);
        book2.addComments(comment9);

        Games games1 = new Games("Among Us", "InnerSloth");
        games1.addComments(comment7);

        Restaurant restaurant1 = new Restaurant("Palm & Pine");
        restaurant1.addComments(comment9);



        System.out.println("Welcome to our website for books & movies & games & Restaurant reviews.");
        
        Scanner input = new Scanner(System.in);


        while(true) {
            System.out.println("Press: \n" +  "1 for movies comments" + "\n" + "2 for books comments"+
                    "\n" + "3 for games comments" + "\n" + "4 for restaurant comments.");

            int number = input.nextInt();

            if (number == 1) {
                System.out.println("YOU SEE THE MOVIES COMMENTS");
                System.out.println("******Comments for " + movie_1.getMovieName() + "1 is: ******\n");
                for (Comments comments : movie_1.getComments()) {

                    System.out.println("Comment : " + comments.getComment() + "\n" + "Commentator name: " + comments.getCommentatorName() +
                            "\n" + "Evaluation Score: " + comments.getEvaluationScore() + "\n");

                }
                System.out.println("******Comments for " + movie_2.getMovieName() + " is: ******\n");
                for (Comments comments : movie_2.getComments()) {

                    System.out.println("Comment : " + comments.getComment() + "\n" + "Commentator name: " + comments.getCommentatorName() +
                            "\n" + "Evaluation Score: " + comments.getEvaluationScore() + "\n");

                }
                System.out.println("******Comments for " + movie_3.getMovieName() + " is: ******\n");
                for (Comments comments : movie_3.getComments()) {

                    System.out.println("Comment : " + comments.getComment() + "\n" + "Commentator name: " + comments.getCommentatorName() +
                            "\n" + "Evaluation Score: " + comments.getEvaluationScore() + "\n");

                }
            } else if (number == 2) {
                System.out.println("YOU SEE THE BOOKS COMMENTS");
                for (Comments comments : book1.getCommentsforBook()) {

                    System.out.println("Comment : " + comments.getComment() + "\n" + "Commentator name: " + comments.getCommentatorName() +
                            "\n" + "Evaluation Score: " + comments.getEvaluationScore() + "\n");

                }
                System.out.println("******Comments for " + movie_2.getMovieName() + " is: ******\n");
                for (Comments comments : book2.getCommentsforBook()) {

                    System.out.println("Comment : " + comments.getComment() + "\n" + "Commentator name: " + comments.getCommentatorName() +
                            "\n" + "Evaluation Score: " + comments.getEvaluationScore() + "\n");

                }
            } else if (number == 3) {
                System.out.println("YOU SEE THE GAMES COMMENTS");
                for (Comments comments : games1.getCommentsforGames()) {

                    System.out.println("Comment : " + comments.getComment() + "\n" + "Commentator name: " + comments.getCommentatorName() +
                            "\n" + "Evaluation Score: " + comments.getEvaluationScore() + "\n");

                }
            } else if (number == 4) {
                System.out.println("YOU SEE THE RESTAURANT COMMENTS");
                for (Comments comments : restaurant1.getCommentsforRestaurant()){

                    System.out.println("Comment : " + comments.getComment() + "\n" + "Commentator name: " + comments.getCommentatorName() +
                            "\n" + "Evaluation Score: " + comments.getEvaluationScore() + "\n");

                }
            }else
                break;
        }

/*
            if(number<0 && number >5){
                System.out.println("Enter valid number");
            } else

 */

        /*

        System.out.println("Comments for " + movie_1.getMovieName()+ " is: \n");
        for(Comments comments: movie_1.getComments()){

            System.out.println("Comment : " + comments.getComment()+ "\n"+ "Commentator name: " + comments.getCommentatorName()+
                    "\n" + "Evaluation Score: " + comments.getEvaluationScore() + "\n");

        }

        System.out.println("Comments for " + movie_2.getMovieName()+ " is: \n");
        for(Comments comments: movie_2.getComments()){

            System.out.println("Comment : " + comments.getComment()+ "\n"+ "Commentator name: " + comments.getCommentatorName()+
                    "\n" + "Evaluation Score: " + comments.getEvaluationScore() + "\n");

        }

        System.out.println("Comments for " + movie_3.getMovieName()+ " is: \n");
        for(Comments comments: movie_3.getComments()){

            System.out.println("Comment : " + comments.getComment()+ "\n"+ "Commentator name: " + comments.getCommentatorName()+
                    "\n" + "Evaluation Score: " + comments.getEvaluationScore() + "\n");
            
        }

         */

    }
}