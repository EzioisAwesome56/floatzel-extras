package com.eziosoft.floatzelextras.commands;

import com.eziosoft.floatzel.SlashCommands.FSlashableCommand;
import com.eziosoft.floatzel.SlashCommands.Objects.SlashActionGroup;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;

import java.util.Random;

public class swearcombine extends FSlashableCommand {

    public swearcombine(){
        name = "gensent";
        description = "Generates a sentance";
        category = asshole;
        sag = SlashActionGroup.FUN;
    }

    @Override
    public void SlashCmdRun(SlashCommandEvent slashCommandEvent) {
        slashCommandEvent.getHook().editOriginal(genSent()).queue();
    }

    private String genSent(){
        // why did i think the slack support was a good idea? it wasnt.
        Random random = new Random();;
        String[] words = {"gaming", "dank", "hfjskdlfhaskljdsa", "hhhhhhhh", "what the heck", "mmmmmmmm", "time out", "boring", "the letter h", "dink"};
        int maxnumb = words.length;
        int sentlong = random.nextInt(10) + 1;
        int count = 0;
        StringBuilder msg = new StringBuilder();
        // form the sentance
        while (count != sentlong){
            msg.append(words[random.nextInt(maxnumb)]).append(" ");
            count = count + 1;
        }
        // return it
        return msg.toString();
    }

    @Override
    protected void cmdrun(CommandEvent event){
        event.getChannel().sendMessage(genSent()).queue();
    }
}
