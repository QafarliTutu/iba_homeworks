package Homework11.service;

import Homework11.model.Human;
import Homework11.model.Pet;
import Homework11.model.Species;
import Homework11.service.FamilyService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {
    private FamilyService familyService = new FamilyService();

    @Test
    public void TestOfGetAllFamilies(){
        assertEquals(3,familyService.getAllFamilies().size());
    }

    @Test
    void TestOfGetFamiliesBiggerThan() {
        assertFalse(familyService.getFamiliesBiggerThan(3).isEmpty());
    }

    @Test
    void TestOfGetFamiliesLessThan() {
        assertFalse(familyService.getFamiliesLessThan(3).isEmpty());
    }

    @Test
    void TestOfCountFamiliesWithMemberNumber() {
        assertFalse(familyService.countFamiliesWithMemberNumber().isEmpty());
    }

    @Test
    void TestOfCreateNewFamily() {
        Human woman = new Human();
        Human man = new Human();
        familyService.createNewFamily(woman,man);
        assertEquals(4,familyService.count());
    }

    @Test
    void TestOfDeleteFamilyByIndex() {
        familyService.deleteFamilyByIndex(2);
        assertEquals(2,familyService.count());
    }

    @Test
    void TestOfBornChild() {
        assertTrue(familyService.getAllFamilies().contains(familyService.bornChild(familyService.getFamilyById(2),"masculine")));
    }

    @Test
    void TestOfAdoptChild() {
        Human child = new Human();
        assertTrue(familyService.getAllFamilies().contains(familyService.adoptChild(familyService.getFamilyById(2),child)));
    }

    @Test
    void TestOfDeleteAllChildrenOlderThan() {
        familyService.deleteAllChildrenOlderThan(18);
        assertEquals(2,familyService.getFamilyById(0).getChildren().size());
    }

    @Test
    void TestOfCount() {
        assertEquals(3,familyService.count());
    }

    @Test
    void TestOfGetFamilyById() {
        assertTrue(familyService.getAllFamilies().contains(familyService.getFamilyById(0)));
    }

    @Test
    void TestOfGetPets() {
        assertFalse(familyService.getFamilyById(2).getPets().isEmpty());
    }

    @Test
    void TestOfAddPet() {
        Pet pet = new Pet(Species.RoboCat, "Rocky") {
            @Override
            public void respond(String nickname) {

            }
        };
        familyService.addPet(1,pet);
        assertFalse(familyService.getFamilyById(1).getPets().isEmpty());
    }
}