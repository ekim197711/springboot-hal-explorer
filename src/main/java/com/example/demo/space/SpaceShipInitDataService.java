package com.example.demo.space;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.Serial;

@Service
@RequiredArgsConstructor
public class SpaceShipInitDataService {
    private final SpaceShipRepository repository;

    @PostConstruct
    public void initData(){
        repository.save(new SpaceShip(null,"round", "Mike",88));
        repository.save(new SpaceShip(null,"pyramid", "Susan",98));
        repository.save(new SpaceShip(null,"box", "Pia",80));
        repository.save(new SpaceShip(null,"swan", "Mari",6));
    }

}
