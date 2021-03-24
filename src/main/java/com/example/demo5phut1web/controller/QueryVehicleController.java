package com.example.demo5phut1web.controller;

import com.example.demo5phut1web.model.Vehicle;
import com.example.demo5phut1web.repository.VehicleRepository;
import com.example.demo5phut1web.service.QueryVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/query/vehicle")
public class QueryVehicleController {
    @Autowired
    private QueryVehicleService queryVehicleService;

    @GetMapping("/byname")
    public List<Vehicle> findVehicleByName(@RequestParam("name") String name){
        return queryVehicleService.getVehicleByName(name);
    }

    @GetMapping("/bynames")
    public List<Vehicle> findVehicleByNames(@RequestParam("names") List<String> name){
        return queryVehicleService.getVehicleByNames(name);
    }
}
