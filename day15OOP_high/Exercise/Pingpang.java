package Exercise;

public class Pingpang extends Athlete implements Speak{
    @Override
    public void study() {
        System.out.println("在打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("在说英语");
    }
}
