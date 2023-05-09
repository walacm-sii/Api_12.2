package providers;

public class UrlProvider {

    public static String getBaseUrl() {
        return System.getProperty("web url");
    }

    public static String getWeatherPartUrl() {
        return System.getProperty("weather part");
    }

    public static String getForecastPartUrl() {
        return System.getProperty("forecast part");
    }
}
