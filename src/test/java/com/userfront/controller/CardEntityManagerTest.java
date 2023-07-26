package com.userfront.controller;

import com.userfront.models.Card;
import com.userfront.repositories.CardRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// TODO: test the controller as a class from
// entity manager

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CardEntityManagerTest {

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    public void setUp() {
        Card card = new Card();
        card.setName("Test Name");
        card.setNumber(12345);
        card.setYear(2023);

        entityManager.persist(card);
        entityManager.flush();
    }

    @Test
    public void testFindByName() {
        Card card = entityManager.getEntityManager()
                .createQuery("SELECT c FROM Card c WHERE c.number = :number", Card.class)
                .setParameter("number", 12345)
                .getSingleResult();
        assertThat(card.getName()).isEqualTo("Test Name");
    }
}
