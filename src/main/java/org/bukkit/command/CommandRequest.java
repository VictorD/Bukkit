package org.bukkit.command;

import java.util.List;

public interface CommandRequest {
    
    public boolean sendToCommand(Command command);
    
    public String getErrorMessage();
    
    public String getCommandLine();
    
    public String getCommand();
    
    public List<String> getArguments();
}
