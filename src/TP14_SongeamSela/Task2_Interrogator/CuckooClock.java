package TP14_SongeamSela.Task2_Interrogator;

public class CuckooClock extends Clock
        implements Talkative {
    protected int hour;

    public CuckooClock(int hour) {
        setHour(hour);
    }

    public void setHour(int hour) {
        if(hour < 1) this.hour = 1;
        else this.hour = Math.min(hour, 12);
    }

    @Override
    public void talk() {
        for(int i=1;i<=hour;i++) {
            System.out.print("Cuckoo ");
        }
        System.out.println();
    }
}
