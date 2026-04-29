package example;

import com.xpdustry.claj.server.plugin.Plugin;
import com.xpdustry.claj.server.plugin.PluginLogger;


public class Greet {
  public final PluginLogger logger;

  public Greet() {
    //This method can be called anywhere in the plugin classes and it will found the plugin info.
    //(as long it's the same class loader)
    //But as this method is very long and costly, please only create loggers once, and store it in a constant.
    logger = Plugin.getPluginLogger("Hello");
  }

  public void hello() {
    logger.info("Template plugin initialized.");
  }
}
