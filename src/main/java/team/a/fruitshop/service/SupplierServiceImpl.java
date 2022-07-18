package team.a.fruitshop.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import team.a.fruitshop.entity.Supplier;
import team.a.fruitshop.repository.SupplierRepository;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class SupplierServiceImpl {

    private final SupplierRepository supplierRepository;

    @Override
    public List<Supplier> createSupplier(List<Supplier> suppliers){
        return this.supplierRepository.saveAll(suppliers);
    }

    @Override
    public Supplier getSupplier(Long Id) {
        Optional<Supplier> supplier = this.supplierRepository.findById(Id);
        if (supplier.isEmpty()) {
            throw new IllegalArgumentException("Supplier is not found!!");
        }
        return supplier.get();
    }
    @Override
    public Supplier updateSupplier(Supplier supplier) {
        Supplier updateSupplier = this.getSupplier(supplier.getSupplierId());
        return this.supplierRepository.save(updateSupplier);
    }

    @Override
    public List<Supplier> getAllSupplier(){
        return this.supplierRepository.findAll();
    }

    @Override
    public void deleteSupplier (Supplier supplier);
    Supplier deleteSupplier = this.getSupplier(supplier.getSupplierId());

    this.SupplierRepository.delete(deleteSupplier);


}
