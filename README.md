# SparkyAPIV2
V2 of the Sparky API.

For developers:
This API uses reflection because of the way Sparky is setup, don't abuse call theses methods or it may cause lag
#
Documentation:
```
SparkyAPI.isAnticheatEnabled() - Returns a boolean if the anticheat is enabled or not

SparkyAPI.setAnticheatEnabled(boolean enabled) - Sets the state for the anticheat being enabled or not

SparkyAPI.getKeepAlivePing(Player player) - Returns the player's KeepAlive ping from the anticheat

SparkyAPI.getTransactionPing(Player player) - Returns the player's Transaction ping from the anticheat

SparkyAPI.isLagging(Player player) - Returns if the player is lagging

SparkyAPI.setCheckState(String checkName, boolean enabled) - Enables / disables a check (this defaults the check type A)

SparkyAPI.setCheckState(String checkName, String type, boolean enabled) - Enables / disables a check

SparkyAPI.reloadConfig() - Reload's the anticheats config

SparkyAPI.getVersion() - Returns the current version of the anticheat

SparkyAPI.getServerVersion() - Returns the server's version

SparkyAPI.exemptPlayer(Player player, int ticks) - Returns the anticheats checks for a specific player
and for a specific amount of ticks (NOTE: 20 ticks = 1 second)

SparkyAPI.resetExempt(Player player) - Resets the players exempt ticks
```

Maven:
```xml
    <repositories>
        <repository>
            <id>Sparky</id>
            <url>https://nexus.sparky.ac/repository/Sparky/</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>ac.sparky</groupId>
            <artifactId>SparkyAPI</artifactId>
            <version>2.1</version>
        </dependency>
    </dependencies>
```

API Example:
```
 @EventHandler
    public void onMove(PlayerMoveEvent event) {
        if (event.getPlayer().isSneaking()) {
            int ping = SparkyAPI.getKeepAlivePing(event.getPlayer());
            event.getPlayer().sendMessage(String.format("Ping: %s", ping));
        }
    }

    @EventHandler
    public void onSparkyFlag(SparkyViolationEvent event) {
        String checkName = event.getCheckName();
        String checkType = event.getCheckType();
        int violation = event.getViolation();
        event.getPlayer().sendMessage(String.format("You failed: %s %s %s", checkName, checkType, violation));
    }

    @EventHandler
    public void onSparkyPunish(SparkyPunishEvent event) {
        String banID = event.getBanID();
        event.getPlayer().sendMessage(String.format("You would of been banned for: %s", checkName, banID));
    }
 ```
