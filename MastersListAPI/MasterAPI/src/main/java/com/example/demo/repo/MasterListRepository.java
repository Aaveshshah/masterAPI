package com.example.demo.repo;

import com.example.demo.model.MasterList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterListRepository extends JpaRepository<MasterList, Long> {
}