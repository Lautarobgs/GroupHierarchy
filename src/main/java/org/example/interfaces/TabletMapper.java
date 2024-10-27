package org.example.interfaces;

import org.apache.ibatis.annotations.*;
import org.example.model.Tablet;

import java.util.List;

public interface TabletMapper {

    @Insert("INSERT INTO Tablet (tablet_id, hasCellular) VALUES (#{tabletId}, #{hasCellular})")
    void insert(Tablet tablet);

    @Select("SELECT tablet_id AS tabletId, hasCellular FROM Tablet WHERE tablet_id = #{tabletId}")
    Tablet findById(@Param("tabletId") int tabletId);

    @Select("SELECT tablet_id AS tabletId, hasCellular FROM Tablet")
    List<Tablet> findAll();

    @Update("UPDATE Tablet SET hasCellular = #{hasCellular} WHERE tablet_id = #{tabletId}")
    void update(Tablet tablet);

    @Delete("DELETE FROM Tablet WHERE tablet_id = #{tabletId}")
    void deleteById(@Param("tabletId") int tabletId);

}
