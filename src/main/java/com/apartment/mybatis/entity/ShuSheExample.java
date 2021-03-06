package com.apartment.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class ShuSheExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	public ShuSheExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andSusheNameIsNull() {
			addCriterion("sushe_name is null");
			return (Criteria) this;
		}

		public Criteria andSusheNameIsNotNull() {
			addCriterion("sushe_name is not null");
			return (Criteria) this;
		}

		public Criteria andSusheNameEqualTo(String value) {
			addCriterion("sushe_name =", value, "susheName");
			return (Criteria) this;
		}

		public Criteria andSusheNameNotEqualTo(String value) {
			addCriterion("sushe_name <>", value, "susheName");
			return (Criteria) this;
		}

		public Criteria andSusheNameGreaterThan(String value) {
			addCriterion("sushe_name >", value, "susheName");
			return (Criteria) this;
		}

		public Criteria andSusheNameGreaterThanOrEqualTo(String value) {
			addCriterion("sushe_name >=", value, "susheName");
			return (Criteria) this;
		}

		public Criteria andSusheNameLessThan(String value) {
			addCriterion("sushe_name <", value, "susheName");
			return (Criteria) this;
		}

		public Criteria andSusheNameLessThanOrEqualTo(String value) {
			addCriterion("sushe_name <=", value, "susheName");
			return (Criteria) this;
		}

		public Criteria andSusheNameLike(String value) {
			addCriterion("sushe_name like", value, "susheName");
			return (Criteria) this;
		}

		public Criteria andSusheNameNotLike(String value) {
			addCriterion("sushe_name not like", value, "susheName");
			return (Criteria) this;
		}

		public Criteria andSusheNameIn(List<String> values) {
			addCriterion("sushe_name in", values, "susheName");
			return (Criteria) this;
		}

		public Criteria andSusheNameNotIn(List<String> values) {
			addCriterion("sushe_name not in", values, "susheName");
			return (Criteria) this;
		}

		public Criteria andSusheNameBetween(String value1, String value2) {
			addCriterion("sushe_name between", value1, value2, "susheName");
			return (Criteria) this;
		}

		public Criteria andSusheNameNotBetween(String value1, String value2) {
			addCriterion("sushe_name not between", value1, value2, "susheName");
			return (Criteria) this;
		}

		public Criteria andApartmentNumIsNull() {
			addCriterion("apartment_num is null");
			return (Criteria) this;
		}

		public Criteria andApartmentNumIsNotNull() {
			addCriterion("apartment_num is not null");
			return (Criteria) this;
		}

		public Criteria andApartmentNumEqualTo(Integer value) {
			addCriterion("apartment_num =", value, "apartmentNum");
			return (Criteria) this;
		}

		public Criteria andApartmentNumNotEqualTo(Integer value) {
			addCriterion("apartment_num <>", value, "apartmentNum");
			return (Criteria) this;
		}

		public Criteria andApartmentNumGreaterThan(Integer value) {
			addCriterion("apartment_num >", value, "apartmentNum");
			return (Criteria) this;
		}

		public Criteria andApartmentNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("apartment_num >=", value, "apartmentNum");
			return (Criteria) this;
		}

		public Criteria andApartmentNumLessThan(Integer value) {
			addCriterion("apartment_num <", value, "apartmentNum");
			return (Criteria) this;
		}

		public Criteria andApartmentNumLessThanOrEqualTo(Integer value) {
			addCriterion("apartment_num <=", value, "apartmentNum");
			return (Criteria) this;
		}

		public Criteria andApartmentNumIn(List<Integer> values) {
			addCriterion("apartment_num in", values, "apartmentNum");
			return (Criteria) this;
		}

		public Criteria andApartmentNumNotIn(List<Integer> values) {
			addCriterion("apartment_num not in", values, "apartmentNum");
			return (Criteria) this;
		}

		public Criteria andApartmentNumBetween(Integer value1, Integer value2) {
			addCriterion("apartment_num between", value1, value2,
					"apartmentNum");
			return (Criteria) this;
		}

		public Criteria andApartmentNumNotBetween(Integer value1, Integer value2) {
			addCriterion("apartment_num not between", value1, value2,
					"apartmentNum");
			return (Criteria) this;
		}

		public Criteria andSushePeopleNumIsNull() {
			addCriterion("sushe_people_num is null");
			return (Criteria) this;
		}

		public Criteria andSushePeopleNumIsNotNull() {
			addCriterion("sushe_people_num is not null");
			return (Criteria) this;
		}

		public Criteria andSushePeopleNumEqualTo(Integer value) {
			addCriterion("sushe_people_num =", value, "sushePeopleNum");
			return (Criteria) this;
		}

		public Criteria andSushePeopleNumNotEqualTo(Integer value) {
			addCriterion("sushe_people_num <>", value, "sushePeopleNum");
			return (Criteria) this;
		}

		public Criteria andSushePeopleNumGreaterThan(Integer value) {
			addCriterion("sushe_people_num >", value, "sushePeopleNum");
			return (Criteria) this;
		}

		public Criteria andSushePeopleNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("sushe_people_num >=", value, "sushePeopleNum");
			return (Criteria) this;
		}

		public Criteria andSushePeopleNumLessThan(Integer value) {
			addCriterion("sushe_people_num <", value, "sushePeopleNum");
			return (Criteria) this;
		}

		public Criteria andSushePeopleNumLessThanOrEqualTo(Integer value) {
			addCriterion("sushe_people_num <=", value, "sushePeopleNum");
			return (Criteria) this;
		}

		public Criteria andSushePeopleNumIn(List<Integer> values) {
			addCriterion("sushe_people_num in", values, "sushePeopleNum");
			return (Criteria) this;
		}

		public Criteria andSushePeopleNumNotIn(List<Integer> values) {
			addCriterion("sushe_people_num not in", values, "sushePeopleNum");
			return (Criteria) this;
		}

		public Criteria andSushePeopleNumBetween(Integer value1, Integer value2) {
			addCriterion("sushe_people_num between", value1, value2,
					"sushePeopleNum");
			return (Criteria) this;
		}

		public Criteria andSushePeopleNumNotBetween(Integer value1,
				Integer value2) {
			addCriterion("sushe_people_num not between", value1, value2,
					"sushePeopleNum");
			return (Criteria) this;
		}

		public Criteria andIsdeleteIsNull() {
			addCriterion("isdelete is null");
			return (Criteria) this;
		}

		public Criteria andIsdeleteIsNotNull() {
			addCriterion("isdelete is not null");
			return (Criteria) this;
		}

		public Criteria andIsdeleteEqualTo(Integer value) {
			addCriterion("isdelete =", value, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteNotEqualTo(Integer value) {
			addCriterion("isdelete <>", value, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteGreaterThan(Integer value) {
			addCriterion("isdelete >", value, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
			addCriterion("isdelete >=", value, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteLessThan(Integer value) {
			addCriterion("isdelete <", value, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
			addCriterion("isdelete <=", value, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteIn(List<Integer> values) {
			addCriterion("isdelete in", values, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteNotIn(List<Integer> values) {
			addCriterion("isdelete not in", values, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
			addCriterion("isdelete between", value1, value2, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
			addCriterion("isdelete not between", value1, value2, "isdelete");
			return (Criteria) this;
		}

		public Criteria andSurplusPeopleNumIsNull() {
			addCriterion("surplus_people_num is null");
			return (Criteria) this;
		}

		public Criteria andSurplusPeopleNumIsNotNull() {
			addCriterion("surplus_people_num is not null");
			return (Criteria) this;
		}

		public Criteria andSurplusPeopleNumEqualTo(Integer value) {
			addCriterion("surplus_people_num =", value, "surplusPeopleNum");
			return (Criteria) this;
		}

		public Criteria andSurplusPeopleNumNotEqualTo(Integer value) {
			addCriterion("surplus_people_num <>", value, "surplusPeopleNum");
			return (Criteria) this;
		}

		public Criteria andSurplusPeopleNumGreaterThan(Integer value) {
			addCriterion("surplus_people_num >", value, "surplusPeopleNum");
			return (Criteria) this;
		}

		public Criteria andSurplusPeopleNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("surplus_people_num >=", value, "surplusPeopleNum");
			return (Criteria) this;
		}

		public Criteria andSurplusPeopleNumLessThan(Integer value) {
			addCriterion("surplus_people_num <", value, "surplusPeopleNum");
			return (Criteria) this;
		}

		public Criteria andSurplusPeopleNumLessThanOrEqualTo(Integer value) {
			addCriterion("surplus_people_num <=", value, "surplusPeopleNum");
			return (Criteria) this;
		}

		public Criteria andSurplusPeopleNumIn(List<Integer> values) {
			addCriterion("surplus_people_num in", values, "surplusPeopleNum");
			return (Criteria) this;
		}

		public Criteria andSurplusPeopleNumNotIn(List<Integer> values) {
			addCriterion("surplus_people_num not in", values,
					"surplusPeopleNum");
			return (Criteria) this;
		}

		public Criteria andSurplusPeopleNumBetween(Integer value1,
				Integer value2) {
			addCriterion("surplus_people_num between", value1, value2,
					"surplusPeopleNum");
			return (Criteria) this;
		}

		public Criteria andSurplusPeopleNumNotBetween(Integer value1,
				Integer value2) {
			addCriterion("surplus_people_num not between", value1, value2,
					"surplusPeopleNum");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sushe
	 * @mbggenerated  Thu Dec 10 17:31:36 GMT+08:00 2015
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sushe
     *
     * @mbggenerated do_not_delete_during_merge Thu Dec 10 15:58:46 GMT+08:00 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}