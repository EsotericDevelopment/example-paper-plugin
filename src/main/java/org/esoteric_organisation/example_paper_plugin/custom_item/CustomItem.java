package org.esoteric_organisation.example_paper_plugin.custom_item;

public enum CustomItem {
  SCP018;

  public static boolean isEnabled() {
    return values().length != 0;
  }
}
