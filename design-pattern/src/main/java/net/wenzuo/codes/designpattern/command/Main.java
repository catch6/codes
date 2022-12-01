package net.wenzuo.codes.designpattern.command;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("是否打开？Y/N");
        String event = scanner.nextLine();

        Command command;
        if (event.equalsIgnoreCase("Y")) {
            command = new TurnOnCommand("turn-on");
        } else if (event.equalsIgnoreCase("N")) {
            command = new TurnOffCommand("turn-off");
        } else {
            throw new UnsupportedOperationException("未知命令");
        }
        command.execute();
    }

}