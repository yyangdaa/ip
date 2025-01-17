package task;

/**
 * Represents an Event in Kapwa
 * 
 * @see Task
 * 
 * @author yyangda
 * @version 0.1
 * @since 2024-03-03
 * 
 */

public class Event extends Task{
    protected String from;
    protected String to;

    public Event(String description, String From, String to) {
        super(description);
        this.type = "E";
        this.from = From;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public void setFrom(String From) {
        this.from = From;
    }

    
    @Override
    public String toString() {
        String isDoneIcon = super.isDone ? "X" : " ";
        return "[" + type + "][" + isDoneIcon + "] " + super.description + " (from: " + from + " to: " + to + ")";
    }
}

