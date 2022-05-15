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
    private final String checkName;
    private final String checkType;
    private final int ping;
    private final boolean cancelled;

    public SparkyPunishEvent(Player player, String banID, String checkName, String checkType, int ping,
                             boolean cancelled) {
        this.player = player;
        this.banID = banID;
        this.checkName = checkName;
        this.checkType = checkType;
        this.ping = ping;
        this.cancelled = cancelled;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}