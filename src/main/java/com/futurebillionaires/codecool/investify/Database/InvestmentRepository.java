package com.futurebillionaires.codecool.investify.Database;

import com.futurebillionaires.codecool.investify.Model.Investment;
import org.springframework.data.repository.CrudRepository;


public interface InvestmentRepository extends CrudRepository<Investment, Long> {


}
