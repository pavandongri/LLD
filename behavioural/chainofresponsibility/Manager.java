package behavioural.chainofresponsibility;

public class Manager extends LeaveHandler {
    @Override
    public void handle(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= 5) {
            leaveRequest.setStatus("Manager accepted");
            System.out.println("Manager accepted leave request");
        } else {
            System.out.println("Manager cannot accept leave request where no of days > 5");
            this.deligateRequestToNextHandler(leaveRequest);
        }
    }
}
