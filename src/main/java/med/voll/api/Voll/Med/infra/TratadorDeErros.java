package med.voll.api.Voll.Med.infra;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorDeErros {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tratarError404(){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity tratarError400(MethodArgumentNotValidException exception){
        var error = exception.getFieldErrors();
        return ResponseEntity.badRequest().body(error.stream().map(DadosErrosValidacao::new).toList());
    }

    private record DadosErrosValidacao(String campo,String mensagem){
        public DadosErrosValidacao(FieldError error){
            this(error.getField(), error.getDefaultMessage());
        }
    }
}
