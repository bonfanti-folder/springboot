package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class LoginController {

        @PostMapping("/login")
        public ResponseEntity<?> login(@RequestBody Login input) {
            if (input.getId().equals(1234) && input.getPassword().equals("1234")) {
                return ResponseEntity.noContent().header("bearer", "nqghr23iotg8290hi").build();
            } else {
                throw new LoginFailException();
            }
        }

        @ExceptionHandler
        void handleLoginFailException(LoginFailException e, HttpServletResponse response) throws IOException {
            response.sendError(HttpStatus.UNAUTHORIZED.value());
        }
}