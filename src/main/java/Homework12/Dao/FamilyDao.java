package Homework12.Dao;

import Homework12.model.Family;

import java.util.List;
import java.util.Optional;

public interface FamilyDao {
    void createNewFam();
    List<Family> getAllFamilies();
    Optional<Family> getFamilyById(int id);
    boolean deleteFamily(int id);
    boolean deleteFamily(Family family);




}
