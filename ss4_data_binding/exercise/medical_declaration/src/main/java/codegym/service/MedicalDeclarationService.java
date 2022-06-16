package codegym.service;

import codegym.model.MedicalDeclaration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import codegym.repository.IMedicalDeclarationRepository;

import java.util.List;

@Service
public class MedicalDeclarationService implements IMedicalDeclarationService {
    @Autowired
    private IMedicalDeclarationRepository medicalDeclarationRepository;

    @Override
    public List<MedicalDeclaration> findAll() {
        return medicalDeclarationRepository.findAll();
    }

    @Override
    public void save(MedicalDeclaration medicalDeclaration) {
        medicalDeclarationRepository.save(medicalDeclaration);
    }

    @Override
    public List<String> birthDay() {
        return medicalDeclarationRepository.birthDay();
    }

    @Override
    public List<String> gender() {
        return medicalDeclarationRepository.gender();
    }

    @Override
    public List<String> nationality() {
        return medicalDeclarationRepository.nationality();
    }

    @Override
    public List<String> informationTravel() {
        return medicalDeclarationRepository.informationTravel();
    }

    @Override
    public List<String> departureDay() {
        return medicalDeclarationRepository.departureDay();
    }

    @Override
    public List<String> departureMonth() {
        return medicalDeclarationRepository.departureMonth();
    }

    @Override
    public List<String> departureYear() {
        return medicalDeclarationRepository.departureYear();
    }

    @Override
    public List<String> endDay() {
        return medicalDeclarationRepository.endDay();
    }

    @Override
    public List<String> endMonth() {
        return medicalDeclarationRepository.endMonth();
    }

    @Override
    public List<String> endYear() {
        return medicalDeclarationRepository.endYear();
    }


}
