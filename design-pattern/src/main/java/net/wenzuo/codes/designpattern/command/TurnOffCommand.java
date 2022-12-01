package net.wenzuo.codes.designpattern.command;

public class TurnOffCommand implements Command {

    private String params;

    public TurnOffCommand(String params) {
        this.params = params;
    }

    @Override
    public void execute() {
        System.out.println("TurnOffCommand: " + params);
    }

}