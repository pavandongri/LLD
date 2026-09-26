package behavioural.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        TeamLead teamLead = new TeamLead();
        Manager manager = new Manager();
        Director director = new Director();

        teamLead.setNextHandler(manager);
        manager.setNextHandler(director);

        LeaveRequest leaveRequest = new LeaveRequest(4);
        teamLead.handle(leaveRequest);
        System.out.println("Final Status of leave request = " + leaveRequest.getStatus());
        System.out.println("====");

        leaveRequest = new LeaveRequest(1);
        teamLead.handle(leaveRequest);
        System.out.println("Final Status of leave request = " + leaveRequest.getStatus());
        System.out.println("====");

        leaveRequest = new LeaveRequest(20);
        teamLead.handle(leaveRequest);
        System.out.println("Final Status of leave request = " + leaveRequest.getStatus());
        System.out.println("====");

        leaveRequest = new LeaveRequest(8);
        teamLead.handle(leaveRequest);
        System.out.println("Final Status of leave request = " + leaveRequest.getStatus());
    }
}
