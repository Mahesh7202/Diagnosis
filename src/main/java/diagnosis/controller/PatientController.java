package diagnosis.controller;


import diagnosis.model.Patient;
import diagnosis.service.Impl.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/patient")
public class PatientController {

    private final PatientServiceImpl patientServiceImpl;

    @Autowired
    public PatientController(PatientServiceImpl patientServiceImpl) {
        this.patientServiceImpl = patientServiceImpl;
    }

    @PostMapping
    public ResponseEntity<Patient> savePatient(@RequestBody final Patient patient){
        Patient patient_save = patientServiceImpl.savePatient(patient);
        return new ResponseEntity<>(patient_save, HttpStatus.OK);
    }

    @PostMapping("/diagnosis")
    public ResponseEntity<Patient> savePatientWithDiagnosis(@RequestBody final Patient patient){
        Patient patient1 = patientServiceImpl.savePatientWithDiagnosis(patient);
        return new ResponseEntity<>(patient1, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Patient>> getPatients(){
        List<Patient> patients = patientServiceImpl.getPatient();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }

    @GetMapping(value = "/{patient_id}")
    public ResponseEntity<Patient> getPatient(@PathVariable final Long patient_id){
        Patient patient = patientServiceImpl.getPatientById(patient_id);
        return new ResponseEntity<>(patient,HttpStatus.OK);
    }


    @PutMapping(value = "/{patient_id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable final Long patient_id,
                                                              @RequestBody final Patient patientDto){
        Patient patient_edit = patientServiceImpl.updatePatient(patient_id,
                patientDto);
        return new ResponseEntity<>(patient_edit,HttpStatus.OK);
    }

    @DeleteMapping(value = "/{patient_id}")
    public ResponseEntity<Patient> deletePatient(@PathVariable final Long patient_id){
        Patient patient = patientServiceImpl.deletePatient(patient_id);
        return new ResponseEntity<>(patient,HttpStatus.OK);
    }



    @PostMapping(value = "/{patient_id}/diagnosis/{diagnosis_id}")
    public ResponseEntity<Patient> saveDiagnosisToPatient(@PathVariable final Long patient_id,
                                                                @PathVariable final Long diagnosis_id){

        Patient patient = patientServiceImpl.saveDiagnosisToPatient(patient_id, diagnosis_id);
        return new ResponseEntity<>(patient,HttpStatus.OK);
    }

    @DeleteMapping(value = "/{patient_id}/diagnosis/{diagnosis_id}")
    public ResponseEntity<Patient> deleteDiagnosisToPatient(@PathVariable final Long patient_id,
                                                                @PathVariable final Long diagnosis_id){

        Patient patient = patientServiceImpl.deleteDiagnosisFromPatient(patient_id, diagnosis_id);
        return new ResponseEntity<>(patient,HttpStatus.OK);
    }

    @GetMapping(value = "/{patient_id}/diagnosis/{diagnosis_id}")
    public ResponseEntity<Patient> getDiagnosisFromPatient(@PathVariable final Long patient_id,
                                                                  @PathVariable final Long diagnosis_id){

        Patient patient = patientServiceImpl.getDiagnosisFromPatient(patient_id, diagnosis_id);
        return new ResponseEntity<>(patient,HttpStatus.OK);
    }



}
