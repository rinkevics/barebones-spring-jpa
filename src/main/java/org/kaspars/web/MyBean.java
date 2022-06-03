package org.kaspars.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
@Transactional
@Scope("prototype")
public class MyBean {

    @PersistenceContext
    private EntityManager entityManager;

    public String method() {
        var query = entityManager.createQuery("SELECT e FROM MyEntity e");

        var list = query.getResultList();
        if (list.isEmpty()) {
            var entity = new MyEntity("jpa entity 2");
            entityManager.persist(entity);
            list = query.getResultList();
        }
        return "bean/" + ((MyEntity) list.get(0)).name;
    }
}
