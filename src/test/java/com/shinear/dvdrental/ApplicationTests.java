package com.shinear.dvdrental;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.shinear.dvdrental.model.Actor;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class ApplicationTests {

    @Test
     void testDoSomething() {
        Actor actorDo = new Actor();
        assertNull(actorDo.getLastUpdate());
        assertThat(actorDo.getFirstName()).isNull();
    }

}
