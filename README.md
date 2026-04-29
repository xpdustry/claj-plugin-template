# CLaJ Plugin Template
### Setup
Clone this repository first.
To edit the plugin display name and other data, take a look at [`plugin.hjson`](https://github.com/xpdustry/claj-plugin-template/blob/master/plugin.hjson).
Edit the name of the project itself by going into [`settings.gradle`](https://github.com/xpdustry/claj-plugin-template/blob/master/settings.gradle).


### Basic Usage
See [`src/example/Main.java`](https://github.com/xpdustry/claj-plugin-template/blob/master/src/example/Main.java) for some basic stuff and commands. <br>
Every main plugin class must implements [`Plugin`](https://github.com/xpdustry/claj/blob/main/server/src/com/xpdustry/claj/server/plugin/Plugin.java). Make sure that `plugin.hjson` points to the correct main plugin class.

Please note that the plugin system is in beta, and as such is subject to changes.


### Building a Jar
`./gradlew build`. Output jar should be in `build/libs`.


### Installing
Simply place the output jar from the step above in your server's `plugins/` directory and restart the server. <br>
List your currently installed plugins by running the `plugins` command.
