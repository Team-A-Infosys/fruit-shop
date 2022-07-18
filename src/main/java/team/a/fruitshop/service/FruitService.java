package team.a.fruitshop.service;

import team.a.fruitshop.entity.Fruit;

import java.util.List;

public interface FruitService {
    List<Fruit> createFruit(List<Fruit> fruits);

    Fruit getFruit(Long id);

    Fruit updateFruit(Fruit fruit);

    List<Fruit> getAllFruits();

    void deleteFruit(Fruit fruit);
}