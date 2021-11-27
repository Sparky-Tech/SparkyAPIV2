package ac.sparky.api.events;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
public class SparkyPunishEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final String banID;
    private final boolean cancelled;

    public SparkyPunishEvent(Player player, String banID, boolean cancelled) {
        this.player = player;
        this.banID = banID;
        this.cancelled = cancelled;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}