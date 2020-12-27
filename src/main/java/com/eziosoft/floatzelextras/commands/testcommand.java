package com.eziosoft.floatzelextras.commands;

import com.eziosoft.floatzel.Commands.FCommand;
import com.jagrosh.jdautilities.command.CommandEvent;

public class testcommand extends FCommand {

    public testcommand() {
        name = "test";
        category = test;
        help = "tests to see if the bot is alive";
    }

    @Override
    protected void cmdrun(CommandEvent commandEvent) {
        commandEvent.getChannel().sendMessage("test test 1-2-3 can you read this?").queue();
    }
}
