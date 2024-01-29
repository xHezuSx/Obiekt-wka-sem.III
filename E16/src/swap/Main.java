package swap;

public class Main {

    static <T> void swapElements(T[] tab, int first, int second){
        T temp = tab[first];
        tab[first] = tab[second];
        tab[second] = temp;
    }

    public static void main(String[] args) {
        VideoGame[] videoGames = {
          new VideoGame("A", "1", 4.0f),
          new VideoGame("B", "2", 3.5f),
          new VideoGame("C", "3", 2.0f),
          new VideoGame("D", "4", 4.9f)};

        for (var el: videoGames){
            System.out.println(el);
        }

        System.out.println("=======");
        swapElements(videoGames, 2, 3);

        for (var el: videoGames){
            System.out.println(el);
        }
    }
}
