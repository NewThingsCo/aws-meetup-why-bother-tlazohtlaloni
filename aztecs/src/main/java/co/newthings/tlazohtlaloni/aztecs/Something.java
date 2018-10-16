package co.newthings.tlazohtlaloni.aztecs;

public class Something {

    private String positiveMessage;
    private String lessPositiveMessage;
    private String backtrackingMessage;

    public Something() {
    }

    public Something(String positiveMessage, String lessPositiveMessage, String backtrackingMessage) {
        this.positiveMessage = positiveMessage;
        this.lessPositiveMessage = lessPositiveMessage;
        this.backtrackingMessage = backtrackingMessage;
    }

    public String getPositiveMessage() {
        return positiveMessage;
    }

    public void setPositiveMessage(String positiveMessage) {
        this.positiveMessage = positiveMessage;
    }

    public String getLessPositiveMessage() {
        return lessPositiveMessage;
    }

    public void setLessPositiveMessage(String lessPositiveMessage) {
        this.lessPositiveMessage = lessPositiveMessage;
    }

    public String getBacktrackingMessage() {
        return backtrackingMessage;
    }

    public void setBacktrackingMessage(String backtrackingMessage) {
        this.backtrackingMessage = backtrackingMessage;
    }
}
