package Observer;

import java.util.ArrayList;
import java.util.List;

//Observable
public class NewsAgency {

    //Powinien trzymać listę interfejsu obserwatorów, tak aby kazdy obserwator mógł się znaleźc w liście
    private final List<Channel> channelsList = new ArrayList<>();

    public List<Channel> getChannelsList() {
        return channelsList;
    }

    //Musi być metoda dodająca observer do listy, a pozniej po niej przejsc i zastosowac DO WSZYSTKICH obiektow w liscie
    public void addObserver(Channel channel) {
        channelsList.add(channel);
    }

    //Dla kazdego obiektu, który implementuje CHANNEL (naszego observera) należy nadać nowe wiadomości
    public void setNews(String news) {
        channelsList.forEach(channel -> channel.update(news));
    }
}
