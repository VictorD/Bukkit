package org.bukkit.command;

import java.util.List;

public interface CommandMap<T extends Command> {
    /**
     * Registers all the commands in a certain list.  
     * @param plugin
     * @return
     */
    public void registerAll(String namespace, List<T> commands);

    /**
     * Registers a command. Returns true on success; false if name is already taken and fallback had to be used.
     * 
     * @param a label for this command, without the '/'-prefix.
     * @return Returns true if command was registered; false if label was already in use.
     */
    public boolean register(String label, String namespace, T command);

    /**
     * Clears all registered commands.
     */
    public void clearCommands();
    
    public T get(String name);
}
