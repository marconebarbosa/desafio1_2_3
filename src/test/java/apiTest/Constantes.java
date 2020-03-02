package apiTest;

import io.restassured.http.ContentType;

public interface Constantes {

    String APP_URL_BASE = "http://www.omdbapi.com/";
    Integer APP_PORTA = 80;
    String APP_BASE_PATH = "";

    ContentType APP_CONTENT_TYPE = ContentType.JSON;

    Long MAX_TIMEOUT = 5000L;
}
