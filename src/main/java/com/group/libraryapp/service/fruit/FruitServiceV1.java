package com.group.libraryapp.service.fruit;

import com.group.libraryapp.dto.fruit.request.FruitCreateRequest;
import com.group.libraryapp.dto.fruit.request.FruitUpdateRequest;
import com.group.libraryapp.dto.fruit.response.FruitStatResponse;
import com.group.libraryapp.repository.fruit.FruitRepositoryV1;
import org.springframework.stereotype.Service;

@Service
public class FruitServiceV1 {

    private final FruitRepositoryV1 fruitRepositoryV1;

    public FruitServiceV1(FruitRepositoryV1 fruitRepositoryV1) {
        this.fruitRepositoryV1 = fruitRepositoryV1;
    }

    public void createFruit(FruitCreateRequest request) {
        fruitRepositoryV1.createFruit(request);
    }

    public void updateFruit(FruitUpdateRequest request) {
        fruitRepositoryV1.updateFruit(request);
    }

    public FruitStatResponse statFruit(String name) {
        return fruitRepositoryV1.statFruit(name);
    }
}
