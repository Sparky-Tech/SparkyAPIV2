package ac.sparky.api;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;

public class SparkyAPI {

    public static boolean isAnticheatEnabled() {
        return false;
    }

    public static void setAnticheatEnabled(boolean enabled) {
    }

    public static int getTransactionPing(Player player) {
        return -1;
    }

    public static int getKeepAlivePing(Player player) {
        return -1;
    }

    public static boolean isLagging(Player player) {
        return false;
    }

    public static void setCheckState(String checkName, boolean enabled) {
    }

    public static void setCheckState(String checkName, String type, boolean enabled) {
    }

    public static void reloadConfig() {
    }

    public static String getVersion() {
        return null;
    }

    public static String getServerVersion() {
        return null;
    }

    public static void exemptPlayer(Player player, int ticks) {
    }

    public static void resetExempt(Player player) {
    }

    public static List<String> getBanwaveFromCloud() {
        return null;
    }

    public static Map<String, Integer> getLogsFromCloud(String playerUUID) {
        return null;
    }

    public static String getBanInformation(String banID) {
        return null;
    }
}
