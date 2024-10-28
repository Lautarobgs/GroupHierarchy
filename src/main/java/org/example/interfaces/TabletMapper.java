package org.example.interfaces;

import org.apache.ibatis.annotations.*;
import org.example.model.Tablet;

import java.util.List;

public interface TabletMapper {

    @Insert("INSERT INTO Tablet (tablet_id, hasCellular) VALUES (#{tabletId}, #{hasCellular})")
    void insert(Tablet tablet);

    @Select("SELECT d.id AS id, d.brand, d.model, d.price, d.type, t.tablet_id AS tabletId, t.hasCellular " +
            "FROM Device d JOIN Tablet t ON d.id = t.tablet_id")
    List<Tablet> findAll();

    @Select("SELECT d.id AS id, d.brand AS brand, d.model AS model, d.price AS price, d.type AS type, " +
            "t.tablet_id AS tabletId, t.hasCellular FROM Tablet t " +
            "JOIN Device d ON t.tablet_id = d.id WHERE t.tablet_id = #{tabletId}")
    Tablet findById(@Param("tabletId") int tabletId);

    @Update("UPDATE Tablet SET hasCellular = #{hasCellular} WHERE tablet_id = #{tabletId}")
    void update(Tablet tablet);

    @Delete("DELETE FROM Tablet WHERE tablet_id = #{tabletId}")
    void deleteById(@Param("tabletId") int tabletId);

}
