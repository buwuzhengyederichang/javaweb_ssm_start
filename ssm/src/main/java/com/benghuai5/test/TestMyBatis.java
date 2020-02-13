package com.benghuai5.test;



import com.benghuai5.dao.AccountDao;
import com.benghuai5.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {

    /**
     * 测试查询
     * @throws IOException
     */
    @Test
    public void run1() throws IOException {
        //加载配置文件
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = factory.openSession();
        //获得到代理对象
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        //查询所有数据
        List<Account> lists = dao.findAll();
        for(Account account:lists){
            System.out.println(account);
        }
        //关闭资源
        sqlSession.close();
        in.close();

    }

    /**
     * 测试保存
     * @throws IOException
     */
    @Test
    public void run2() throws IOException {
        //加载配置文件
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = factory.openSession();
        //获得到代理对象
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        //保存数据
        Account account=new Account();
        account.setName("小蜗牛");
        account.setMoney(400d);
        dao.savaAccount(account);
        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
        in.close();

    }






}
