package com.example.kulshop.data.mappers;

public interface Mapper<I,O> {
    O map(I value);
}
