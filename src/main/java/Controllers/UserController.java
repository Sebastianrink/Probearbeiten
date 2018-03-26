package Controllers;

import Model.ApiUser;
import Services.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/users")
public class UserController {
    @Inject
    private UserService userService;


    @GET
    @Produces("application/json")
    public Response getAllUsers()
    {
        List<ApiUser> myUserList = userService.getAllUsers();
        return Response.ok(myUserList).build();
    }
}
