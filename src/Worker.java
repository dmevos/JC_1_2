public class Worker{
    private final OnTaskDoneListener doneCallback;
    private final OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener doneCallback, OnTaskErrorListener errorCallback) {
        this.doneCallback = doneCallback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 40; i++) {
            if (i != 33) {
                doneCallback.onDone("Task " + i + " is done");
            } else {
                errorCallback.onError("Task " + i + " has not been completed");
            }
        }
        System.out.println("На сегодня работяга уработался :)");
    }
}
