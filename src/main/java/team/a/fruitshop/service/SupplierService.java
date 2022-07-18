package team.a.fruitshop.service;

import team.a.fruitshop.entity.Supplier;
import java.util.List;
import java.util.Optional;

public interface SupplierService {

    List<Supplier> createSupplier(List<Supplier> suppliers);

    Supplier getSupplier (Long Id);

    Supplier updateSupplier (Supplier supplier);

    List<Supplier> getAllSuppliers();

    void deleteSupplier (Supplier supplier);



}