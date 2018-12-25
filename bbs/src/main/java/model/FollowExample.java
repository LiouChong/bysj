package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowExample() {
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

        public Criteria andFanIdIsNull() {
            addCriterion("fan_id is null");
            return (Criteria) this;
        }

        public Criteria andFanIdIsNotNull() {
            addCriterion("fan_id is not null");
            return (Criteria) this;
        }

        public Criteria andFanIdEqualTo(Integer value) {
            addCriterion("fan_id =", value, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdNotEqualTo(Integer value) {
            addCriterion("fan_id <>", value, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdGreaterThan(Integer value) {
            addCriterion("fan_id >", value, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fan_id >=", value, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdLessThan(Integer value) {
            addCriterion("fan_id <", value, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdLessThanOrEqualTo(Integer value) {
            addCriterion("fan_id <=", value, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdIn(List<Integer> values) {
            addCriterion("fan_id in", values, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdNotIn(List<Integer> values) {
            addCriterion("fan_id not in", values, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdBetween(Integer value1, Integer value2) {
            addCriterion("fan_id between", value1, value2, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fan_id not between", value1, value2, "fanId");
            return (Criteria) this;
        }

        public Criteria andStarIdIsNull() {
            addCriterion("star_id is null");
            return (Criteria) this;
        }

        public Criteria andStarIdIsNotNull() {
            addCriterion("star_id is not null");
            return (Criteria) this;
        }

        public Criteria andStarIdEqualTo(Integer value) {
            addCriterion("star_id =", value, "starId");
            return (Criteria) this;
        }

        public Criteria andStarIdNotEqualTo(Integer value) {
            addCriterion("star_id <>", value, "starId");
            return (Criteria) this;
        }

        public Criteria andStarIdGreaterThan(Integer value) {
            addCriterion("star_id >", value, "starId");
            return (Criteria) this;
        }

        public Criteria andStarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("star_id >=", value, "starId");
            return (Criteria) this;
        }

        public Criteria andStarIdLessThan(Integer value) {
            addCriterion("star_id <", value, "starId");
            return (Criteria) this;
        }

        public Criteria andStarIdLessThanOrEqualTo(Integer value) {
            addCriterion("star_id <=", value, "starId");
            return (Criteria) this;
        }

        public Criteria andStarIdIn(List<Integer> values) {
            addCriterion("star_id in", values, "starId");
            return (Criteria) this;
        }

        public Criteria andStarIdNotIn(List<Integer> values) {
            addCriterion("star_id not in", values, "starId");
            return (Criteria) this;
        }

        public Criteria andStarIdBetween(Integer value1, Integer value2) {
            addCriterion("star_id between", value1, value2, "starId");
            return (Criteria) this;
        }

        public Criteria andStarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("star_id not between", value1, value2, "starId");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andIfDeleteIsNull() {
            addCriterion("if_delete is null");
            return (Criteria) this;
        }

        public Criteria andIfDeleteIsNotNull() {
            addCriterion("if_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIfDeleteEqualTo(Boolean value) {
            addCriterion("if_delete =", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteNotEqualTo(Boolean value) {
            addCriterion("if_delete <>", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteGreaterThan(Boolean value) {
            addCriterion("if_delete >", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("if_delete >=", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteLessThan(Boolean value) {
            addCriterion("if_delete <", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("if_delete <=", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteIn(List<Boolean> values) {
            addCriterion("if_delete in", values, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteNotIn(List<Boolean> values) {
            addCriterion("if_delete not in", values, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("if_delete between", value1, value2, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("if_delete not between", value1, value2, "ifDelete");
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