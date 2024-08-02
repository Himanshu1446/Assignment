public class PriorityCaptureRequest implements Comparable<PriorityCaptureRequest> {
    private final CaptureCameraRequest request;


    public PriorityCaptureRequest(CaptureCameraRequest request) {
        this.request = request;
    }

    public CaptureCameraRequest getRequest() {
        return request;
    }

    @Override
    public int compareTo(PriorityCaptureRequest other) {
        //decide algorithm in order to find the highest priority
        return 1;
    }
}

