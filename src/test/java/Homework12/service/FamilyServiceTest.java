package Homework12.service;

import Homework12.model.Human;
import Homework12.model.Pet;
import Homework12.model.Type;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {
    static FamilyService familyService = new FamilyService();


    @BeforeAll
    static  void beforeAll(){
        familyService.createNewFam();
    }

    @Test
    void createNewFamTest() {
        assertFalse(familyService.getAllFamilies().isEmpty());
    }

    @Test
    void getAllFamiliesTest() {
        assertEquals(2,familyService.getAllFamilies().size());
    }

    @Test
    void getFamilyByIdTest() {
        assertTrue(familyService.getAllFamilies().contains(familyService.getFamilyById(1)));
    }

    @Test
    void getFamiliesBiggerThanTest() {
        assertFalse(familyService.getFamiliesBiggerThan(3).isEmpty());
    }

    @Test
    void getFamiliesLessThanTest() {
        assertFalse(familyService.getFamiliesLessThan(3).isEmpty());
    }

    @Test
    void countAllFamiliesWithMemberNumberTest() {
        assertFalse(familyService.countAllFamiliesWithMemberNumber().isEmpty());
    }

    @Test
    void createNewFamilyTest() {
        Human woman = new Human();
        Human man = new Human();
        familyService.createNewFamily(woman,man);
        assertEquals(3,familyService.count());
    }

    @Test
    void deleteFamilyByIdTest() {
        familyService.deleteFamilyById(2);
        assertEquals(1,familyService.count());
    }

    @Test
    void bornChildTest() {
        familyService.bornChild(familyService.getFamilyById(2), Type.boy,"Louis");
        assertEquals(1,familyService.getFamilyById(2).getChildren().size());
    }

    @Test
    void adoptChildTest() {
        Human child = new Human();
        familyService.adoptChild(familyService.getFamilyById(2),child);
        assertEquals(1,familyService.getFamilyById(2).getChildren().size());
    }

    @Test
    void deleteAllChildrenOlderThanTest() {
        familyService.deleteAllChildrenOlderThan(18);
        assertEquals(1,familyService.getFamilyById(1).getChildren().size());
    }

    @Test
    void countTest() {
        assertEquals(2,familyService.count());
    }

    @Test
    void getPetsTest() {
        assertFalse(familyService.getPets(2).isEmpty());
    }

    @Test
    void addPetTest() {
        Pet pet = new Pet() {
            @Override
            public void respond(String nickname) {

            }
        };
        familyService.addPet(1, pet);
        assertEquals(1,familyService.getFamilyById(1).getPet().size());
    }

    @Test
    void countFamiliesByMemberNumberTest() {
        assertFalse(familyService.countFamiliesByMemberNumber(4).isEmpty());

    }
}