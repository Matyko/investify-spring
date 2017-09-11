package com.futurebillionaires.codecool.investify.Model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 * Created by matyi on 2017.06.22..
 */
@Entity
public class HousePicture {
    /**
     * @param id of the HousePicture.
     * @param house , id for the house.
     * @param url access to the picture.
     * @param description for the house.
     */

    private final static Logger logger = LoggerFactory.getLogger(HousePicture.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private House house;
    private String url;
    private String description;

    public HousePicture() {
    }

    public HousePicture(House house, String url, String description) {
        logger.info("Creating HousePicture Object | House: " + house + ", URL: " + url + ", Description: " + description);
        this.house = house;
        this.url = url;
        this.description = description;
    }

    /**
     * Basic getters and setter for the HousePicture.
     */

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
