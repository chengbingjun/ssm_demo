import com.cbj.pojo.Student;
import com.cbj.pojo.Teacher;
import com.cbj.pojo.User;
import com.cbj.utils.HibernateUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author cbjun
 * @create 2020/8/27 15:11
 */
@Log4j2
public class test01 {

    @Test
    public void test01() {
        Session session = HibernateUtils.getSession();
        try {
            //增删改需要开启事务
            Transaction transaction = session.beginTransaction();
            User user = new User("hibernate", "study");
            session.save(user);
            //session.update(user);
            //session.delete(user);
            //提交事务
            transaction.commit();
        } catch (Exception e) {
            log.error(e);
        } finally {
            session.close();
        }

    }

    @Test
    public void test02() {
        Session session = HibernateUtils.getSession();
        try {
            //增删改需要开启事务
            Transaction transaction = session.beginTransaction();
            User user = session.get(User.class, 1);
//            User user = session.load(User.class, 2);//使用load方法会先输出”查询数据库“，因为它是懒加载
            System.out.println("查询数据库");
            System.out.println(user);
            //提交事务
            transaction.commit();
        } catch (Exception e) {
            log.error(e);
        } finally {
            session.close();
        }
    }

    @Test
    public void manyToOne() {
        Session session = HibernateUtils.getSession();
        try {
            //多对一：多个学生对一个老师
            Student student = session.get(Student.class, 1);
            ObjectMapper mapper = new ObjectMapper();
            String jsonStr = mapper.writeValueAsString(student);
            System.out.println(jsonStr);
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
            //多对一：多个学生对一个老师
            Teacher teacher = session.get(Teacher.class, 2);
            ObjectMapper mapper = new ObjectMapper();
            String jsonStr = mapper.writeValueAsString(teacher);
            System.out.println(jsonStr);
        } catch (Exception e) {
            log.error(e);
        } finally {
            session.close();
        }
    }
}
