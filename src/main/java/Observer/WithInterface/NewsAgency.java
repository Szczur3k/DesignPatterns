package Observer.WithInterface;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements ObservableAgency {

    private final List<ObserverChannel> channelList = new ArrayList<>();

    @Override
    public void addObserver(ObserverChannel observerChannel) {
        channelList.add(observerChannel);
    }

    @Override
    public void removeObsserver(ObserverChannel observerChannel) {
        channelList.remove(observerChannel);

    }

    @Override
    public void giveInfoObserver(String news) {
        channelList.forEach(observerChannel -> observerChannel.update(news));

    }
}
