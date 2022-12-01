package net.wenzuo.codes.designpattern.mediator;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class ChatRoom {

    public void showMessage(User user, String message) {
        System.out.println(user.getName() + ": " + message);
    }

}