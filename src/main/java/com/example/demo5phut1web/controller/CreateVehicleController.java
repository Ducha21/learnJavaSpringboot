package com.example.demo5phut1web.controller;

import com.example.demo5phut1web.dto.VehicleDto;
import com.example.demo5phut1web.model.Vehicle;
import com.example.demo5phut1web.service.CreateVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class CreateVehicleController {
    @Autowired
    private CreateVehicleService createVehicleService;

    @GetMapping
    public List<Vehicle> getAllVehicle() {
        return createVehicleService.getAllListVehicle();
    }

    @PostMapping
    public void createOne(@RequestBody VehicleDto dto) {
        createVehicleService.createOneVehicle(dto);
        return;
    }

    @PutMapping("/{id}")
    public Boolean editVehicle(@RequestBody VehicleDto dto, @RequestParam("id") Long idt) {
        try {
            return createVehicleService.editVehicle(idt, dto);
        } catch (Exception ex) {
            System.out.println("Gap van de khi luu. Loi La: " + ex.getMessage());
            return false;
        }
    }
}
