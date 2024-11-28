package newbie.tobi.myconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created by @author yyf on 2024/11/27.
 */
@Component
public class MyProviderClientFallbackFactory<MyProviderClientFallbackFactory> implements FallbackFactory {

  Logger log = LoggerFactory.getLogger(this.getClass());

  @Override
  public MyProviderClientFallback create(Throwable cause) {
    log.error("error :", cause);
    MyProviderClientFallback myProviderClientFallback = new MyProviderClientFallback();
    return myProviderClientFallback;
  }
}
