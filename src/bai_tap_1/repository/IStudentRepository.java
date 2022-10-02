package bai_tap_1.repository;

import bai_tap_1.model.Student;

import java.util.List;

public interface IStudentRepository {
    String FILE_NAME="src/bai_tap_1/data/data.dat";
    void add(Student student);
    List<Student>getAll();

}
