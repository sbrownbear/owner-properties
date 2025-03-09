package owner.config;

import org.aeonbits.owner.Config;
//@Config.LoadPolicy(Config.LoadType.FIRST) // зачитает первый файл
//@Config.LoadPolicy(Config.LoadType.MERGE) // зачитает последний файл
@Config.Sources({
        "classpath:${device}.properties",
        "classpath:mobile.properties"
})

public interface MobileConfig extends Config {

    @Key("device.name")
    String getDeviceName();

    @Key("platform.name")
    String getPlatformName();

    @Key("platform.version")
    String getPlatformVersion();

}
