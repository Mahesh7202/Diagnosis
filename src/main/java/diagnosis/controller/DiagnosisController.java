package diagnosis.controller;

import diagnosis.service.Impl.DiagnosisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import diagnosis.model.Diagnosis;

import java.util.List;

@RestController
@RequestMapping("/diagnosis")
public class DiagnosisController {
    private DiagnosisServiceImpl diagnosisServiceImpl;

    @Autowired
    public DiagnosisController(DiagnosisServiceImpl DiagnosisServiceImpl) {
        this.diagnosisServiceImpl = diagnosisServiceImpl;
    }

    @PostMapping
    public ResponseEntity<Diagnosis> saveDiagnosis(@RequestBody final Diagnosis diagnosisDto){
        Diagnosis diagnosis = diagnosisServiceImpl.saveDiagnosis(diagnosisDto);
        return new ResponseEntity<>(diagnosis,HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity<List<Diagnosis>> getDiagnosiss(){
        List<Diagnosis> diagnosiss = diagnosisServiceImpl.getDiagnosis();
        return new ResponseEntity<>(diagnosiss, HttpStatus.OK);
    }

    @GetMapping(value = "/{diagnosis_id}")
    public ResponseEntity<Diagnosis> getDiagnosis(@PathVariable final Long diagnosis_id){
        Diagnosis diagnosis = diagnosisServiceImpl.getDiagnosisById(diagnosis_id);
        return new ResponseEntity<>(diagnosis,HttpStatus.OK);
    }

    @DeleteMapping(value = "/{diagnosis_id}")
    public ResponseEntity<Diagnosis> deleteDiagnosis(@PathVariable final Long diagnosis_id){
        Diagnosis diagnosis = diagnosisServiceImpl.deleteDiagnosis(diagnosis_id);
        return new ResponseEntity<>(diagnosis,HttpStatus.OK);
    }

    @PutMapping(value = "/{diagnosis_id}")
    public ResponseEntity<Diagnosis> updateDiagnosis(@PathVariable final Long diagnosis_id,
                                                              @RequestBody Diagnosis diagnosisDto){
        Diagnosis diagnosis_edit = diagnosisServiceImpl.updateDiagnosis(diagnosis_id,diagnosisDto);
        return new ResponseEntity<>(diagnosis_edit,HttpStatus.OK);
    }

}

