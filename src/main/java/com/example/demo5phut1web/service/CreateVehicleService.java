package com.example.demo5phut1web.service;

import com.example.demo5phut1web.dto.VehicleDto;
import com.example.demo5phut1web.model.Vehicle;
import com.example.demo5phut1web.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreateVehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;
    private String a;
    public List<Vehicle> getAllListVehicle(){
        List<Vehicle> listVe = vehicleRepository.findAll();
        return listVe;
    }
    public void createOneVehicle(VehicleDto dto){
        Vehicle vehicle = new Vehicle();
        vehicle.setName(dto.getName());
        vehicle.setType(dto.getType());
        vehicleRepository.save(vehicle);
        return;
    }
    public Boolean editVehicle(Long id, VehicleDto dto){
        Optional<Vehicle> vehicleOptional = vehicleRepository.findById(id);
        if(!vehicleOptional.isPresent()){
            System.out.println("Loai xe voi id: "+id+" Khong ton tai");
            return false;
        }
        Vehicle vihecle = vehicleOptional.get();
        vihecle.setType(dto.getType());
        vihecle.setName(dto.getName());
        vehicleRepository.save(vihecle);
        System.out.println("Sua thong tin xe thanh cong");
        return true;
    }
}
