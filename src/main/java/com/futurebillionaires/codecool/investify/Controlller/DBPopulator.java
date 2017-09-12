package com.futurebillionaires.codecool.investify.Controlller;

import com.futurebillionaires.codecool.investify.Database.*;
import com.futurebillionaires.codecool.investify.Model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by matyi on 2017.06.22..
 */
@Component
public class DBPopulator {

    @Autowired
    private DBHandler dbHandler;

    private static final Logger logger = LoggerFactory.getLogger(DBPopulator.class);

    @PostConstruct
    public void populate() {

        logger.info("Creating example data");

        MoneyPool exampleMoneyPool = new MoneyPool(3500000, 10000000, 100000, 20);
        User exampleUser = new User("admin", "admin", "admin", "admin", "example@example.com");
        House exampleHouse = new House(1000, 0000, "City city", "Address address", 1000000);
        HousePicture exampleHousePicture = new HousePicture(exampleHouse, "URL", "Description");
        Sharehold exampleSharehold = new Sharehold(exampleHouse, exampleUser, 10000, 10000, 40);
        ShareholdForSale exampleShareholdForSale = new ShareholdForSale(exampleSharehold, 1, 1, null, null);
        Investment exampleInvestment = new Investment(exampleUser, exampleMoneyPool, 5, 1000, null, null);

        dbHandler.save(exampleMoneyPool);
        dbHandler.save(exampleUser);
        dbHandler.save(exampleHouse);
        dbHandler.save(exampleHousePicture);
        dbHandler.save(exampleSharehold);
        dbHandler.save(exampleShareholdForSale);
        dbHandler.save(exampleInvestment);

        logger.info("Saving example data.");

        logger.info("Save complete");
    }

}
