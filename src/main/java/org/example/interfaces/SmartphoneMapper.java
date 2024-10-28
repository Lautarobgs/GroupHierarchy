package org.example.interfaces;

import org.apache.ibatis.annotations.*;
import org.example.model.Smartphone;

import java.util.List;

public interface SmartphoneMapper {
    @Insert("INSERT INTO Smartphone (smartphone_id, batteryCapacity) VALUES (#{smartphoneId}, #{batteryCapacity})")
    void insert(Smartphone smartphone);

    @Select("SELECT * FROM Smartphone WHERE smartphone_id = #{smartphoneId}")
    Smartphone findById(@Param("smartphoneId") int smartphoneId);

    @Select("SELECT * FROM Smartphone")
    List<Smartphone> findAll();

    @Select("SELECT * FROM Smartphone WHERE batteryCapacity = #{batteryCapacity}")
    Smartphone findByBatteryCapacity(@Param("batteryCapacity") int batteryCapacity);

    @Update("UPDATE Smartphone " +
            "SET brand = #{brand}, model = #{model}, price = #{price}, type = #{type}, " +
            "batteryCapacity = #{batteryCapacity} WHERE id = #{id}")
    void update(Smartphone smartphone);

    @Delete("DELETE FROM Smartwatch WHERE smartphone_id = #{smartphoneId}")
    void deleteById(@Param("smartphoneId") int smartphoneId);
}
