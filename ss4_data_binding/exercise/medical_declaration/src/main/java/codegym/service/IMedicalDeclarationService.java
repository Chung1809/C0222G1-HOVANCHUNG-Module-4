package codegym.service;

import codegym.model.MedicalDeclaration;

import java.util.List;

public interface IMedicalDeclarationService {
    List<MedicalDeclaration> findAll();

    void save(MedicalDeclaration medicalDeclaration);

    List<String> birthDay();

    List<String> gender();

    List<String> nationality();

    List<String> informationTravel();

    List<String> departureDay();

    List<String> departureMonth();

    List<String> departureYear();

    List<String> endDay();

    List<String> endMonth();

    List<String> endYear();
}
