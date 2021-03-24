package com.example.demo5phut1web.service;

import com.example.demo5phut1web.model.Vehicle;
import com.example.demo5phut1web.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryVehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicleByName(String name){
        List<Vehicle> result = vehicleRepository.selectByName(name);
        System.out.println(result);
        System.out.println("So luong vehcle la: "+result.size());
        return result;
    }

    public List<Vehicle> getVehicleByNames(List<String> names){
        List<Vehicle> result = vehicleRepository.selectByNames(names);
        System.out.println(result);
        System.out.println("So luong vehcle la: "+result.size());
        return result;
    }

}
