package newbie.tobi.myprovider;

import java.time.LocalDateTime;
import newbie.tobi.myprovider.api.StudentAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by @author yyf on 2024/11/28.
 */
@RestController
public class StudentController implements StudentAPI {
  public String getStudent() {
    return "student:"+ LocalDateTime.now();
  }
}
