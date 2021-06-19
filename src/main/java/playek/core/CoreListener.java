package playek.core;

import cn.nukkit.Player;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerChatEvent;
import cn.nukkit.event.player.PlayerJoinEvent;

public class CoreListener implements Listener
{

    private CoreMain main;

    public CoreListener(CoreMain main){
        this.main = main;
    }

    public void onJoin(PlayerJoinEvent event){
        Player player;

        player = event.getPlayer();

        if(player.isOnline()){
            player.setNameTag("§7" + player.getName());
        }
    }

    public void onChat(PlayerChatEvent event){
        Player player;
        String message;

        player = event.getPlayer();
        message = event.getMessage();

        if(player.isOnline()){
            event.setFormat("§8" + player.getName() + ": §7" + message);
        }
    }
}
