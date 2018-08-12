package manager;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbw.dto.TbItem;
import com.cbw.mappers.TbItemMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class TestPageHelper {
	
	
	@Test
	public void testPageHelper() {
		// 创建一个spring容器
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从spring容器中获取mapper代理对象
		TbItemMapper mapper = context.getBean(TbItemMapper.class);
		// 执行查询并分页,TbItemExample是逆向工程自动生成的，用来进行条件查询，这里不设置则表示无条件

		// 分页处理，显示第一页的10条数据
		PageHelper.startPage(1, 10);
		List<TbItem> list = mapper.queryList(null);// 查询
		// 取商品列表
		for (TbItem item : list) {
			System.out.println(item.getTitle());
		}
		// 取分页信息
		PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(list);
		long total = pageInfo.getTotal(); // 获取总记录数
		System.out.println("共有商品信息：" + total);
	}

	

}
