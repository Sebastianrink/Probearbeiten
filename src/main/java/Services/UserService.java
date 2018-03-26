package Services;

import Model.ApiUser;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class UserService {

    @PersistenceContext
    EntityManager em;

    public List<ApiUser> getAllUsers()
    {
        TypedQuery<ApiUser> query = em.createQuery("select u from ApiUser u",ApiUser.class);
        return query.getResultList();
    }
}
