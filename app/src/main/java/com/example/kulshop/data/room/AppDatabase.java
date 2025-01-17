package com.example.kulshop.data.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {ShopEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ShopDAO geShopDAO();
}