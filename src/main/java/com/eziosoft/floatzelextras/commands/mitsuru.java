package com.eziosoft.floatzelextras.commands;

import com.eziosoft.floatzel.Commands.FCommand;
import com.eziosoft.floatzelextras.Utils;
import com.jagrosh.jdautilities.command.CommandEvent;

public class mitsuru extends FCommand {

    public mitsuru(){
        name = "mitsuru";
        description = "sends a picture of mitsuru from persona 3";
        category = waifu;
    }

    @Override
    protected void cmdrun(CommandEvent event){
        event.getChannel().sendTyping().queue();
        // generate a number
        int card = random.nextInt(mitsurus.length);
        // get photo
        String filename = mitsurus[card];
        event.getChannel().sendFile(Utils.getResourse("/mit/", filename), "mitsuru."+ Utils.getFileType(filename)).queue();
    }

    public static String[] mitsurus = {"1.png", "2.jpg", "3.jpg", "4.jpg", "5.jpg"};
}
