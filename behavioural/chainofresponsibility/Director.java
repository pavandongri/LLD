package behavioural.chainofresponsibility;

public class Director extends LeaveHandler {
    @Override
    public void handle(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= 10) {
            leaveRequest.setStatus("Director Accepted");
            System.out.println("Director accepted leave request");
        } else {
            System.out.println("Director cannot accept leave request where no of days > 10");
            this.deligateRequestToNextHandler(leaveRequest);
        }
    }
}
