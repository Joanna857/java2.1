package TS;

import org.springframework.jdbc.core.JdbcTemplate;

public class prctice3 {
private static void update() {
	JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
	/*String sql = "insert into person(name,username,password,age,about,height) values (?,?,?,?,?,?)";
	int update = jt.update(sql,"奥恩","aoen","123456",20,"太肉了",188.0);
	int update1 = jt.update(sql,"青钢影","qg","123456",20,"战士类",188.0);
	int update2 = jt.update(sql,"滕尚","ts","123456",20,"山东",167.0);
	int update3 = jt.update(sql,"东皇","dh","123456",18,"法坦",188.0);
	int update4 = jt.update(sql,"张飞","zf","123456",19,"辅助",188.0);
	System.out.println(update);
	System.out.println(update1);
	System.out.println(update2);
	System.out.println(update3);
	System.out.println(update4);*/
	int update = jt.update("update person set age = ?,username = ?","18","aoen");
	System.out.println(update);
}
	public static void main(String[] args) {
       update();
	}

}
