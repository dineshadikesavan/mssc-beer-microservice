package com.tsc.msscbeerservice.repository;

import com.tsc.msscbeerservice.domain.Beer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BeerRepository extends CrudRepository<Beer, UUID> {
}
