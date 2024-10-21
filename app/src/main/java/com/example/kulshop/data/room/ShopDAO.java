package com.example.kulshop.data.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;


@Dao
public interface ShopDAO {
    @Query("SELECT * FROM Shops")
    List<ShopEntity> getAll();

    @Insert
    void insert(ShopEntity shop);

}

