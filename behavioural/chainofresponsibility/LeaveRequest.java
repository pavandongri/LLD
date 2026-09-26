package behavioural.chainofresponsibility;

public class LeaveRequest {
    private int days;
    private String status;

    public LeaveRequest(int days) {
        this.days = days;
        this.status = "Pending";
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDays() {
        return this.days;
    }

    public String getStatus() {
        return this.status;
    }
}
