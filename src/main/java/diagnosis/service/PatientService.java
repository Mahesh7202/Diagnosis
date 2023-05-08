package diagnosis.service;

import diagnosis.model.Patient;

import java.util.List;

public interface PatientService {

    Patient savePatient(Patient patient);

    Patient savePatientWith(Patient patient);
    Patient savePatientWithDiagnosis(Patient patient);

    List<Patient> getPatient();

    Patient getPatientById(long p_id);

    Patient deletePatient(long p_id);

    Patient updatePatient(long p_id,Patient patient);

    Patient saveDiagnosisToPatient(long p_id,long pre_id);

    Patient getDiagnosisFromPatient(long p_id,long pre_id);

    Patient deleteDiagnosisFromPatient(long p_id,long pre_id);
}
