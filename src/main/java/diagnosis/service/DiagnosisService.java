package diagnosis.service;



import diagnosis.model.Diagnosis;
import diagnosis.model.Patient;

import java.util.List;

public interface DiagnosisService {


    Diagnosis saveDiagnosis(Diagnosis diagnosis);

    List<Diagnosis> getDiagnosis();

    Diagnosis getDiagnosisById(long pre_id);

    Diagnosis deleteDiagnosis(long pre_id);

    Diagnosis updateDiagnosis(long pre_id,Diagnosis diagnosis);
}
