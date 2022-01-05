package com.solvd.pattern.listener;

/**
 * Я долго думал над этим, но я не представляю как это можно в тестировании использовать.
 * А если в жизни то приходят на ум в основном мессенджеры, почтовые рассылки, всякого рода клиент-серверные приложения по подпискам,
 * клиенты онлайн игр с разными регионами, какие-нибудь групповые оповещения по календарю.
 * Мне кажется это широко используется в любых программах где множество клиентов взаимодействуют друг с другом.
 */
public class Main {

    public static void main(String[] args) {
        OnlineGame onlineGame = new OnlineGame();

        onlineGame.registerPlayer(ServerRegion.RU, new Player("ru_nickName1"));
        onlineGame.registerPlayer(ServerRegion.RU, new Player("ru_nickName2"));
        onlineGame.registerPlayer(ServerRegion.RU, new Player("ru_nickName3"));

        onlineGame.registerPlayer(ServerRegion.EUW, new Player("euw_nickName1"));
        onlineGame.registerPlayer(ServerRegion.EUW, new Player("euw_nickName2"));

        onlineGame.registerPlayer(ServerRegion.EUNE, new Player("eune_nickName1"));
        onlineGame.registerPlayer(ServerRegion.JP, new Player("jp_nickName1"));

        onlineGame.registerPlayer(ServerRegion.NA, new Player("na_nickName1"));
        onlineGame.registerPlayer(ServerRegion.NA, new Player("na_nickName2"));


        onlineGame.notify(ServerRegion.EUW, Status.ONLINE);
        onlineGame.notify(ServerRegion.EUNE, Status.ONLINE);
        onlineGame.notify(ServerRegion.JP, Status.ONLINE);
        onlineGame.notify(ServerRegion.RU, Status.OFFLINE);
        onlineGame.notify(ServerRegion.NA, Status.UPDATE_NEEDED);
    }

}
