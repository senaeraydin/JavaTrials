package commentsforseriesmovies;

public class Comments {
    private String comment;
    private String commentatorName;
    private double evaluationScore;

    public Comments(String comment, String commentatorName, double evaluationScore) {
        this.comment = comment;
        this.commentatorName = commentatorName;
        this.evaluationScore = evaluationScore;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentatorName() {
        return commentatorName;
    }

    public void setCommentatorName(String commentatorName) {
        this.commentatorName = commentatorName;
    }

    public double getEvaluationScore() {
        return evaluationScore;
    }

    public void setEvaluationScore(double evaluationScore) {
        this.evaluationScore = evaluationScore;
    }
}
