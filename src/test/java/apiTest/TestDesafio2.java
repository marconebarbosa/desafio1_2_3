package testApi;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

public class TestDesafio2 extends BaseTest {

    public String ID_DO_FILME = "tt1285016";
    public String API_KEY = "52ec71bf";

    @Test
    public void validaTituloAnoIdiomaDoFilme(){
        given()
        .when()
            .get("/?i=" + ID_DO_FILME + "&apikey=" + API_KEY)
        .then()
            .statusCode(200)
            .body("Title", is("The Social Network"))
            .body("Year", is("2010"))
            .body("Language", is("English, French"))
        ;
    }

    @Test
    public void validaBuscaDeFilmeInexistente(){
        given()
        .when()
            .get("/?i=tt9995016&apikey=52ec71bf")
        .then()
            .statusCode(200)
            .body("Response", is("False"))
            .body("Error", is("Error getting data."))
        ;
    }

    @Test
    public void validaBuscaDeFilmeSemInformarApiKey(){
        given()
        .when()
            .get("/?i="+ ID_DO_FILME)
        .then()
            .statusCode(401)
            .body("Response", is("False"))
            .body("Error", is("No API key provided."))
        ;
    }

    @Test
    public void validaBuscaDeFilmeSemInformarIdDoFilme(){
        given()
        .when()
            .get("/?apikey="+ API_KEY)
        .then()
            .statusCode(200)
            .body("Response", is("False"))
            .body("Error", is("Something went wrong."))
        ;
    }

    @Test
    public void validaSchemaJson(){
        given()
            .log().all()
        .when()
            .get("/?i=" + ID_DO_FILME + "&apikey=" + API_KEY)
        .then()
            .log().all()
            .statusCode(200)
            .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("ValidaSchema.json"))
        ;
    }
}
