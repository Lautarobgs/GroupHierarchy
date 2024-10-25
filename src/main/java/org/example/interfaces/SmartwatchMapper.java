package org.example.interfaces;

import org.example.model.Smartwatch;
import java.util.List;
import org.apache.ibatis.annotations.*;

public interface SmartwatchMapper
{
    @Insert("INSERT INTO Smartwatch (smartwatch_id, batteryLifeHours, isWaterResistant) VALUES (#{smartwatchId}, #{batteryLifeHours}, #{isWaterResistant})")
    void insert(Smartwatch smartwatch);

    @Select("SELECT * FROM Smartwatch WHERE smartwatch_id = #{smartwatchId}")
    Smartwatch findById(@Param("smartwatchId") int smartwatchId);

    @Select("SELECT * FROM Smartwatch")
    List<Smartwatch> findAll();

    @Update("UPDATE Smartwatch SET batteryLifeHours = #{batteryLifeHours}, isWaterResistant = #{isWaterResistant} WHERE smartwatch_id = #{smartwatchId}")
    void update(Smartwatch smartwatch);

    @Delete("DELETE FROM Smartwatch WHERE smartwatch_id = #{smartwatchId}")
    void deleteById(@Param("smartwatchId") int smartwatchId);
}
