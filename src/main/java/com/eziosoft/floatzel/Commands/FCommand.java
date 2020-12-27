package com.eziosoft.floatzel.Commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

import java.util.Random;

public abstract class FCommand extends Command {
    protected String description = "no description";

    public static Random random = new Random();

    // basic categories
    public static Category money = new Category("Currency");
    public static Category test = new Category("Test");
    public static Category spam = new Category("Spam");
    public static Category fun = new Category("Entertainment");
    public static Category owner = new Category("Owner Commands");
    public static Category asshole = new Category("Stupid Stuff");
    public static Category sound = new Category("Audio");
    public static Category other = new Category("Other");
    public static Category waifu = new Category("Waifu");
    public static Category buyshit = new Category("Purchasable Commands");
    public static Category stocks =  new Category("Stock Market");
    public static Category admin = new Category("Admin Commands");
    public static Category smm = new Category("Super Mario Maker");
    public static Category image = new Category("Image");
    // new! plugin group
    public static Category plugin = new Category("Loaded Plugins");

    // for holding the split args
    public static String[] argsplit = null;

    // bot admin shitto
    public boolean adminCommand = false;

    // string to store the money emote
    public static String moneyicon = "\uD83E\uDD56";

    // check to see if the user who ran the command is an admin
    private boolean isAdmin(String uid){
        return false;
    }




    @Override
    protected void execute(CommandEvent event) {
        try {
            cmdrun(event);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    protected abstract void cmdrun(CommandEvent event) throws Exception;
}
