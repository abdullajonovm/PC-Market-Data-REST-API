package com.example.pcmarket.repository;

import com.example.pcmarket.entity.Korzinka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "korzinka")
public interface KorzinkaRepository extends JpaRepository<Korzinka, Integer> {
}