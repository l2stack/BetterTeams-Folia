package vn.onemc.l2stack;

import org.bukkit.plugin.Plugin;

import com.tcoded.folialib.FoliaLib;

public class FoliaLibGetter {
    
    private static FoliaLib foliaLib;

    public static void initFoliaLib(Plugin plugin) {
        foliaLib = new FoliaLib(plugin);
    }

    public static FoliaLib getFoliaLib() {
        return foliaLib;
    }

}
