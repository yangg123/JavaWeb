/**
 * Created by Administrator on 2017/8/17.
 */


import com.render.webservice.WebServiceImpl;
import com.render.webservice.WebServiceImplService;

/**
 * @author gacl
 * 调用WebService的客户端
 */
public class WSClient {

    public static void main(String[] args) {
        //创建一个用于产生WebServiceImpl实例的工厂，WebServiceImplService类是wsimport工具生成的
        WebServiceImplService factory = new WebServiceImplService();
        //通过工厂生成一个WebServiceImpl实例，WebServiceImpl是wsimport工具生成的
        WebServiceImpl wsImpl = factory.getWebServiceImplPort();
        //调用WebService的sayHello方法
        String resResult = wsImpl.sayHello("孤傲苍狼");
        System.out.println("调用WebService的sayHello方法返回的结果是：" + resResult);
        System.out.println("---------------------------------------------------");
        //调用WebService的save方法
        resResult = wsImpl.save("孤傲苍狼", "123");
        System.out.println("调用WebService的save方法返回的结果是：" + resResult);
    }
}