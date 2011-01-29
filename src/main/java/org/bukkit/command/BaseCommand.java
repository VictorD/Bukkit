package org.bukkit.command;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseCommand implements Command {
    private final String name;
    private List<String> aliases = new ArrayList<String>();
    private String description = "";
    private String helpText = "";
    
    public BaseCommand(String name) {
        this.name = name;
    }

    public boolean execute(CommandRequest request) {
        return false;
    }
    
    public String getName() {
        return name;
    }
    
    public List<String> getAliases() {
        return aliases;
    }

    public String getDescription() {
        return description;
    }

    public String getHelpText() {
        return helpText;
    }
    
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }
    
    public void setDescription(String tooltip) {
        this.description = tooltip;
    }
    
    public void setHelpText(String usage) {
        this.helpText = usage;
    }
}