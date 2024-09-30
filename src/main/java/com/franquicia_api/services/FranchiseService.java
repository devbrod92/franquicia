package com.franquicia_api.services;

import com.franquicia_api.models.Franchise;
import com.franquicia_api.models.Branch;
import com.franquicia_api.models.Product;
import com.franquicia_api.repositories.FranchiseRepository;
import com.franquicia_api.repositories.BranchRepository;
import com.franquicia_api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FranchiseService {
    @Autowired
    private FranchiseRepository franchiseRepository;
    @Autowired
    private BranchRepository branchRepository;
    @Autowired
    private ProductRepository productRepository;

    public Franchise addFranchise(Franchise franchise) {
        return franchiseRepository.save(franchise);
    }

    public Branch addBranchToFranchise(Long franchiseId, Branch branch) {
        Franchise franchise = franchiseRepository.findById(franchiseId).orElseThrow();
        branch.setFranchise(franchise);
        return branchRepository.save(branch);
    }

    public Product addProductToBranch(Long branchId, Product product) {
        Branch branch = branchRepository.findById(branchId).orElseThrow();
        product.setBranch(branch);
        return productRepository.save(product);
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

    public Product updateProductStock(Long productId, int stock) {
        Product product = productRepository.findById(productId).orElseThrow();
        product.setStock(stock);
        return productRepository.save(product);
    }

    public List<Product> getProductsWithMostStock(Long franchiseId) {
        return productRepository.findProductsWithMostStockByFranchise(franchiseId);
    }
}
