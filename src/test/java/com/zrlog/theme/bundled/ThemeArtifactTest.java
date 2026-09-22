package com.zrlog.theme.bundled;
import com.zrlog.theme.spi.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
public class ThemeArtifactTest {
 @Test public void providerAndResourcesAreDiscoverable() throws Exception {
  BundledThemes registry = BundledThemes.load(getClass().getClassLoader());
  assertTrue(registry.contains("/include/templates/hexo-theme-next"));
  assertFalse(registry.resources().isEmpty());
  for (String resource : registry.resources()) assertNotNull(resource, getClass().getClassLoader().getResource(resource));
  String json = new String(getClass().getResourceAsStream("/include/templates/hexo-theme-next/package.json").readAllBytes(), StandardCharsets.UTF_8);
  java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\"version\"\\s*:\\s*\"([^\"]+)\"").matcher(json);
  assertTrue(matcher.find());
  assertEquals(System.getProperty("artifact.version"), matcher.group(1));
 }
}
