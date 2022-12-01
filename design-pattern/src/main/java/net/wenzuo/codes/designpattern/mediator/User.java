package net.wenzuo.codes.designpattern.mediator;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class User {

    private String name;
    private ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        chatRoom.showMessage(this, message);
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public ChatRoom getChatRoom() {
        return chatRoom;
    }

}