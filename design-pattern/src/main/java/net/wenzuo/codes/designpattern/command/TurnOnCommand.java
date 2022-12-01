package net.wenzuo.codes.designpattern.command;

public class TurnOnCommand implements Command {

    private String params;

    public TurnOnCommand(String params) {
        this.params = params;
    }

    @Override
    public void execute() {
        System.out.println("TurnOnCommand: " + params);
    }

}