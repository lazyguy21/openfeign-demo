package newbie.tobi.myconsumer.student;

import newbie.tobi.myprovider.api.StudentAPI;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by @author yyf on 2024/11/28.
 */
@FeignClient(name = "my-provider",contextId="studentAPI", url = "http://localhost:8888")
public interface StudentClient  extends StudentAPI {

}
