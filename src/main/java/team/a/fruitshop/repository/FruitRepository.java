package team.a.fruitshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.a.fruitshop.entity.Fruit;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {
}