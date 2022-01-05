package com.solvd.pattern.listener;

import java.util.*;

public class OnlineGame {

    private static final Map<ServerRegion, List<Player>> allPlayers = new HashMap<>();

    public OnlineGame() {
        Arrays.stream(ServerRegion.values())
                .forEach(serverRegion -> allPlayers.put(serverRegion, new ArrayList<>()));
    }

    public void registerPlayer(ServerRegion serverRegion, Player player) {
        List<Player> players = allPlayers.get(serverRegion);
        players.add(player);
    }

    public void banPlayer(ServerRegion serverRegion, Player player) {
        List<Player> players = allPlayers.get(serverRegion);
        players.remove(player);
    }

    public void notify(ServerRegion serverRegion, Status status) {
        List<Player> players = allPlayers.get(serverRegion);
        players.forEach(player -> player.onStatusChanged(status));
    }

}
