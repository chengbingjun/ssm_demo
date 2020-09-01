import com.alibaba.fastjson.JSONArray;
import com.cbj.pojo.Customer;
import com.cbj.pojo.Orders;
import com.cbj.utils.HibernateUtils;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.junit.Test;


/**
 * @Author cbjun
 * @create 2020/9/1 11:28
 */
@Log4j2
public class test02 {

    @Test
    public void manyToOne() {
        Session session = HibernateUtils.getSession();
        try {
            Orders orders = session.get(Orders.class, 1);
            System.out.println(JSONArray.toJSON(orders).toString());
        } catch (Exception e) {
            log.error(e);
        } finally {
            session.close();
        }
    }

    @Test
    public void oneToMany() {
        Session session = HibernateUtils.getSession();
        try {
            Customer customer = session.get(Customer.class, 1);
            System.out.println(JSONArray.toJSON(customer).toString());
            System.out.println();
        } catch (Exception e) {
            log.error(e);
        } finally {
            session.close();
        }
    }
}
