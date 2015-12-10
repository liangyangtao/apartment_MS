package com.apartment.mybatis.mapper;

import com.apartment.mybatis.entity.Student;
import com.apartment.mybatis.entity.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	int countByExample(StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	int deleteByExample(StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	int insert(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	int insertSelective(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	List<Student> selectByExample(StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	Student selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	int updateByExampleSelective(@Param("record") Student record,
			@Param("example") StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	int updateByExample(@Param("record") Student record,
			@Param("example") StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	int updateByPrimaryKeySelective(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	int updateByPrimaryKey(Student record);
}