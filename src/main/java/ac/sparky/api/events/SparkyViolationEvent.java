package ac.sparky.api.events;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
public class SparkyViolationEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final String checkName;
    private final String checkType;
    private final String customCheckName;
    private final String customCheckType;
    private final String category;
    private final int violation;

    @Setter
    private boolean cancelled;

    public SparkyViolationEvent(
            Player player,
            String checkName,
            String checkType,
            String customCheckName,
            String customCheckType,
            String category,
            int violation,
            boolean cancelled) {
        this.player = player;
        this.checkName = checkName;
        this.checkType = checkType;
        this.customCheckName = customCheckName;
        this.customCheckType = customCheckType;
        this.category = category;
        this.violation = violation;
        this.cancelled = cancelled;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}