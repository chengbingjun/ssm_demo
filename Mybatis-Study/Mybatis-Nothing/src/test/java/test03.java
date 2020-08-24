import com.test.dao.BlogMapper;
import com.test.pojo.Blog;
import com.test.utils.MyBatisUtils;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author cbjun
 * @create 2020/8/24 11:18
 */
@Log4j2
public class test03 {

    @Test
    public void test01() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            Map map = new HashMap();
            map.put("title","mybatis学习");
            DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = fmt.parse("2020-07-27 10:48:56");
            map.put("createTime", date);
            List<Blog> blogs = blogMapper.getBlogByIF(map);
            blogs.forEach(e -> {
                log.info(e);
            });
        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void test02() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            Map map = new HashMap();
//            map.put("title","mybatis学习");
            map.put("author","李四");
            List<Blog> blogs = blogMapper.getBlogByChoose(map);
            blogs.forEach(e -> {
                log.info(e);
            });
        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
            sqlSession.close();
        }

    }
}
