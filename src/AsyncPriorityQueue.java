import java.util.concurrent.PriorityBlockingQueue;

public class AsyncPriorityQueue {


        private final PriorityBlockingQueue<PriorityCaptureRequest> queue = new PriorityBlockingQueue<>();

        public void submitRequest(CaptureCameraRequest request) {
            queue.add(new PriorityCaptureRequest(request));
        }

        public PriorityCaptureRequest takeRequest() {
            return queue.poll();
        }

}
