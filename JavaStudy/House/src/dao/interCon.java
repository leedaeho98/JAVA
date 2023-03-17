package dao;

import java.util.List;

import vo.DbTest;

public interface interCon {
	// CRUD를 할 메소드 구현체
	
	int insert(DbTest db); // 여러개구현
	int delete(int DbNumber); // 하나만 조회하면 int void
	int update(DbTest db);
	DbTest getlist(int Dbnum);
	List<DbTest> list();
	
}
