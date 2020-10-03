package Observer.WithInterface;

public class BBCChannel implements ObserverChannel {
    @Override
    public void update(String news) {
        System.out.println("BBC today's news: " + news);
    }
}
