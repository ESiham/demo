package Dao;

import com.example.demo.Light;
import com.example.demo.Room;
import com.example.demo.Status;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LightDao implements LightDaoCustom {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Light> findOnLights() {
        String jpql = "select lt from Light lt where lt.status = :value";
        return em.createQuery(jpql, Light.class)
                .setParameter("value", Status.ON)
                .getResultList();
    }
   /* public List<Light> findRoom(String ID) {
        String jpql = "select lt from Light lt where lt.status = :value";
        return em.createQuery(jpql,Room.class);
            //    .setParameter(Room.setName() )
          //      .getSingleResult();
    }*/
}

