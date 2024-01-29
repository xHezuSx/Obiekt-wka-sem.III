package sports;

public class TestFootballPlayer {
    public static void main(String[] args) {
        FootvallPlayer footvallPlayer = new FootvallPlayer("A", new int[]{1,2,4,5,6});
        FootvallPlayer clonedPlayer = footvallPlayer.clone();
        footvallPlayer.goals[4] = 10;
        System.out.println(footvallPlayer);
        System.out.println(clonedPlayer);

    }
}
