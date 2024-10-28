package org.example.interfaces;

import org.example.model.Smartwatch;
import java.util.List;
import org.apache.ibatis.annotations.*;

public interface SmartwatchMapper
{
    @Insert("INSERT INTO Smartwatch (smartwatch_id, batteryLifeHours, isWaterResistant) VALUES (#{smartwatchId}, #{batteryLifeHours}, #{isWaterResistant})")
    void insert(Smartwatch smartwatch);

    @Select("SELECT d.id AS id, d.brand, d.model, d.price, d.type, s.smartwatch_id AS smartwatchId, s.batteryLifeHours, s.isWaterResistant " +
            "FROM Smartwatch s JOIN Device d ON s.smartwatch_id = d.id WHERE s.smartwatch_id = #{smartwatchId}")
    Smartwatch findById(@Param("smartwatchId") int smartwatchId);

    @Select("SELECT d.id AS id, d.brand, d.model, d.price, d.type, s.smartwatch_id AS smartwatchId, s.batteryLifeHours, s.isWaterResistant " +
            "FROM Device d JOIN Smartwatch s ON d.id = s.smartwatch_id")
    List<Smartwatch> findAll();

    @Update("UPDATE Smartwatch SET batteryLifeHours = #{batteryLifeHours}, isWaterResistant = #{isWaterResistant} WHERE smartwatch_id = #{smartwatchId}")
    void update(Smartwatch smartwatch);

    @Delete("DELETE FROM Smartwatch WHERE smartwatch_id = #{smartwatchId}")
    void deleteById(@Param("smartwatchId") int smartwatchId);
}
