package com.eziosoft.floatzelextras.commands;

import com.eziosoft.floatzel.Commands.FCommand;
import com.eziosoft.floatzelextras.BrainFuck;
import com.jagrosh.jdautilities.command.CommandEvent;

public class fuck extends FCommand {
    public fuck(){
        name = "brainfuck";
        help = "Parse and execute a Floatzel BrainFuck program";
        category = other;
    }

    protected void cmdrun(CommandEvent event) throws NullPointerException{
        event.reply("Parsing brainfuck, please wait...");
        event.getChannel().sendTyping().queue();
        event.reply(BrainFuck.ParseBrainFuck(argsplit[0]));
        return;
    }
}
