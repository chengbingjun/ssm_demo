import com.test.dao.UserMapper;
import com.test.pojo.User;
import com.test.utils.MyBatisUtils;
import lombok.extern.java.Log;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author cbjun
 * @create 2020/8/17 15:35
 */
@Log
public class test01 {

    @Test
    public void test01() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = userMapper.findUser();
            User user01 = userMapper.getUserById(1);
            System.out.println(user01);
            users.forEach(e -> {
                System.out.println(e);
            });
        } catch (Exception e) {
            log.info(e.getMessage());
        } finally {
            sqlSession.close();
        }

    }

    @Test
    //增删改需要提交事务
    public void test02(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.addUser(new User("王五","87713551"));
            //提交事务
            sqlSession.commit();
        } catch (Exception e) {
            log.info(e.getMessage());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test03(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserById(3);
            user.setName("王虎");
            user.setPassword("王虎666");
            userMapper.updateUser(user);
            userMapper.deleteUser(1);
            //提交事务
            sqlSession.commit();
        } catch (Exception e) {
            log.info(e.getMessage());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test04(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Map<String,Object> map  = new HashMap<String, Object>();
            map.put("name","周建国");
            map.put("password","I love China");
            userMapper.addUserByMap(map);
            //提交事务
            sqlSession.commit();
        } catch (Exception e) {
            log.info(e.getMessage());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test05(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = userMapper.findUserByNameLike("%"+"王"+"%");
            users.forEach(e->{
                System.out.println(e);
            });
        } catch (Exception e) {
            log.info(e.getMessage());
        } finally {
            sqlSession.close();
        }
    }
}
