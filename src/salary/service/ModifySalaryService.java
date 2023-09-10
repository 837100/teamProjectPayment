package salary.service;

import java.sql.Connection;

import jdbc.connection.ConnectionProvider;
import salary.dao.SalaryDao;
import salary.model.SalaryDetail;

public class ModifySalaryService {
	private SalaryDao salaryDao = new SalaryDao();
	
	
	public void modify(ModifyRequest modReq) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			SalaryDetail = salaryDao.
		}
	}
}
