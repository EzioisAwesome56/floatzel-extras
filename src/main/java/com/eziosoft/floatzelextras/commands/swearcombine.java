package com.eziosoft.floatzelextras.commands;

import com.eziosoft.floatzel.Commands.FCommand;
import com.jagrosh.jdautilities.command.CommandEvent;

import java.util.Random;

public class swearcombine extends FCommand {

    public swearcombine(){
        name = "gensent";
        description = "Generates a sentance";
        category = asshole;
    }

    @Override
    protected void cmdrun(CommandEvent event){
        // why did i think the slack support was a good idea? it wasnt.
        Random random = new Random();;
        String[] words = {"gaming", "dank", "hfjskdlfhaskljdsa", "hhhhhhhh", "what the heck", "mmmmmmmm", "time out", "boring", "the letter h", "dink"};
        int maxnumb = words.length;
        int sentlong = random.nextInt(10) + 1;
        int count = 0;
        String msg = "";
        // form the sentance
        while (count != sentlong){
            msg = msg + words[random.nextInt(maxnumb)] + " ";
            count = count + 1;
        }
        // return it
        event.getChannel().sendMessage(msg).queue();
    }
}
