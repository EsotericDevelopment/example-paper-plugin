package org.esoteric_organisation.example_paper_plugin.custom_item;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;

import org.esoteric_organisation.example_paper_plugin.ExamplePaperPlugin;
import org.esoteric_organisation.example_paper_plugin.custom_item.AbstractCustomItem;
import org.esoteric_organisation.example_paper_plugin.custom_item.CustomItem;
import org.esoteric_organisation.example_paper_plugin.custom_item.items.SCP018CustomItem;

public class CustomItemManager {

  private final Map<CustomItem, AbstractCustomItem> customItemMap = new HashMap<>();

  public CustomItemManager(ExamplePaperPlugin plugin) {
    new SCP018CustomItem(plugin, this);
  }

  public void addCustomItem(CustomItem itemId, AbstractCustomItem customItem) {
    customItemMap.put(itemId, customItem);
  }

  public AbstractCustomItem getAbstractCustomItem(CustomItem itemId) {
    return customItemMap.get(itemId);
  }

  public void giveCustomItem(CustomItem itemId, Player player) {
    customItemMap.get(itemId).give(player);
  }
}
