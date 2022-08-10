# SparkyAPIV2
V2 of the Sparky API.

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

SparkyAPI.getBanwaveFromCloud() - Returns the list of player's on the ban-wave

SparkyAPI.getLogsFromCloud(String playerUUID) - Returns the player's logs from the cloud

SparkyAPI.getBanInformation(String banID) - Returns the information from a Ban ID

SparkyAPI.callSpecificTrigger(long ID, Player player) - call a specific hard-coded event inside Sparky, could be used for debugging or fixing issues that cannot be fixed without hooking into the target plugin

SparkyAPI.setNotificationState(Player player, boolean notifications) - Enables / disable notifications for a specific player

SparkyAPI.setAlertState(Player player, boolean alerts) - Enables / disable alerts for a specific player
```

Maven:
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

	<dependency>
	    <groupId>com.github.Sparky-Tech</groupId>
	    <artifactId>SparkyAPIV2</artifactId>
	    <version>2.8</version>
	</dependency>
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
        String description = event.getDescription();
        String debug = event.getDebug();
        int violations = event.getViolation();
        boolean experimental = event.isExperimental();
        
        // some code here
    }

    @EventHandler
    public void onSparkyPunish(SparkyPunishEvent event) {
        String banID = event.getBanID();
        String checkName = event.getCheckName();
        String checkType = event.getCheckType();
        
        // some code here
    }
 ```
