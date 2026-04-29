package com.xpdustry.claj_plugin_template;

import arc.util.CommandHandler;

import com.xpdustry.claj.server.plugin.Plugin;
import com.xpdustry.claj.server.plugin.PluginLogger;
import com.xpdustry.claj.server.util.JsonSettings;


public class Main implements Plugin {
  private final PluginLogger logger;

  public Main() {
    //Loggers are automatic. The plugin 'displayName' property will be used as the main topic
    logger = getLogger();

    logger.info("Template plugin created.");
  }

  @Override
  public void init() {
    //Settings are auto saved every seconds and at CLaJ server exit
    JsonSettings settings = getConfig();
    settings.load();
    settings.put("_comment", "Template settings.");

    new Greet().hello();
  }

  @Override
  public void registerCommands(CommandHandler handler) {
    handler.register("template", "A template command.", args -> {
      logger.info("Hello World!");
    });
  }

  @Override
  public void dispose() {
    //Dispose properly any resources you created. This is called before disposing the CLaJ server.
    logger.info("Goodbye!");
  }
}
