/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topjavatutorials.models;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author anq
 */
public class ProductPriceDAO {

    public ProductPriceDAO() {
        Session s = SessionUtil.getSession();
    }

    public List<ProductPrice> getPrice(long barcode) {
        Session session = SessionUtil.getSession();

        // Begin the transaction.
        session.beginTransaction();

        // Retrieve the prices.
        List<ProductPrice> prices = session
                .createQuery("from ProductPrice p where p.barcode=" + barcode)
                .getResultList();

        session.getTransaction().commit();

        session.close();

        return prices;
    }
}
