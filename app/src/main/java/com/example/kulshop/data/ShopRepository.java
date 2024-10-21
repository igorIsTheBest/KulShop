package com.example.kulshop.data;

import com.example.kulshop.data.concurency.TaskCallback;

import java.util.List;

public interface ShopRepository {
    void addNewShop(Shop shop);

    void getAllShops(TaskCallback<List<Shop>> callback);
}
