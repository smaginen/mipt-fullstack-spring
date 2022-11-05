package com.mipt.fullstack.spring.domain.repo;

import com.mipt.fullstack.spring.domain.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
