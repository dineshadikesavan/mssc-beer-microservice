package com.tsc.msscbeerservice.web.controller;

import com.tsc.msscbeerservice.web.model.BeerDto;
import com.tsc.msscbeerservice.web.service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
@RequiredArgsConstructor
public class BeerController {

    @Autowired
    private final BeerService beerService;

    @GetMapping("{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) throws ChangeSetPersister.NotFoundException {
        //return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);

        return new ResponseEntity<>(beerService.getById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@RequestBody BeerDto beerDto) {
       // return new ResponseEntity<>(HttpStatus.CREATED);

        return new ResponseEntity<>(beerService.saveNewBeer(beerDto), HttpStatus.CREATED);
    }

    @PutMapping("{beerId}")
    public ResponseEntity<BeerDto> updateBeerById(@RequestBody BeerDto beerDto, @PathVariable("beerId") UUID beerId) throws ChangeSetPersister.NotFoundException {
        //return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(beerService.updateBeerById(beerId, beerDto), HttpStatus.NO_CONTENT);
    }

}
