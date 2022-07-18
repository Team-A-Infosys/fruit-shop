package team.a.fruitshop.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import team.a.fruitshop.entity.Fruit;
import team.a.fruitshop.service.FruitService;

import java.util.List;

@RestController
@AllArgsConstructor
public class FruitController {

    private final FruitService fruitService;

    @PostMapping("/dashboard/create/fruit")
    public List<Fruit> addFruit(@RequestBody List<Fruit> fruits){
       return this.fruitService.createFruit(fruits);
    }

    @GetMapping("/fruit/{id}")
    public Fruit getFruit(@PathVariable("id") Long id){
        return this.fruitService.getFruit(id);
    }

    @PutMapping("/fruit/{id}")
    public Fruit updateFruit(@PathVariable("id") Long id, @RequestBody Fruit fruit){
        return this.fruitService.updateFruit(fruit);
    }

}