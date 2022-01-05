package com.solvd.pattern.decorator;

/**
 * Я считаю, что так же, как и фасад, этот паттерн можно использовать абсолютно где угодно.
 * В любом месте где у нас есть расширение\маштабирование базового функционала. Над моим примером с шифрованием сообщений, можно сделать
 * ещё один фасад и там зашифрованные сообщения будут сжиматься после шифрования, и распаковываться на стороне клиента, которому оно послано.
 * Таким образом можно будет(в чате) выбирать посылать простые сообщения, зашифрованные, сжимать ли перед отправкой их.
 * Просто переключаясь между декораторами.
 * Ну или если у нас есть много
 * И этих "слоёв"\декораций может быть очень много над любым каким-то простым и базовым действием в программе.
 */
public class Main {

    public static void main(String[] args) {
        EncryptedChat encryptedChat = new EncryptedChat(new Chat());
        ChatUser chatUser1 = new ChatUser();
        chatUser1.setNickName("FirstUser");
        ChatUser chatUser2 = new ChatUser();
        chatUser2.setNickName("SecondUser");
        encryptedChat.register(chatUser1);
        encryptedChat.register(chatUser2);

        encryptedChat.sendMessage(chatUser1, chatUser2, "Hello.");
        encryptedChat.readMessage(chatUser2);
    }

}
