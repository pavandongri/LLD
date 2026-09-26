package behavioural.chainofresponsibility;

public class TeamLead extends LeaveHandler {
    @Override
    public void handle(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= 2) {
            leaveRequest.setStatus("Teamlead accepted");
            System.out.println("Teamlead accepted leave request");
        } else {
            System.out.println("Team lead cannot accept leave request where no of days > 2");
            this.deligateRequestToNextHandler(leaveRequest);
        }
    }
}
