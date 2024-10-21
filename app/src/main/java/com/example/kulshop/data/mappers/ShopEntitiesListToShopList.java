package com.example.kulshop.data.mappers;

import com.example.kulshop.data.Shop;
import com.example.kulshop.data.room.ShopEntity;

import java.util.ArrayList;
import java.util.List;

public class ShopEntitiesListToShopList implements Mapper<List<ShopEntity>, List<Shop>> {

    @Override
    public List<Shop> map(List<ShopEntity> value) {
        ShopEntityToShopMapper mapper=new ShopEntityToShopMapper();
        List<Shop> result=new ArrayList<>();
        for(ShopEntity shop:value){
            result.add(mapper.map(shop));
        }
        return result;
    }
}
