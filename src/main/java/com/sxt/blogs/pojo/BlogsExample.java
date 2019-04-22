package com.sxt.blogs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andBlogsIdIsNull() {
            addCriterion("blogs_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogsIdIsNotNull() {
            addCriterion("blogs_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsIdEqualTo(Integer value) {
            addCriterion("blogs_id =", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdNotEqualTo(Integer value) {
            addCriterion("blogs_id <>", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdGreaterThan(Integer value) {
            addCriterion("blogs_id >", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogs_id >=", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdLessThan(Integer value) {
            addCriterion("blogs_id <", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdLessThanOrEqualTo(Integer value) {
            addCriterion("blogs_id <=", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdIn(List<Integer> values) {
            addCriterion("blogs_id in", values, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdNotIn(List<Integer> values) {
            addCriterion("blogs_id not in", values, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdBetween(Integer value1, Integer value2) {
            addCriterion("blogs_id between", value1, value2, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blogs_id not between", value1, value2, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlIsNull() {
            addCriterion("blogs_url is null");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlIsNotNull() {
            addCriterion("blogs_url is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlEqualTo(String value) {
            addCriterion("blogs_url =", value, "blogsUrl");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlNotEqualTo(String value) {
            addCriterion("blogs_url <>", value, "blogsUrl");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlGreaterThan(String value) {
            addCriterion("blogs_url >", value, "blogsUrl");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("blogs_url >=", value, "blogsUrl");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlLessThan(String value) {
            addCriterion("blogs_url <", value, "blogsUrl");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlLessThanOrEqualTo(String value) {
            addCriterion("blogs_url <=", value, "blogsUrl");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlLike(String value) {
            addCriterion("blogs_url like", value, "blogsUrl");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlNotLike(String value) {
            addCriterion("blogs_url not like", value, "blogsUrl");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlIn(List<String> values) {
            addCriterion("blogs_url in", values, "blogsUrl");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlNotIn(List<String> values) {
            addCriterion("blogs_url not in", values, "blogsUrl");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlBetween(String value1, String value2) {
            addCriterion("blogs_url between", value1, value2, "blogsUrl");
            return (Criteria) this;
        }

        public Criteria andBlogsUrlNotBetween(String value1, String value2) {
            addCriterion("blogs_url not between", value1, value2, "blogsUrl");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdIsNull() {
            addCriterion("blogs_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdIsNotNull() {
            addCriterion("blogs_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdEqualTo(Integer value) {
            addCriterion("blogs_type_id =", value, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdNotEqualTo(Integer value) {
            addCriterion("blogs_type_id <>", value, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdGreaterThan(Integer value) {
            addCriterion("blogs_type_id >", value, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogs_type_id >=", value, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdLessThan(Integer value) {
            addCriterion("blogs_type_id <", value, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("blogs_type_id <=", value, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdIn(List<Integer> values) {
            addCriterion("blogs_type_id in", values, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdNotIn(List<Integer> values) {
            addCriterion("blogs_type_id not in", values, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("blogs_type_id between", value1, value2, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blogs_type_id not between", value1, value2, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andBlogsNameIsNull() {
            addCriterion("blogs_name is null");
            return (Criteria) this;
        }

        public Criteria andBlogsNameIsNotNull() {
            addCriterion("blogs_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsNameEqualTo(String value) {
            addCriterion("blogs_name =", value, "blogsName");
            return (Criteria) this;
        }

        public Criteria andBlogsNameNotEqualTo(String value) {
            addCriterion("blogs_name <>", value, "blogsName");
            return (Criteria) this;
        }

        public Criteria andBlogsNameGreaterThan(String value) {
            addCriterion("blogs_name >", value, "blogsName");
            return (Criteria) this;
        }

        public Criteria andBlogsNameGreaterThanOrEqualTo(String value) {
            addCriterion("blogs_name >=", value, "blogsName");
            return (Criteria) this;
        }

        public Criteria andBlogsNameLessThan(String value) {
            addCriterion("blogs_name <", value, "blogsName");
            return (Criteria) this;
        }

        public Criteria andBlogsNameLessThanOrEqualTo(String value) {
            addCriterion("blogs_name <=", value, "blogsName");
            return (Criteria) this;
        }

        public Criteria andBlogsNameLike(String value) {
            addCriterion("blogs_name like", value, "blogsName");
            return (Criteria) this;
        }

        public Criteria andBlogsNameNotLike(String value) {
            addCriterion("blogs_name not like", value, "blogsName");
            return (Criteria) this;
        }

        public Criteria andBlogsNameIn(List<String> values) {
            addCriterion("blogs_name in", values, "blogsName");
            return (Criteria) this;
        }

        public Criteria andBlogsNameNotIn(List<String> values) {
            addCriterion("blogs_name not in", values, "blogsName");
            return (Criteria) this;
        }

        public Criteria andBlogsNameBetween(String value1, String value2) {
            addCriterion("blogs_name between", value1, value2, "blogsName");
            return (Criteria) this;
        }

        public Criteria andBlogsNameNotBetween(String value1, String value2) {
            addCriterion("blogs_name not between", value1, value2, "blogsName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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