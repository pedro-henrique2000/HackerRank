import java.util.*;

class Checker implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        Integer scorePlayerOne = o1.score;
        Integer scorePlayerTwo = o2.score;
        int result = scorePlayerTwo.compareTo(scorePlayerOne);
        if(result == 0)
            return o1.name.compareTo(o2.name);

        return result;
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class JavaComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
