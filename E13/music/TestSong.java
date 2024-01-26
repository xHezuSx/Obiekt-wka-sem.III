package E13.music;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = {
                new Song("A", "1", 123),
                new Song("B", "2", 23),
                new Song("C", "3", 123),
                new Song("D", "4", 5432),
        };
        System.out.println("przed sortowaniem: ");
        for(var el: songs){
            System.out.println(el);
        }
        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println("po sortowaniu: ");
        for(var el: songs){
            System.out.println(el);
        }
    }
}
