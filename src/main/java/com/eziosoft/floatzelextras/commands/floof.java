package com.eziosoft.floatzelextras.commands;

import com.eziosoft.floatzel.Commands.FCommand;
import com.eziosoft.floatzelextras.Utils;
import com.jagrosh.jdautilities.command.CommandEvent;

public class floof extends FCommand {
    public floof(){
        name = "floof";
        help = "Floof up your day!";
        category =  other;
        aliases = new String[]{"ralsei"};
    }

    @Override
    protected void cmdrun(CommandEvent event){
        event.getChannel().sendTyping().queue();
        // generate a number
        int card = random.nextInt(floof.length);
        // get dat floofy boi
        String filename = floof[card];
        event.getChannel().sendFile(Utils.getResourse("/floof/", filename), "floofyboi." + Utils.getFileType(filename)).queue();
    }

    public static String[] floof = {"1.png", "2.png", "3.png", "4.png", "5.jpg", "6.png", "7.png", "8.png", "9.png", "10.png", "11.jpg", "13.jpg", "14.png", "15.png", "12.png",
            "16.png", "17.jpg", "18.jpg", "19.jpg", "20.png", "21.jpg", "22.jpg", "23.jpg", "24.jpg", "25.jpg", "26.gif", "27.png", "28.png", "29.jpg", "30.png", "31.jpg", "32.jpg",
            "33.png", "34.jpg", "35.mp4", "36.jpg", "37.png", "38.gif", "39.png", "40.png", "41.png", "42.jpg", "43.png", "44.jpg", "45.jpg", "46.png", "47.png", "48.jpg",
            "49.jpg", "50.jpg", "51.jpg", "52.png", "53.jpg", "54.jpg", "55.png", "56.png", "57.png", "58.png", "59.png", "60.gif", "61.jpg", "62.png"};

}
