package ezinne.springframework.repositories;

import ezinne.springframework.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@Disabled
@RunWith(SpringRunner.class)
@ContextConfiguration
class UnitOfMeasureRepositoryIT {

    @Autowired
     UnitOfMeasureRepository unitOfMeasureRepository;


    @BeforeEach
    void setUp() {
    }

    @Test
    void findByDescription() {

        UnitOfMeasure uom = new UnitOfMeasure();
        uom.setDescription("Teaspoon");
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        assertEquals("Teaspoon", uomOptional.get().getDescription());
    }
}