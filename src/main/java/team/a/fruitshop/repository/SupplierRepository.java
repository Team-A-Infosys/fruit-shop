package team.a.fruitshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.a.fruitshop.entity.Supplier;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

//    List<Supplier> saveAll(List<Supplier> suppliers);
}