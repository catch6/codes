package net.wenzuo.codes.designpattern.mediator;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class Main {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User john = new User("John");
        User bob = new User("Bob");

        john.setChatRoom(chatRoom);
        bob.setChatRoom(chatRoom);

        john.sendMessage("Hello");
        bob.sendMessage("Hi");
    }

}