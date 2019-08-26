package test;

import dao.DeptDao;

public class Test09_DeptDao {
	public static void main(String[] args) {
		DeptDao dao = new DeptDao();
		
		dao.getAllDeptRec().forEach(i->System.out.println(i));
        System.out.println("---------------------");
        dao.getAllDeptRec(2, 4).forEach(i->System.out.println(i));
	}
}
