package dev.esoteric_development.example_paper_plugin.custom_item;

public enum CustomItem {
  ;

  public static boolean isEnabled() {
    return values().length != 0;
  }
}
