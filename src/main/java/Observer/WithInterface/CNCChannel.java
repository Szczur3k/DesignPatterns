package Observer.WithInterface;

public class CNCChannel implements ObserverChannel {
    @Override
    public void update(String news) {
        System.out.println("CNC today's news: " + news);
    }
}
