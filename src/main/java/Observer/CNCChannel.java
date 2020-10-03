package Observer;

//Observer
public class CNCChannel implements Channel {

    @Override
    public void update(String news) {
        System.out.println("It's the CNC channel and here the news: " + news);
    }
}
