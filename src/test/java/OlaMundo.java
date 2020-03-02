import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class OlaMundo {

    public static void main(String[] args){
       // http://restapi.wcaquino.me/ola
        Response response = RestAssured.request(Method.GET,"http://restapi.wcaquino.me/ola");
        System.out.println(response.getBody().asString().equals("Ola Mundo!"));
        System.out.println(response.statusCode() == 200);

    }
}
/*
    FEITO - Criar um projeto de automação para API utilizando framework de sua preferência
    os cenários para as duas funcionalidades abaixo:

        EndPoint http://www.omdbapi.com/?i=[ID_DO_FILME]&apikey=[API_KEY]
        Parametros ID_DO_FILME: tt1285016 API_KEY= 52ec71bf
        ID_DO_FILME e API_KEY deverão ser passados por variaveis GLOBAIS


        1- No endpoint validar o response para:
        • Título do Filme • Ano do Filme • Idioma do filme
         --Nenhum dos itens pode ser nulll
         --

         2 - No endpoint validar o response para:
        • Busca filme inexistente

*/