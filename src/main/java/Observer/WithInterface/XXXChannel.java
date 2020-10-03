package Observer.WithInterface;

public class XXXChannel implements ObserverChannel{

    @Override
    public void update(String news) {
        System.out.println("We are breaking our pornographic stuff beacuse of the very important news! " + news);
    }
}
