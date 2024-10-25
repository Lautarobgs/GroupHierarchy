package org.example.interfaces;

import org.apache.ibatis.annotations.*;
import org.example.model.Laptop;

import java.util.List;


public interface LaptopMapper {

    @Insert("INSERT INTO Laptop (id, storage) VALUES (#{id}, #{storage})")
    void insert(Laptop laptop);

    @Select("SELECT * FROM Laptop WHERE id = #{id}")
    Laptop findById(@Param("id") int id);

    @Select("SELECT * FROM Laptop")
    List<Laptop> findAll();

}
