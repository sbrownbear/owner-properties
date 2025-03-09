package owner.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class WebDriverConfigOld {

    public String getBaseUrl() {
        // Зачитываем значение из настроек
        String baseUrl = System.getProperty("baseUrl");
        // Проверяем дефолтое значение
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://google.com";
        }
        // Возвращаем результат
        return baseUrl;
    }

    public Browser getBrowser() {
        // Зачитываем значение из настроек
        String browser = System.getProperty("browser");
        // Проверяем дефолтое значение
        if (Objects.isNull(browser)) {
            browser = "CHROME";
        }
        // Возвращаем результат с приведением типов
        return Browser.valueOf(browser);
    }

    public URL getRemoteURL() {
        String remoteURL = System.getProperty("remoteURL");
        if (Objects.isNull(remoteURL)) {
            remoteURL = "http://localhost:4444";
        }
        try {
            return new URL(remoteURL);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}
