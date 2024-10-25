package org.example.interfaces;

import org.apache.ibatis.annotations.*;
import org.example.model.Tablet;

import java.util.List;

public interface TabletMapper {


    @Insert("INSERT INTO Tablet (tablet_id, hasCellular) VALUES (#{id}, #{hasCellular})")
    void insert(Tablet tablet);


    @Select("SELECT * FROM Tablet WHERE tablet_id = #{id}")
    Tablet findById(@Param("id") int id);


    @Select("SELECT * FROM Tablet")
    List<Tablet> findAll();

}
