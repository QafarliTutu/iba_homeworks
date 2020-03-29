package Homework13.service;

import Homework13.model.Human;
import Homework13.model.Pet;
import Homework13.model.Type;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import Homework13.model.Family;
import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest implements Serializable {
    static FamilyService familyService = new FamilyService();

    @BeforeAll
    static void beforeAll() throws IOException {                        // 2 families added // it means createNewFam() works , so no need test for this :)
        familyService.createNewFam();
    }

    @Test
    void createNewFamilyTest() throws IOException, ClassNotFoundException {
        Human woman = new Human();
        Human man = new Human();
        familyService.createNewFamily(woman,man);                       // 3rd family added
        assertEquals(3,familyService.getAllFamilies().size());
    }

    @Test
    void getAllFamiliesTest() throws IOException, ClassNotFoundException {
        assertFalse(familyService.getAllFamilies().isEmpty());
    }

    @Test
    void getFamilyByIdTest() throws IOException, ClassNotFoundException {
        assertTrue(familyService.getAllFamilies().contains(familyService.getFamilyById(2)));
    }

    @Test
    void deleteAllChildrenOlderThanTest() throws IOException, ClassNotFoundException {     // decreases 1st family's children  array's size
        familyService.deleteAllChildrenOlderThan(18);
        assertEquals(1,familyService.getFamilyById(1).getChildren().size());
    }


    @Test
    void getFamiliesBiggerThanTest() throws IOException, ClassNotFoundException {
        assertFalse(familyService.getFamiliesBiggerThan(2).isEmpty());
    }

    @Test
    void getFamiliesLessThanTest() throws IOException, ClassNotFoundException {
        assertFalse(familyService.getFamiliesLessThan(3).isEmpty());
    }

    @Test
    void countAllFamiliesWithMemberNumberTest() throws IOException, ClassNotFoundException {
        List<Integer> countList = new ArrayList<>();
        countList.add(3);
        countList.add(2);
        assertEquals(countList,familyService.countAllFamiliesWithMemberNumber());
    }


    @Test
    void deleteFamilyByIdTest() throws IOException, ClassNotFoundException {
        familyService.deleteFamilyById(1);
        assertEquals(2,familyService.getAllFamilies().size());

    }

    @Test
    void bornChildTest() throws IOException, ClassNotFoundException {
        familyService.bornChild(familyService.getFamilyById(2), Type.boy,"John");
        assertFalse(familyService.getFamilyById(2).getChildren().isEmpty());
    }

    @Test
    void adoptChildTest() throws IOException, ClassNotFoundException {
        familyService.adoptChild(familyService.getFamilyById(2),new Human());
        assertEquals(2,familyService.getFamilyById(2).getChildren().size());
    }

    @Test
    void countTest() throws IOException, ClassNotFoundException {
        assertEquals(2,familyService.count());

    }

    @Test
    void getPetsTest() throws IOException, ClassNotFoundException {
        assertFalse(familyService.getPets(2).isEmpty());
    }

    @Test
    void addPetTest() throws IOException, ClassNotFoundException {
        Pet pet = new Pet() {
            @Override
            public void respond(String nickname) {

            }
        };
        familyService.addPet(2, pet);
        assertEquals(2,familyService.getFamilyById(2).getPet().size());
    }

    @Test
    void countFamiliesByMemberNumberTest() throws IOException, ClassNotFoundException {
        assertEquals(2,familyService.countFamiliesByMemberNumber(2).size());
    }

}