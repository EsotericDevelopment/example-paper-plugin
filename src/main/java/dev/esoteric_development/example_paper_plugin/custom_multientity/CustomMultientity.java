package dev.esoteric_development.example_paper_plugin.custom_multientity;

public enum CustomMultientity {
  ;

  public static boolean isEnabled() {
    return values().length != 0;
  }
}
