package Controllers;

import Model.Team;
import Services.TeamService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/tabelle")
public class TabelleController {

    @Inject
    TeamService teamService;

    @GET
    @Produces("application/json")
    public Response getTabelle()
    {
        List<Team> myUserList = teamService.getAllTeamsSortedbyPoints();

        return Response.ok(myUserList).build();
    }
}