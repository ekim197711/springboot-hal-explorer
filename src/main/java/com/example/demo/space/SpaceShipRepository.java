package com.example.demo.space;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="spacevessel")
public interface SpaceShipRepository extends PagingAndSortingRepository<SpaceShip, Integer> {

}
