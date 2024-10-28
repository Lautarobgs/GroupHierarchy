package org.example.interfaces;

import org.apache.ibatis.annotations.*;
import org.example.model.Laptop;

import java.util.List;


public interface LaptopMapper {

    @Insert("INSERT INTO Laptop (laptop_id, storage) VALUES (#{laptopId}, #{storage})")
    void insert(Laptop laptop);

    @Select("SELECT laptop_id AS laptopId, storage FROM Laptop WHERE laptop_id = #{laptopId}")
    Laptop findById(@Param("laptopId") int laptopId);

    @Select("SELECT laptop_id AS laptopId, storage FROM Laptop")
    List<Laptop> findAll();

    @Update("UPDATE Laptop SET storage = #{storage} WHERE laptop_id = #{laptopId}")
    void update(Laptop laptop);

    @Delete("DELETE FROM Laptop WHERE laptop_id = #{laptopId}")
    void deleteById(@Param("laptopId") int laptopId);
}
