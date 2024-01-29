package arrayAlg;

public class TestArrayAlg {
    public static void main(String[] args) {
        VideoGame[] tab = {
                new VideoGame("a", "1", 5.45f),
                new VideoGame("b", "2", 1.5f),
                new VideoGame("c", "3", 3.4f),
                new VideoGame("d", "4", 5.2f),
        };
        System.out.println(Main.findMaxIndex(tab));
    }
}
