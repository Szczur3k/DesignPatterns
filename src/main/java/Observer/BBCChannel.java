package Observer;

//Observer
public class BBCChannel implements Channel {

    @Override
    public void update(String news) {
        System.out.println("It's the BBC Channel ant here the news: " + news);
    }
}
