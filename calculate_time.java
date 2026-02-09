public class calculate_time {

    String name;
    String priority;
    String status;

    long startTime;
    long endTime;

    long getTimeSpent() {
        return endTime - startTime;
    }
}
