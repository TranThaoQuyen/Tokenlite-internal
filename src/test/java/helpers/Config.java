package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties config;

    public static Properties getConfig() {
        if(config == null) {
            String env = System.getProperty("env", null);
            String configFilePath = env == null ? "config.properties" : "config-" + env + ".properties";

            try {
                FileInputStream configFile = new FileInputStream(System.getProperty("user.dir") + "//src//test///resources//" + configFilePath);
                config = new Properties();
                config.load(configFile);
            } catch (IOException e) {
                return null;
            }
        }

        return config;
    }
}
