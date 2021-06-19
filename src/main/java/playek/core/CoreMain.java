package playek.core;

import cn.nukkit.plugin.PluginBase;

class CoreMain extends PluginBase
{

    public static CoreMain instance;

    @Override
    public void onLoad() {
        getLogger().info("Loading CoreMain...!");
        instance = this;
    }

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new CoreListener(this), this);
    }

    @Override
    public void onDisable() {

    }

    public static CoreMain getInstance() {
        return instance;
    }
}