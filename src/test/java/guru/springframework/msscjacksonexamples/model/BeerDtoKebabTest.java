package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@JsonTest
@ActiveProfiles("kebab")
public class BeerDtoKebabTest extends BaseTest {

    @Test
    void testDtoKebab() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();

        String json = objectMapper.writeValueAsString(beerDto);

        System.out.println(json);
    }
}
