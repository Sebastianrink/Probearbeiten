package Services;

import Model.ApiUser;
import Model.Team;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class TeamService {
    @PersistenceContext
    EntityManager em;

    public List<Team> getAllTeams()
    {
        TypedQuery<Team> query = em.createQuery("select u from Team u",Team.class);
        return query.getResultList();
    }

    public List<Team> getAllTeamsSortedbyPoints()
    {
        TypedQuery<Team> query = em.createQuery("select u from Team u order by u.Punkte",Team.class);
        return query.getResultList();
    }
}
