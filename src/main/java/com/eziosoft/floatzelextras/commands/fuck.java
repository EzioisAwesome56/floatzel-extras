package com.eziosoft.floatzelextras.commands;

import com.eziosoft.floatzel.SlashCommands.FSlashableCommand;
import com.eziosoft.floatzel.SlashCommands.Objects.SlashActionGroup;
import com.eziosoft.floatzelextras.BrainFuck;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;

public class fuck extends FSlashableCommand {
    public fuck(){
        name = "brainfuck";
        help = "Parse and execute a Floatzel BrainFuck program";
        category = other;
        sag = SlashActionGroup.FUN;
    }

    public void SlashCmdRun(SlashCommandEvent slashCommandEvent) {
        if (slashCommandEvent.getOption("arg") == null){
            slashCommandEvent.getHook().editOriginal("Error: you did not provide a brainfuck program to run in the \"arg\" option!").queue();
            return;
        }
        slashCommandEvent.getHook().editOriginal(BrainFuck.ParseBrainFuck(slashCommandEvent.getOption("arg").getAsString())).queue();
    }

    protected void cmdrun(CommandEvent event) throws NullPointerException{
        event.reply("Parsing brainfuck, please wait...");
        event.getChannel().sendTyping().queue();
        event.reply(BrainFuck.ParseBrainFuck(argsplit[0]));
        return;
    }
}
