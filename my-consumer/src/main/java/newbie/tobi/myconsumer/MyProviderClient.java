package newbie.tobi.myconsumer;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by @author yyf on 2024/11/27.
 */
//@FeignClient(name = "my-provider", url = "http://localhost:8888", fallback=MyProviderClientFallback.class)
//@FeignClient(name = "my-provider", url = "http://localhost:8888",fallbackFactory = MyProviderClientFallbackFactory.class)
@FeignClient(name = "my-provider",contextId = "echo",url = "http://localhost:8888",fallbackFactory = MyProviderClientFallbackFactory.class)
public interface MyProviderClient {

  @GetMapping("/echo")
  public String test(@RequestParam("msg") String msg);


  @GetMapping("/ex")
  public String ex();
}
