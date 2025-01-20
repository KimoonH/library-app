package com.group.libraryapp.service.fruit;

import com.group.libraryapp.dto.fruit.request.FruitCreateRequest;
import com.group.libraryapp.dto.fruit.request.FruitUpdateRequest;
import com.group.libraryapp.dto.fruit.response.FruitStatResponse;
import com.group.libraryapp.repository.fruit.FruitRepository;
import org.springframework.stereotype.Service;

@Service
public class FruitService {

    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public void createFruit(FruitCreateRequest request) {
        fruitRepository.createFruit(request);
    }

    public void updateFruit(FruitUpdateRequest request) {
        fruitRepository.updateFruit(request);
    }

    public FruitStatResponse statFruit(String name) {
        return fruitRepository.statFruit(name);
    }
}
