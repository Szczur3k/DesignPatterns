package Observer;

public class Main {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addObserver(new BBCChannel());
        newsAgency.addObserver(new CNCChannel());
        newsAgency.setNews("The World War 3 is comming soon!");

    }
}

/*
Plusy:
- Można dodawać niezliczoną ilośc obserwatorów
- Luźna relacja między obserwatorem, a obiektem obserwowanym (observable)
- Jeden obserwator może obserwować kilka obiektów

Przykładem observera może być eventListener(Click click) - nasłuchuje czy coś się stanie, jeśli tak to wykonuje działanie

 */
