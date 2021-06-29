package me.reb4ck.hyperreforge.listeners;

import me.reb4ck.hyperreforge.HyperReforge;
import me.reb4ck.hyperreforge.User;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinLeaveListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        try {
            final Player player = event.getPlayer();
            final User user = User.getUser(player);
            user.name = player.getName();
        } catch (Exception e) {
            HyperReforge.getInstance().sendErrorMessage(e);
        }
    }
}
