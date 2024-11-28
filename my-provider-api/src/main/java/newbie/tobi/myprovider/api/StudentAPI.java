package newbie.tobi.myprovider.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by @author yyf on 2024/11/28.
 */
@RequestMapping("/student")
public interface StudentAPI {

  @GetMapping("/check")
  String getStudent();

}
