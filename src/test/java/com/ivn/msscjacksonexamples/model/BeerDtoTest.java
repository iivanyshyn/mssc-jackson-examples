package com.ivn.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void shouldSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void shouldDeserializeString() throws JsonProcessingException {
        String json = "{\"beerName\":\"Beer Name\",\"beerStyle\":\"Ale\",\"upc\":123456123456,\"price\":\"15.99\",\"createdDate\":\"2021-12-26T18:24:48+0200\",\"lastUpdatedDate\":\"2021-12-26T18:20:32.4837491+02:00\",\"myLocalDate\":\"20211226\",\"beerId\":\"19c90c7d-661c-470e-b729-575792b690b0\"}";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }
}