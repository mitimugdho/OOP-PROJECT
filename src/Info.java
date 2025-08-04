public class Info {
    private final String roll;
    private final String name;
    private final String batch;
    private int attendCount;
    private int classCount=0;
    private double percentage;

    public Info(String name, String roll, String batch){
        this.name=name;
        this.batch = batch;
        this.roll=roll;
        attendCount=0;

    }
    public void percentage(int period){
        attendCount+=period;
        classCount++;
        percentage=attendCount/classCount*100.0;
    }

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public String getBatch() {
        return batch;
    }
}