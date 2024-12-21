package com.tsc.msscbeerservice.web.service;

import com.tsc.msscbeerservice.web.model.BeerDto;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID beerId) throws ChangeSetPersister.NotFoundException;

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeerById(UUID beerId, BeerDto beerDto) throws ChangeSetPersister.NotFoundException;
}
