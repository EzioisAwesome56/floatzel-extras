package com.eziosoft.floatzelextras.commands;

import com.eziosoft.floatzel.SlashCommands.FSlashableCommand;
import com.eziosoft.floatzel.SlashCommands.Objects.SlashActionGroup;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;

public class testcommand extends FSlashableCommand {

    public testcommand() {
        name = "test";
        category = test;
        help = "tests to see if the bot is alive";
        sag = SlashActionGroup.OTHER;
    }

    public void SlashCmdRun(SlashCommandEvent slashCommandEvent) {
        slashCommandEvent.getHook().editOriginal("yo whats up this is a slashable action!").queue();
    }

    @Override
    protected void cmdrun(CommandEvent commandEvent) {
        commandEvent.getChannel().sendMessage("test test 1-2-3 can you read this?").queue();
    }
}
