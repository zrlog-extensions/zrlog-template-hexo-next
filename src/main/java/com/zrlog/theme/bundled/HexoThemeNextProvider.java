package com.zrlog.theme.bundled;
import com.zrlog.theme.spi.BundledThemeProvider;
/** Registers the hexo-theme-next resources bundled in this JAR. */
public final class HexoThemeNextProvider implements BundledThemeProvider {
 public String id() { return "hexo-theme-next"; }
 public String engine() { return "hexo"; }
 public String adapter() { return "next"; }
 public boolean isDefault() { return false; }
}
