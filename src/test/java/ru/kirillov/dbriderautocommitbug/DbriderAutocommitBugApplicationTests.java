package ru.kirillov.dbriderautocommitbug;

import com.github.database.rider.core.api.configuration.DBUnit;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.api.DBRider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@DBRider
@DBUnit
class DbriderAutocommitBugApplicationTests {
    @Autowired
    private SimpleRepository repository;

    @Test
    @DataSet("example.yml")
    void contextLoads() {
        assertThat(repository.findAll()).isNotEmpty();
    }

}
