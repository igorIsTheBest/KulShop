package com.example.kulshop.data.mappers;

import com.example.kulshop.data.Shop;
import cocom.example.kulshop.data.room.ShopEntity;

public class ShopToShopEntityMapper implements Mapper<Shop, ShopEntity> {
    @Override
    public ShopEntity map(Shop val) {
        return new ShopEntity(val.getTitle(),val.getAuthor(), val.getPages(),val.getNote());
    }
}
