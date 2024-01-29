package playlist;

import java.util.Arrays;
import java.util.Collections;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = {
                new Song("C", "3", 924),
                new Song("B", "2", 100),
                new Song("A", "1", 312),
                new Song("E", "5", 99),
                new Song("D", "4", 100),
        };

        for (var el : songs){
            System.out.println(el);
        }
        DurationComparator dur = new DurationComparator();
        ArtistTitleComparator arti = new ArtistTitleComparator();
        Arrays.sort(songs, dur.thenComparing(arti));
        System.out.println();
        for (var el : songs){
            System.out.println(el);
        }
    }
}
