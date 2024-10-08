package com.example.springapiliveasy.controller;

import com.example.springapiliveasy.model.Load;
import com.example.springapiliveasy.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private LoadService loadService;


    @GetMapping("/load/{loadID}")
    public Load getLoad(@PathVariable("loadID") int loadID){
        return loadService.getLoad(loadID);
    }

    @GetMapping("/load")
    public List<Load> getLoadWithShipperId(@RequestParam(name = "shipperid", defaultValue = "null") String shipperId){
        if(shipperId.equals("null")){
            return loadService.getAllLoads();
        }

        return loadService.getLoadWithShipperID(shipperId);
    }

    @PostMapping("/load")
    public Load createLoad(@RequestBody Load load){
        return loadService.createNewLoad(load);
    }

    @PutMapping("/load/{loadID}")
    public Load modifyLoad(@PathVariable("loadID") int loadID, @RequestBody Load load){
        return loadService.modifyLoad(loadID, load);
    }

    @DeleteMapping("/load/{loadID}")
    public void deleteLoad(@PathVariable("loadID") int loadID){
        loadService.deleteLoad(loadID);
    }

}
