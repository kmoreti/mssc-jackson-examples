package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
class BeerDtoTest extends BaseTest{

    @Test
    void testSerializeDto() throws JsonProcessingException {

        BeerDto beerDto = getBeerDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws IOException {
        String json = "{\"beerId\":\"2192eba6-8b60-4c30-b47a-21663489aca7\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":12312321232,\"price\":12.99,\"createdDate\":\"2020-08-03T22:21:45+0100\",\"lastUpdatedDate\":\"2020-08-03T20:27:12.33343+01:00\",\"myLocalDate\":\"20200803\"}";

        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(beerDto);
    }

}