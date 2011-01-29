package org.bukkit.command;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseCommandMap<T extends Command> implements CommandMap<T> {
    protected final Map<String, T> knownCommands = new HashMap<String, T>();
    
    /**
     * Registers multiple commands. Returns name of first command for which fallback had to be used if any.
     * @param plugin
     * @return
     */
    public void registerAll(String fallbackPrefix, List<T> commands) {
        if (commands != null) {
            for(T c : commands) {
                register(fallbackPrefix, c);
            }
        }
    }

    protected void register(String fallbackPrefix, T command) {
        register(command.getName(), fallbackPrefix, command);
    }
    
    /** 
     * {@inheritDoc}
     */
    public boolean register(String name, String fallbackPrefix, T command) {
        boolean nameInUse = (knownCommands.get(name) != null);
        if (nameInUse)
            name = fallbackPrefix + ":" + name;
        
        knownCommands.put(name, command);
        return !nameInUse;
    }

    public void clearCommands() {
        synchronized (this) {
            knownCommands.clear();
        }
    }

    public T get(String name) {
        return knownCommands.get(name);
    }
}
