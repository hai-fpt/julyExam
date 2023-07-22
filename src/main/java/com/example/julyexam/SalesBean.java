package com.example.julyexam;

import com.example.julyexam.models.Sales;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

@Stateless
public class SalesBean {
    @PersistenceContext(name = "default")
    private EntityManager entityManager;

    public List<Sales> getAllSales() {
        TypedQuery<Sales> query = entityManager.createQuery("select s from Sales s", Sales.class);
        return query.getResultList();
    }

    public Sales getSalesById(Long id) {
        return entityManager.find(Sales.class, id);
    }

    public void createSales(Sales sales) {
        entityManager.persist(sales);
    }

    public void updateSales(Sales sales) {
        entityManager.merge(sales);
    }

    public void deleteSales(Long id) {
        Sales sales = entityManager.find(Sales.class, id);
        if (sales != null) {
            entityManager.remove(sales);
        }
    }
}
