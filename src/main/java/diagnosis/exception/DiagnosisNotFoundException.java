package diagnosis.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.text.MessageFormat;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DiagnosisNotFoundException extends RuntimeException{

    public DiagnosisNotFoundException(Long p_id){
        super(MessageFormat.format("could not find patient with id:{0}",p_id));
    }

}
