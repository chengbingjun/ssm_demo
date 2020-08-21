import com.test.dao.StudentMapper;
import com.test.dao.TeacherMapper;
import com.test.dao.UserMapper;
import com.test.pojo.Student;
import com.test.pojo.Teacher;
import com.test.utils.MyBatisUtils;
import com.test.vo.StudentVo;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author cbjun
 * @create 2020/8/21 11:14
 */
@Log4j2
public class test02 {

    @Test
    public void test01() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            Teacher teacher = teacherMapper.getTeacher01(1);
            log.info(teacher);
            log.info("---------------------");
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students= studentMapper.getStudent01();
            students.forEach(e->{
                log.info(e);
            });
            log.info("---------------------");
            List<StudentVo> studentVos = studentMapper.getStudent02();
            studentVos.forEach(e->{
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
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);

            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List<StudentVo> students= studentMapper.getStudent03();
            students.forEach(e->{
                log.info(e);
            });
            Teacher teacher = teacherMapper.getTeacher02(1);
            System.out.println(teacher);
        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void test03() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            List<Teacher> teachers = teacherMapper.getTeacher03();
            log.info(teachers);
        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
            sqlSession.close();
        }

    }
}
