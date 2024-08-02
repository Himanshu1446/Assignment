
public class CaptureCameraRequest {

    private final SuccessCallback successCallback;

    public FailureCallback getFailureCallback() {
        return failureCallback;
    }

    private final FailureCallback failureCallback;

    public int getPriority() {
        return priority;
    }

    private final int priority; // decide the priority of the request

    public CaptureCameraRequest(SuccessCallback successCallback, FailureCallback failureCallback, int priority) {
        this.successCallback = successCallback;
        this.failureCallback = failureCallback;
        this.priority = priority;
    }

    public SuccessCallback getSuccessCallback() {
        return successCallback;
    }
}
