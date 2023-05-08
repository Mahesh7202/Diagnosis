package diagnosis.service.Impl;

import diagnosis.model.Patient;
import diagnosis.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Override
    public Patient savePatient(Patient patient) {
        return null;
    }

    @Override
    public Patient savePatientWith(Patient patient) {
        return null;
    }

    @Override
    public Patient savePatientWithDiagnosis(Patient patient) {
        return null;
    }

    @Override
    public List<Patient> getPatient() {
        return null;
    }

    @Override
    public Patient getPatientById(long p_id) {
        return null;
    }

    @Override
    public Patient deletePatient(long p_id) {
        return null;
    }

    @Override
    public Patient updatePatient(long p_id, Patient patient) {
        return null;
    }

    @Override
    public Patient saveDiagnosisToPatient(long p_id, long pre_id) {
        return null;
    }

    @Override
    public Patient getDiagnosisFromPatient(long p_id, long pre_id) {
        return null;
    }

    @Override
    public Patient deleteDiagnosisFromPatient(long p_id, long pre_id) {
        return null;
    }
}
