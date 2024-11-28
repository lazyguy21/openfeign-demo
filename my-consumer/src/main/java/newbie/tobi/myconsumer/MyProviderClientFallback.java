package newbie.tobi.myconsumer;

import org.springframework.stereotype.Component;

/**
 * Created by @author yyf on 2024/11/27.
 */
public class MyProviderClientFallback implements MyProviderClient{

  @Override
  public String test(String msg) {
    return "我是默认的fallback策略结果";
  }

  @Override
  public String ex() {
    return "我是默认的fallback策略结果";
  }
}
