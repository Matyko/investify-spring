package com.futurebillionaires.codecool.investify.Database;

import com.futurebillionaires.codecool.investify.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DBHandler {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HousePictureRepository  housePictureRepository;

    @Autowired
    private HouseRepository houseRepository;

    @Autowired
    private InvestmentRepository investmentRepository;

    @Autowired
    private MoneyPoolRepository moneyPoolRepository;

    @Autowired
    private ShareholdForSaleRepository shareholdForSaleRepository;

    @Autowired
    private ShareholdRepository shareholdRepository;

    @Autowired
    public DBHandler(UserRepository repository) {
        this.userRepository = repository;
    }

    public DBHandler(HouseRepository repository) {
        this.houseRepository = repository;
    }

    public DBHandler(HousePictureRepository repository) {
        this.housePictureRepository = repository;
    }

    public DBHandler(InvestmentRepository repository) {
        this.investmentRepository = repository;
    }

    public DBHandler(MoneyPoolRepository repository) {
        this.moneyPoolRepository = repository;
    }

    public DBHandler(ShareholdForSaleRepository repository) {
        this.shareholdForSaleRepository = repository;
    }

    public DBHandler(ShareholdRepository repository) {
        this.shareholdRepository = repository;
    }


    public void save(User user) {
        userRepository.save(user);
    }

    public void save(HousePicture housePicture) {
        housePictureRepository.save(housePicture);
    }

    public void save(House house) {
        houseRepository.save(house);
    }

    public void save(Investment investment) {
        investmentRepository.save(investment);
    }

    public void save(MoneyPool moneyPool) {
        moneyPoolRepository.save(moneyPool);
    }

    public void save(Sharehold sharehold) {
        shareholdRepository.save(sharehold);
    }

    public void save(ShareholdForSale shareholdForSale) {
        shareholdForSaleRepository.save(shareholdForSale);
    }

    public List<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> findByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    public List<User> findByLastName(String lastName) { return userRepository.findByLastName(lastName);}

    public List<User> findByUsername(String username) { return userRepository.findByLastName(username);}
}
