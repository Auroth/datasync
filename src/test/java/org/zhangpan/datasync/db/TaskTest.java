package org.zhangpan.datasync.db;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TaskTest {
	DBConnection dbConn = null;

	@Before
	public void setUp() {
		System.out.println("dbConn");
		dbConn = new DBConnection();
	}

	@After
	public void tearDown() {
		dbConn.closeConn();

	}

	/************ 测试插入记录 ***************/

	@Test
	public void testinsert() {
		TaskDAO taskdao = new TaskDAOImpl(new OptTemplate());
		for (int i = 0; i < 20; i++) {
			Task u = new Task();
			u.setDstPath("/abc");
			u.setSrcPath("/abc");
			u.setEventType("add");
/*
			boolean b = taskdao.insert(u);
			if (b == false) {
				System.out.println("插入失败");
			} else {
				System.out.println("插入成功");
			}
	*/
		}

	}

	/********* 查询全部记录结果集为泛型 ************/
	@Test
	public void testqueryAll() {
		TaskDAO taskdao = new TaskDAOImpl(new OptTemplate());
		List<Task> list = taskdao.query();
		for (Task u : list) {
			System.out.println(u);
		}
	}


}
