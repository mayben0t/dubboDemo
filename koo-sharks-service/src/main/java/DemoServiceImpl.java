import com.alibaba.dubbo.rpc.RpcContext;
import service.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: koolearn
 * @description:
 * @author: WangX
 * @create: 2019-05-07 23:00
 **/
public class DemoServiceImpl implements DemoService {
    public String zz(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }
}
