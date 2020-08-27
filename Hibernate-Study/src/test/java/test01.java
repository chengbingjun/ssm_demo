import com.cbj.pojo.User;
import com.cbj.utils.HibernateUtils;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * @Author cbjun
 * @create 2020/8/27 15:11
 */
@Log4j2
public class test01 {

    @Test
    public void test01(){
        Session session = HibernateUtils.getSession();
        try{
            //增删改需要开启事务
            Transaction transaction = session.beginTransaction();
            User user = new User("hibernate","study");
            session.save(user);
            //提交事务
            transaction.commit();
        }catch (Exception e){
            log.error(e);
        }finally {
            session.close();
        }

    }
}
