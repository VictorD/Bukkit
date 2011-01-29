package org.bukkit.command;

import java.util.List;

public interface Command {

    public abstract boolean execute(CommandRequest request);

    public abstract String getName();
    public abstract List<String> getAliases();
    public abstract String getDescription();
    public abstract String getHelpText();
    public abstract void setAliases(List<String> aliases);
    public abstract void setDescription(String description);
    public abstract void setHelpText(String helpText);
}