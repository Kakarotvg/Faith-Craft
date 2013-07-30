package common.items;

import common.FaithCraft;
import common.IDHandler;
import common.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHandler {

    // Items
    public static Item Cross;
    public static Item Torah;
    public static Item Bible;
    public static Item Quran;
    
    public static void configureItems(Configuration config) {
       
        Cross = new Cross(IDHandler.CrossID, "Cross").setCreativeTab(FaithCraft.modTab);
        Torah = new Torah(IDHandler.TorahID, "Torah").setCreativeTab(FaithCraft.modTab);
        Bible = new Torah(IDHandler.BibleID, "Bible").setCreativeTab(FaithCraft.modTab);
        Quran = new Torah(IDHandler.QuranID, "Quran").setCreativeTab(FaithCraft.modTab);
        
    }

    public static void registerItems(GameRegistry registry) {
        
        GameRegistry.registerItem(Cross, "Cross", Reference.modid);
        GameRegistry.registerItem(Torah, "Torah", Reference.modid);
        GameRegistry.registerItem(Bible, "Bible", Reference.modid);
        GameRegistry.registerItem(Quran, "Quran", Reference.modid);
        
    }
    
    // how the next 2 methods work are temporary
    public static void addToObjectsList(){
        FaithCraft.addToObjectList(Cross);
        FaithCraft.addToObjectList(Torah);
        FaithCraft.addToObjectList(Bible);
        FaithCraft.addToObjectList(Quran);
    }
    
    public static void addNames(){
        //en_US
        FaithCraft.addToNameList("Cross");
        FaithCraft.addToNameList("Torah");
        FaithCraft.addToNameList("Bible");
        FaithCraft.addToNameList("Quran");
        
        //en_PI
        FaithCraft.addToNameList("Stick Thingy");
        FaithCraft.addToNameList("10 Comandments");
        FaithCraft.addToNameList("Holy Book");
        FaithCraft.addToNameList("Crap");
    }
}
