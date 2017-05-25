package org.dimigo.interfaces;

public interface IDBManager {

	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	public static IDBManager getDBObject (String datebase){
		IDBManager DB = null;
		
		if(datebase.equals(ORACLE_DATABASE)){
			DB = new OracleDB();
		}else if(datebase.equals(SYBASE_DATABASE)){
			DB = new SybaseDB();
		}
		return DB;
	}
	
}
