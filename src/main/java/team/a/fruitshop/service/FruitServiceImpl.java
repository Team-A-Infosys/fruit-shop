package team.a.fruitshop.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import team.a.fruitshop.entity.Fruit;
import team.a.fruitshop.repository.FruitRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FruitServiceImpl implements FruitService {

    private final FruitRepository fruitRepository;

    @Override
    public List<Fruit> createFruit(List<Fruit> fruits) {
        return this.fruitRepository.saveAll(fruits);
    }

    @Override
    public Fruit getFruit(Long id) {
        Optional<Fruit> fruit = this.fruitRepository.findById(id);
        if (fruit.isEmpty()){
            throw new IllegalArgumentException("Fruit is not found");
        }
        return fruit.get();
    }

    @Override
    public Fruit updateFruit(Fruit fruit) {
        this.getFruit(fruit.getFruitId());
        return this.fruitRepository.save(fruit);
    }

    @Override
    public List<Fruit> getAllFruits() {
        return this.fruitRepository.findAll();
    }

    @Override
    public void deleteFruit(Fruit fruit) {
        Fruit deleteFruit = this.getFruit(fruit.getFruitId());

        this.fruitRepository.delete(deleteFruit);
    }
}