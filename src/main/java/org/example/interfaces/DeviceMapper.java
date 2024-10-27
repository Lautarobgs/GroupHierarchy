package org.example.interfaces;

import org.apache.ibatis.annotations.*;
import org.example.model.Device;

import java.util.List;

public interface DeviceMapper {
    @Insert("INSERT INTO Device(id,brand,model,price,type) VALUES (#{id}, #{brand}, #{model}, #{price}, #{type}")
    void insert(Device device);

    @Select("SELECT * FROM Device WHERE id = #{id}")
    Device findById(@Param("id") int id);

    @Select("SELECT * FROM Device")
    List<Device> findAll();

    @Update("UPDATE Device SET brand = #{brand}, model = #{model}, price = #{price}, type = #{type} WHERE id = #{id}")
    void update(Device device);

    @Delete("DELETE FROM Device WHERE device_id = #{deviceId}")
    void deleteById(@Param("deviceId") int deviceId);
}
