package Pro3;
public class StopWatch{
    private double startTime,endTime;
   
    public void start() {
        startTime = System.currentTimeMillis(); 
    }

    public void stop() {
        endTime = System.currentTimeMillis(); 
    }

    public Double getElapsedTime() {
        return (endTime-startTime);
    }

}