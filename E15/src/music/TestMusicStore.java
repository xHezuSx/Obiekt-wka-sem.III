package music;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestMusicStore {
    public static void main(String[] args) {
        MusicStore musicStore = new MusicStore("A", "A", new ArrayList<>(Arrays.asList("1","2","3")));
        VinyStore vinyStore = new VinyStore("B", "B", new ArrayList<>(Arrays.asList("4","5","6")), 4);
        System.out.println(musicStore);
        musicStore.addAlbum("Kuki");
        musicStore.removeAlbum("2");
        System.out.println(musicStore);

        System.out.println(vinyStore);

    }
}
