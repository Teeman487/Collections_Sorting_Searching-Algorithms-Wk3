package Task_Week3;

public enum StatusType {
    teacher(3),
    seniorStudent(2),
    juniorStudent(1);

    // Attributes repeated in Enum
    private int priority;

    // Constructor on behalf of priority
    StatusType(int priority) {
        this.priority = priority;
    }
    // Getter method
    public int getPriority() {
        return priority;
    }



}