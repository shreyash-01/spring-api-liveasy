package com.example.springapiliveasy.service;


import com.example.springapiliveasy.model.Load;
//import com.example.springapiliveasy.repository.LoadRepository;
import com.example.springapiliveasy.repository.LoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadService {

    @Autowired
    private LoadRepository loadRepository;


    public Load createNewLoad(Load load) {
        return loadRepository.save(load);
    }

    public Load getLoad(int loadID) {
        return loadRepository.findById(String.valueOf(loadID)).get();
    }

    public Load modifyLoad(int loadID, Load load) {
        Load temp = loadRepository.findById(String.valueOf(loadID)).get();
        temp.setLoadingPoint(load.getLoadingPoint());
        temp.setUnloadingPoint(load.getUnloadingPoint());
        temp.setProductType(load.getProductType());
        temp.setTruckType(load.getTruckType());
        temp.setComment(load.getComment());
        temp.setNoOfTrucks(load.getNoOfTrucks());
        temp.setDate(load.getDate());
        temp.setWeight(load.getWeight());
        temp.setShipperId(temp.getShipperId());
        return loadRepository.save(temp);
    }

    public void deleteLoad(int loadID) {
        loadRepository.deleteById(String.valueOf(loadID));
    }

//    public List<Load> getLoadWithShipperID(String shipperId) {
//        return loadRepository.findLoadByShipperId(shipperId);
//
//    }

    public List<Load> getAllLoads() {
        return loadRepository.findAll();
    }
}
