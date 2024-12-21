package com.tsc.msscbeerservice.mapper;

import com.tsc.msscbeerservice.domain.Beer;
import com.tsc.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
