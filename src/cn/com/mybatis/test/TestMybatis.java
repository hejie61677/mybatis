package cn.com.mybatis.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.com.mybatis.dao.DataConnection;
import cn.com.mybatis.pojo.Category;

/**
 * <p>Title:TestMybatis</p>
 * <p>Description:测试类</p>
 * <p>Company: </p>
 * @author 何杰
 * @date 下午9:38:20
 */
public class TestMybatis {

	public static void main(String[] args)throws IOException {
		DataConnection dataConnection = new DataConnection();
        SqlSession sqlSession = dataConnection.getSqlSession();
        
        //整表查询
        List<Category> cList = sqlSession.selectList("listCategory");
        for (Category c : cList) {
            System.out.println(c.getId() + " - " + c.getName() + " - " + c.getDescription());
        }
        
        //通过id查询
        Category category = sqlSession.selectOne("findCategoryById", 1);
        System.out.println(category.getId() + " - " + category.getName() + " - " + category.getDescription());
        
        //模糊查询
        List<Category> categoryList = sqlSession.selectList("findCategoryByName", "cate");
        for (Category cate : categoryList) {
            System.out.println(cate.getId() + " - " + cate.getName() + " - " + cate.getDescription());
        }
        sqlSession.close();
	}

}
