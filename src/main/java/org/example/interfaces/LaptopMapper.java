package org.example.interfaces;

import org.apache.ibatis.annotations.*;
import org.example.model.Laptop;

import java.util.List;


public interface LaptopMapper {

    @Insert("INSERT INTO Laptop (laptop_id, storage) VALUES (#{laptopId}, #{storage})")
    void insert(Laptop laptop);

    @Select("SELECT d.id AS id, d.brand, d.model, d.price, d.type, l.laptop_id AS laptopId, l.storage " +
            "FROM Device d JOIN Laptop l ON d.id = l.laptop_id")
    List<Laptop> findAll(); // Este método ahora devuelve Laptop con datos de Device.

    @Select("SELECT laptop_id AS laptopId, storage FROM Laptop WHERE laptop_id = #{laptopId}")
    Laptop findById(@Param("laptopId") int laptopId);

    @Update("UPDATE Laptop SET storage = #{storage} WHERE laptop_id = #{laptopId}")
    void update(Laptop laptop);

    @Delete("DELETE FROM Laptop WHERE laptop_id = #{laptopId}")
    void deleteById(@Param("laptopId") int laptopId);
}
