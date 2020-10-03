package Observer.WithInterface;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addObserver(new BBCChannel());
        newsAgency.addObserver(new CNCChannel());
        newsAgency.giveInfoObserver("World war 3 incoming!");
    }
}
