package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourseRepository extends JpaRepository<Resource, Long> {
}
