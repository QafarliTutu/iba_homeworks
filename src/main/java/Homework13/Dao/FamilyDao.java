package Homework13.Dao;

import Homework13.model.Family;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface FamilyDao {
    boolean downloadData(List<Family> families) throws IOException;
    void createNewFam() throws IOException;
    List<Family> getAllFamilies() throws IOException, ClassNotFoundException;
    Optional<Family> getFamilyById(int id) throws IOException, ClassNotFoundException;
    boolean deleteFamily(int id) throws IOException, ClassNotFoundException;
    boolean deleteFamily(Family family) throws IOException, ClassNotFoundException;
}
