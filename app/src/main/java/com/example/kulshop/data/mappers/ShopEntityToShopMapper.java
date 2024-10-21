package com.example.kulshop.data.mappers;

import com.example.kulshop.data.Shop;
import com.example.kulshop.data.room.ShopEntity;

public class ShopEntityToShopMapper implements Mapper<ShopEntity, Shop> {
    @Override
    public Shop map(ShopEntity val) {
        return new Shop(val.getId(), val.getTitle(), val.getAuthor(), val.getPages(), val.getNote());
    }
}
