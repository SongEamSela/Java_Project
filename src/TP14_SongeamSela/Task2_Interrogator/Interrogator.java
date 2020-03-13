package TP14_SongeamSela.Task2_Interrogator;

public class Interrogator {
    public static void makeItTalk(Talkative subject)
    {
        subject.talk();
    }

    public static void main(String[] args) {
        Cat t = new Cat();
        CuckooClock cc = new CuckooClock(5);
        makeItTalk(cc);
    }
}
