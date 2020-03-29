package Homework13.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {
    static FamilyService familyService = new FamilyService();

    @BeforeAll
    static void beforeAll() throws IOException {
        familyService.createNewFam();
    }

    @Test
    void getAllFamiliesTest() throws IOException, ClassNotFoundException {
        assertFalse(familyService.getAllFamilies().isEmpty());
    }

    @Test
    void getFamiliesBiggerThanTest() {
    }

    @Test
    void getFamiliesLessThanTest() {
    }

    @Test
    void countAllFamiliesWithMemberNumberTest() {
    }

    @Test
    void createNewFamilyTest() {
    }

    @Test
    void createNewFamTest() {
    }

    @Test
    void deleteFamilyByIdTest() {
    }

    @Test
    void bornChildTest() {
    }

    @Test
    void adoptChildTest() {
    }

    @Test
    void deleteAllChildrenOlderThanTest() {
    }

    @Test
    void countTest() {
    }

    @Test
    void getFamilyByIdTest() {
    }

    @Test
    void getPetsTest() {
    }

    @Test
    void addPetTest() {
    }

    @Test
    void countFamiliesByMemberNumberTest() {
    }

}