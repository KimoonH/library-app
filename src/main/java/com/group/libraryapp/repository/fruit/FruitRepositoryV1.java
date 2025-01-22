package com.group.libraryapp.repository.fruit;

import com.group.libraryapp.dto.fruit.request.FruitCreateRequest;
import com.group.libraryapp.dto.fruit.request.FruitUpdateRequest;
import com.group.libraryapp.dto.fruit.response.FruitStatResponse;

public interface FruitRepositoryV1 {

    void createFruit(FruitCreateRequest request);

    void updateFruit(FruitUpdateRequest request);

    FruitStatResponse statFruit(String name);

}
