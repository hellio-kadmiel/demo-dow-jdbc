package model.dao;

import moldel.entities.Department;
import moldel.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);;
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();

}
