package SecondTry.Source_Code.OOD.Lessons11_Flyweight;

import java.util.HashMap;

/**
 * Created by user on 04.11.2018.
 */
public class PlayersFactory {
    private static final HashMap<String, Player> players = new HashMap<>();

    public static Player getPlayer(String team) {
        Player player = null;
        if (players.containsKey(team)) {
            player = players.get(team);
        } else {
            switch (team) {
                case "Terrorist":
                    player = new Terrorist();
                    System.out.println("Terrorist team created!");
                    break;
                case "Counter-Terrorist":
                    player=new CounterTerrorist();
                    System.out.println("Counter-Terrorist team created!");
                    break;
                    default:
                        System.out.println("Spectator detected!");
            }
            players.put(team,player);
        }

        return player;
    }
}
