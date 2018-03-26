import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.get;

public class TestTeamController {

    @Before
    public void init() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
    }
    @Test
    public void testGetAllTeams(){
        //init();

        get("SampleApp/v1/api/teams").then().statusCode(200);

    }

    @Test
    public void testGetTabelle(){
        //init();

        get("SampleApp/v1/api/tabelle").then().statusCode(200);

    }
}
