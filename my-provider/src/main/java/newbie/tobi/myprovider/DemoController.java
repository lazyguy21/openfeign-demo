package newbie.tobi.myprovider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by @author yyf on 2024/11/27.
 */
@RestController
public class DemoController {

  @GetMapping("/echo")
  public String test(String msg) {
    System.out.println("i get:" + msg);
    return "echo:" + msg;
  }


  @GetMapping("/ex")
  public String ex() {
    throw new RuntimeException("我是provider抛出的异常");
  }
}
