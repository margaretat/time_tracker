package com.cuponation.timetracker.dao;

import com.cuponation.timetracker.entities.Event;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Stateless
public class EventDAO {

    @PersistenceContext(unitName = "TimeTrackerPU")
    private EntityManager entityManager;

    public List<Event> findAll(){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Event> query = cb.createQuery(Event.class);
        query.from(Event.class);
        return entityManager.createQuery(query).getResultList();
    }

    public Event update(Event event) {
        return entityManager.merge(event);
    }
}
