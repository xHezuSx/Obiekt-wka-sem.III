package playlist;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        if (o1.title.compareTo(o2.title)==0) { return o1.artist.compareTo(o2.artist); }
        return o1.title.compareTo(o2.title);
    }
}
