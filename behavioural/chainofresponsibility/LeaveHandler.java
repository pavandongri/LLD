package behavioural.chainofresponsibility;

public abstract class LeaveHandler {
    private LeaveHandler nextLeaveHandler;

    public abstract void handle(LeaveRequest leaveRequest);

    public void setNextHandler(LeaveHandler nextLeaveHandler) {
        this.nextLeaveHandler = nextLeaveHandler;
    }

    protected void deligateRequestToNextHandler(LeaveRequest leaveRequest) {
        if (this.nextLeaveHandler != null) {
            this.nextLeaveHandler.handle(leaveRequest);

        } else {
            leaveRequest.setStatus("Rejected");
        }
    }
}
