package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


/**
 * @author Youngni
 * Dept(Entity orm) mysql->dept(table) 类表映射
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * 主键
	 */
	private Long	deptno;
	/*
	 * 部门名称
	 */
	private String	dname;
	/*
	 * 来自哪个数据库，应为微服务架构可以一个服务对应一个数据库，同一信息被存储到不同的数据库
	 */
	private String	db_source;

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Dept(String dname) {
		super();
		this.dname = dname;
	}

	public Dept(Long deptno, String dname, String db_source) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.db_source = db_source;
	}

	public Long getDeptno() {
		return deptno;
	}

	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDb_source() {
		return db_source;
	}

	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}

	
}
