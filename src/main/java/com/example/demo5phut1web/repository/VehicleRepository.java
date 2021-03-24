package com.example.demo5phut1web.repository;

import com.example.demo5phut1web.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;
import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    //Select * from dbo.vehicle where name = ?

    //Query Method
    List<Vehicle> findByName(String name);

    //Native query
    @Query(value = "Select * from Vehicle where name = :name", nativeQuery = true)
    List<Vehicle> selectByName(@Param("name") String name);

    @Query(value = "Select * from Vehicle where name in :names", nativeQuery = true)
    List<Vehicle> selectByNames(@Param("names") List<String> names);

}
