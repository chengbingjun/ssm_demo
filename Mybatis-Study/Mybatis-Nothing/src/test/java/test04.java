import com.test.dao.DeptMapper;
import com.test.dao.UserMapper;
import com.test.pojo.Dept;
import com.test.pojo.Page;
import com.test.pojo.User;
import com.test.utils.MyBatisUtils;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author cbjun
 * @create 2020/8/17 15:35
 */
@Log4j2
public class test04 {
    /**
     * 下面方法可以看到两个sqlSession中都查了相同的用户，但是只执行了一次sql，说明有二级缓存（mapper级别的）
     * 但是需要注意，一定是要等sqlSession1关闭或提交以后，它里面的一级缓存数据才会放到二级缓存中，没关闭或提交则不行。
     */
    @Test
    public void test01() {
        SqlSession sqlSession1 = MyBatisUtils.getSqlSession();

        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);

        User user01 = userMapper1.getUserById(1);
        System.out.println(user01);

        sqlSession1.close();

        SqlSession sqlSession2 = MyBatisUtils.getSqlSession();

        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);

        User user02 = userMapper2.getUserById(1);
        System.out.println(user02);

        sqlSession2.close();

    }
}
