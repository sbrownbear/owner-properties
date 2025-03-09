package owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://google.com")
    String getBaseUrl();

    @DefaultValue("CHROME")
    @Key("browser")
    Browser getBrowser();

    @DefaultValue("http://localhost:4444")
    @Key("remoteUrl")
    URL getRemoteUrl();

}
