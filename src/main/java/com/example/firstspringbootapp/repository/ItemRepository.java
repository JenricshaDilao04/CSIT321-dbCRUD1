package com.example.firstspringbootapp.repository;

import org.springframework.stereotype.Repository;

@Repository 
public interface ItemRepository extends JpaRepository<ItemEntity, Integer>{
}
