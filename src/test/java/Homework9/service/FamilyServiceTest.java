package Homework9.service;
import Homework9.controller.FamilyController;
import Homework9.model.Human;
import Homework9.model.Family;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class FamilyServiceTest {
    private FamilyService familyService=new FamilyService();

    @Test
    public void TestOfGetAllFamilies(){
        assertEquals(1,familyService.getAllFamilies().size());
    }

    @Test
    void displayAllFamilies() {
    }

    @Test
    void getFamiliesBiggerThan() {
    }

    @Test
    void getFamiliesLessThan() {
    }

    @Test
    void countFamiliesWithMemberNumber() {
    }

    @Test
    void createNewFamily() {
    }

    @Test
    void deleteFamilyByIndex() {
    }

    @Test
    void bornChild() {
    }

    @Test
    void adoptChild() {
    }

    @Test
    void deleteAllChildrenOlderThan() {
    }

    @Test
    void count() {
    }

    @Test
    void getFamilyById() {
    }

    @Test
    void getPets() {
    }

    @Test
    void addPet() {
    }
}