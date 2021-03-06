package com.springboot.forum.entity;

import java.util.ArrayList;
import java.util.List;

public class ClientExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    public ClientExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andClientidIsNull() {
            addCriterion("clientid is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("clientid is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(Integer value) {
            addCriterion("clientid =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(Integer value) {
            addCriterion("clientid <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(Integer value) {
            addCriterion("clientid >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientid >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(Integer value) {
            addCriterion("clientid <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(Integer value) {
            addCriterion("clientid <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<Integer> values) {
            addCriterion("clientid in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<Integer> values) {
            addCriterion("clientid not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(Integer value1, Integer value2) {
            addCriterion("clientid between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(Integer value1, Integer value2) {
            addCriterion("clientid not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNull() {
            addCriterion("clientname is null");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNotNull() {
            addCriterion("clientname is not null");
            return (Criteria) this;
        }

        public Criteria andClientnameEqualTo(String value) {
            addCriterion("clientname =", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotEqualTo(String value) {
            addCriterion("clientname <>", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThan(String value) {
            addCriterion("clientname >", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("clientname >=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThan(String value) {
            addCriterion("clientname <", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThanOrEqualTo(String value) {
            addCriterion("clientname <=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLike(String value) {
            addCriterion("clientname like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotLike(String value) {
            addCriterion("clientname not like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameIn(List<String> values) {
            addCriterion("clientname in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotIn(List<String> values) {
            addCriterion("clientname not in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameBetween(String value1, String value2) {
            addCriterion("clientname between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotBetween(String value1, String value2) {
            addCriterion("clientname not between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientpwdIsNull() {
            addCriterion("clientpwd is null");
            return (Criteria) this;
        }

        public Criteria andClientpwdIsNotNull() {
            addCriterion("clientpwd is not null");
            return (Criteria) this;
        }

        public Criteria andClientpwdEqualTo(String value) {
            addCriterion("clientpwd =", value, "clientpwd");
            return (Criteria) this;
        }

        public Criteria andClientpwdNotEqualTo(String value) {
            addCriterion("clientpwd <>", value, "clientpwd");
            return (Criteria) this;
        }

        public Criteria andClientpwdGreaterThan(String value) {
            addCriterion("clientpwd >", value, "clientpwd");
            return (Criteria) this;
        }

        public Criteria andClientpwdGreaterThanOrEqualTo(String value) {
            addCriterion("clientpwd >=", value, "clientpwd");
            return (Criteria) this;
        }

        public Criteria andClientpwdLessThan(String value) {
            addCriterion("clientpwd <", value, "clientpwd");
            return (Criteria) this;
        }

        public Criteria andClientpwdLessThanOrEqualTo(String value) {
            addCriterion("clientpwd <=", value, "clientpwd");
            return (Criteria) this;
        }

        public Criteria andClientpwdLike(String value) {
            addCriterion("clientpwd like", value, "clientpwd");
            return (Criteria) this;
        }

        public Criteria andClientpwdNotLike(String value) {
            addCriterion("clientpwd not like", value, "clientpwd");
            return (Criteria) this;
        }

        public Criteria andClientpwdIn(List<String> values) {
            addCriterion("clientpwd in", values, "clientpwd");
            return (Criteria) this;
        }

        public Criteria andClientpwdNotIn(List<String> values) {
            addCriterion("clientpwd not in", values, "clientpwd");
            return (Criteria) this;
        }

        public Criteria andClientpwdBetween(String value1, String value2) {
            addCriterion("clientpwd between", value1, value2, "clientpwd");
            return (Criteria) this;
        }

        public Criteria andClientpwdNotBetween(String value1, String value2) {
            addCriterion("clientpwd not between", value1, value2, "clientpwd");
            return (Criteria) this;
        }

        public Criteria andClientemailIsNull() {
            addCriterion("clientemail is null");
            return (Criteria) this;
        }

        public Criteria andClientemailIsNotNull() {
            addCriterion("clientemail is not null");
            return (Criteria) this;
        }

        public Criteria andClientemailEqualTo(String value) {
            addCriterion("clientemail =", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailNotEqualTo(String value) {
            addCriterion("clientemail <>", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailGreaterThan(String value) {
            addCriterion("clientemail >", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailGreaterThanOrEqualTo(String value) {
            addCriterion("clientemail >=", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailLessThan(String value) {
            addCriterion("clientemail <", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailLessThanOrEqualTo(String value) {
            addCriterion("clientemail <=", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailLike(String value) {
            addCriterion("clientemail like", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailNotLike(String value) {
            addCriterion("clientemail not like", value, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailIn(List<String> values) {
            addCriterion("clientemail in", values, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailNotIn(List<String> values) {
            addCriterion("clientemail not in", values, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailBetween(String value1, String value2) {
            addCriterion("clientemail between", value1, value2, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientemailNotBetween(String value1, String value2) {
            addCriterion("clientemail not between", value1, value2, "clientemail");
            return (Criteria) this;
        }

        public Criteria andClientrightIsNull() {
            addCriterion("clientright is null");
            return (Criteria) this;
        }

        public Criteria andClientrightIsNotNull() {
            addCriterion("clientright is not null");
            return (Criteria) this;
        }

        public Criteria andClientrightEqualTo(String value) {
            addCriterion("clientright =", value, "clientright");
            return (Criteria) this;
        }

        public Criteria andClientrightNotEqualTo(String value) {
            addCriterion("clientright <>", value, "clientright");
            return (Criteria) this;
        }

        public Criteria andClientrightGreaterThan(String value) {
            addCriterion("clientright >", value, "clientright");
            return (Criteria) this;
        }

        public Criteria andClientrightGreaterThanOrEqualTo(String value) {
            addCriterion("clientright >=", value, "clientright");
            return (Criteria) this;
        }

        public Criteria andClientrightLessThan(String value) {
            addCriterion("clientright <", value, "clientright");
            return (Criteria) this;
        }

        public Criteria andClientrightLessThanOrEqualTo(String value) {
            addCriterion("clientright <=", value, "clientright");
            return (Criteria) this;
        }

        public Criteria andClientrightLike(String value) {
            addCriterion("clientright like", value, "clientright");
            return (Criteria) this;
        }

        public Criteria andClientrightNotLike(String value) {
            addCriterion("clientright not like", value, "clientright");
            return (Criteria) this;
        }

        public Criteria andClientrightIn(List<String> values) {
            addCriterion("clientright in", values, "clientright");
            return (Criteria) this;
        }

        public Criteria andClientrightNotIn(List<String> values) {
            addCriterion("clientright not in", values, "clientright");
            return (Criteria) this;
        }

        public Criteria andClientrightBetween(String value1, String value2) {
            addCriterion("clientright between", value1, value2, "clientright");
            return (Criteria) this;
        }

        public Criteria andClientrightNotBetween(String value1, String value2) {
            addCriterion("clientright not between", value1, value2, "clientright");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("logintime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("logintime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(String value) {
            addCriterion("logintime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(String value) {
            addCriterion("logintime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(String value) {
            addCriterion("logintime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(String value) {
            addCriterion("logintime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(String value) {
            addCriterion("logintime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(String value) {
            addCriterion("logintime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLike(String value) {
            addCriterion("logintime like", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotLike(String value) {
            addCriterion("logintime not like", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<String> values) {
            addCriterion("logintime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<String> values) {
            addCriterion("logintime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(String value1, String value2) {
            addCriterion("logintime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(String value1, String value2) {
            addCriterion("logintime not between", value1, value2, "logintime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table client
     *
     * @mbg.generated do_not_delete_during_merge Thu Sep 24 17:23:48 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
}