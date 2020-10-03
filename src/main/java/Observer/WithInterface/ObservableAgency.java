package Observer.WithInterface;

public interface ObservableAgency {
    void addObserver(ObserverChannel observerChannel);
    void removeObsserver(ObserverChannel observerChannel);
    void giveInfoObserver(String news);
}
