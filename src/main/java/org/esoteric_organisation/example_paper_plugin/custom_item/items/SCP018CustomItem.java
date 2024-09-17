package org.esoteric_organisation.example_paper_plugin.custom_item.items;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.esoteric_organisation.example_paper_plugin.ExamplePaperPlugin;
import org.esoteric_organisation.example_paper_plugin.custom_item.AbstractCustomItem;
import org.esoteric_organisation.example_paper_plugin.custom_item.CustomItem;
import org.esoteric_organisation.example_paper_plugin.custom_item.CustomItemManager;
import org.esoteric_organisation.example_paper_plugin.language.Message;

public class SCP018CustomItem extends AbstractCustomItem {

  public SCP018CustomItem(ExamplePaperPlugin plugin, CustomItemManager customItemManager) {
    super(plugin, customItemManager, CustomItem.SCP018, Material.EGG);
  }

  @Override
  protected ItemStack generateCustomItem(@NonNull ItemStack baseCustomItem, Player player) {
    baseCustomItem.editMeta(meta -> {
      assert plugin.getLanguageManager() != null;
      meta.itemName(plugin.getLanguageManager().getMessage(Message.SCP_018, player));
    });

    return baseCustomItem;
  }
}
