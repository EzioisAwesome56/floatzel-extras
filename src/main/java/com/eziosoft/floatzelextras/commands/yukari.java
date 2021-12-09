package com.eziosoft.floatzelextras.commands;
;
import com.eziosoft.floatzel.SlashCommands.FSlashableCommand;
import com.eziosoft.floatzel.SlashCommands.Objects.SlashActionGroup;
import com.eziosoft.floatzelextras.Utils;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;

public class yukari extends FSlashableCommand {

    public yukari(){
        name = "yukari";
        description = "sends a picture of the best waif-i mean girl";
        category = waifu;
        sag = SlashActionGroup.OTHER;
    }

    @Override
    public void SlashCmdRun(SlashCommandEvent slashCommandEvent) {
        int card = random.nextInt(yukaris.length);
        String filename = yukaris[card];
        slashCommandEvent.getHook().editOriginal(Utils.getResourse("/yuk/", filename), "yukari." + Utils.getFileType(filename)).queue();
    }

    @Override
    protected void cmdrun(CommandEvent event){
        event.getChannel().sendTyping().queue();
        // generate a number
        int card = random.nextInt(yukaris.length);
        // get file
        String filename = yukaris[card];
        event.getChannel().sendFile(Utils.getResourse("/yuk/", filename), "yukari." + Utils.getFileType(filename)).queue();
    }

    public static String[] yukaris = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg",
            "9.jpg", "10.jpg", "11.jpg", "12.jpg", "13.jpg", "14.png", "15.jpg", "16.jpg", "17.jpg", "18.jpg", "19.jpg",
            "20.jpg", "21.jpg", "22.jpg", "23.jpg", "24.png", "25.jpg", "26.jpg", "27.png", "28.jpg", "29.jpeg", "30.jpg",
            "31.jpg", "32.jpg", "33.png", "34.png", "35.png", "36.jpg", "37.jpg", "38.png", "39.png", "40.png", "41.jpeg",
            "42.jpg", "43.png", "44.png", "45.png", "46.png"};
}
