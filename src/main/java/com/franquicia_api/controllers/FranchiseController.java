package com.franquicia_api.controllers;

import com.franquicia_api.models.Franchise;
import com.franquicia_api.models.Branch;
import com.franquicia_api.models.Product;
import com.franquicia_api.services.FranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/franchises")
public class FranchiseController {
    @Autowired
    private FranchiseService franchiseService;

    @PostMapping
    public ResponseEntity<Franchise> createFranchise(@RequestBody Franchise franchise) {
        return ResponseEntity.ok(franchiseService.addFranchise(franchise));
    }

    @PostMapping("/{franchiseId}/branches")
    public ResponseEntity<Branch> createBranch(@PathVariable Long franchiseId, @RequestBody Branch branch) {
        return ResponseEntity.ok(franchiseService.addBranchToFranchise(franchiseId, branch));
    }

    @PostMapping("/branches/{branchId}/products")
    public ResponseEntity<Product> createProduct(@PathVariable Long branchId, @RequestBody Product product) {
        return ResponseEntity.ok(franchiseService.addProductToBranch(branchId, product));
    }

    @DeleteMapping("/products/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId) {
        franchiseService.deleteProduct(productId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/products/{productId}/stock")
    public ResponseEntity<Product> updateProductStock(@PathVariable Long productId, @RequestParam int stock) {
        return ResponseEntity.ok(franchiseService.updateProductStock(productId, stock));
    }

    @GetMapping("/{franchiseId}/products/most-stock")
    public ResponseEntity<List<Product>> getProductsWithMostStock(@PathVariable Long franchiseId) {
        return ResponseEntity.ok(franchiseService.getProductsWithMostStock(franchiseId));
    }
}
