package Observer.WithInterface;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        BBCChannel bbcChannel = new BBCChannel();
        CNCChannel cncChannel = new CNCChannel();
        XXXChannel xxxChannel = new XXXChannel();
        newsAgency.addObserver(bbcChannel);
        newsAgency.addObserver(cncChannel);
        newsAgency.addObserver(xxxChannel);
        newsAgency.giveInfoObserver("World war 3 incoming!");
        System.out.println();
        newsAgency.removeObsserver(xxxChannel);
        newsAgency.giveInfoObserver("Donald Trump have a coronavirus");
    }
}
