package org.example;

import java.util.Arrays;
import java.util.List;

public class PlayerService
{
    private List<Player> players = Arrays.asList(
                            new Player(1, "Kalyan", "India", 22),
                            new Player(2, "Aman", "UK", 22),
                            new Player(1, "Maya", "LK", 23),
                            new Player(1, "Abhi", "USA", 29)
    );

    public Player getPlayerByName(String name)
    {
        return players.stream().filter(p-> p.getName().equals(name)).findFirst().get();

    }

    public Player getPlayerById(int id)
    {
        return players.stream().filter(p-> p.getId() == id).findFirst().get();
    }
}
