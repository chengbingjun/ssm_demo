import com.test.dao.UserMapper;
import com.test.pojo.User;
import com.test.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author cbjun
 * @create 2020/8/17 15:35
 */
public class test01 {

    @Test
    public void test01(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findUser();
        User user01 = userMapper.getUserById(1);
        System.out.println(user01);
        for(User user : users){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
