package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andReplyInfoIsNull() {
            addCriterion("reply_info is null");
            return (Criteria) this;
        }

        public Criteria andReplyInfoIsNotNull() {
            addCriterion("reply_info is not null");
            return (Criteria) this;
        }

        public Criteria andReplyInfoEqualTo(String value) {
            addCriterion("reply_info =", value, "replyInfo");
            return (Criteria) this;
        }

        public Criteria andReplyInfoNotEqualTo(String value) {
            addCriterion("reply_info <>", value, "replyInfo");
            return (Criteria) this;
        }

        public Criteria andReplyInfoGreaterThan(String value) {
            addCriterion("reply_info >", value, "replyInfo");
            return (Criteria) this;
        }

        public Criteria andReplyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("reply_info >=", value, "replyInfo");
            return (Criteria) this;
        }

        public Criteria andReplyInfoLessThan(String value) {
            addCriterion("reply_info <", value, "replyInfo");
            return (Criteria) this;
        }

        public Criteria andReplyInfoLessThanOrEqualTo(String value) {
            addCriterion("reply_info <=", value, "replyInfo");
            return (Criteria) this;
        }

        public Criteria andReplyInfoLike(String value) {
            addCriterion("reply_info like", value, "replyInfo");
            return (Criteria) this;
        }

        public Criteria andReplyInfoNotLike(String value) {
            addCriterion("reply_info not like", value, "replyInfo");
            return (Criteria) this;
        }

        public Criteria andReplyInfoIn(List<String> values) {
            addCriterion("reply_info in", values, "replyInfo");
            return (Criteria) this;
        }

        public Criteria andReplyInfoNotIn(List<String> values) {
            addCriterion("reply_info not in", values, "replyInfo");
            return (Criteria) this;
        }

        public Criteria andReplyInfoBetween(String value1, String value2) {
            addCriterion("reply_info between", value1, value2, "replyInfo");
            return (Criteria) this;
        }

        public Criteria andReplyInfoNotBetween(String value1, String value2) {
            addCriterion("reply_info not between", value1, value2, "replyInfo");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("reply_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(Date value) {
            addCriterion("reply_time =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(Date value) {
            addCriterion("reply_time <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(Date value) {
            addCriterion("reply_time >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_time >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(Date value) {
            addCriterion("reply_time <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_time <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<Date> values) {
            addCriterion("reply_time in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<Date> values) {
            addCriterion("reply_time not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(Date value1, Date value2) {
            addCriterion("reply_time between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_time not between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Integer value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Integer value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Integer value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Integer value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Integer> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Integer> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Integer value1, Integer value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_id not between", value1, value2, "postId");
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

        public Criteria andThumbupCountIsNull() {
            addCriterion("thumbup_count is null");
            return (Criteria) this;
        }

        public Criteria andThumbupCountIsNotNull() {
            addCriterion("thumbup_count is not null");
            return (Criteria) this;
        }

        public Criteria andThumbupCountEqualTo(Integer value) {
            addCriterion("thumbup_count =", value, "thumbupCount");
            return (Criteria) this;
        }

        public Criteria andThumbupCountNotEqualTo(Integer value) {
            addCriterion("thumbup_count <>", value, "thumbupCount");
            return (Criteria) this;
        }

        public Criteria andThumbupCountGreaterThan(Integer value) {
            addCriterion("thumbup_count >", value, "thumbupCount");
            return (Criteria) this;
        }

        public Criteria andThumbupCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("thumbup_count >=", value, "thumbupCount");
            return (Criteria) this;
        }

        public Criteria andThumbupCountLessThan(Integer value) {
            addCriterion("thumbup_count <", value, "thumbupCount");
            return (Criteria) this;
        }

        public Criteria andThumbupCountLessThanOrEqualTo(Integer value) {
            addCriterion("thumbup_count <=", value, "thumbupCount");
            return (Criteria) this;
        }

        public Criteria andThumbupCountIn(List<Integer> values) {
            addCriterion("thumbup_count in", values, "thumbupCount");
            return (Criteria) this;
        }

        public Criteria andThumbupCountNotIn(List<Integer> values) {
            addCriterion("thumbup_count not in", values, "thumbupCount");
            return (Criteria) this;
        }

        public Criteria andThumbupCountBetween(Integer value1, Integer value2) {
            addCriterion("thumbup_count between", value1, value2, "thumbupCount");
            return (Criteria) this;
        }

        public Criteria andThumbupCountNotBetween(Integer value1, Integer value2) {
            addCriterion("thumbup_count not between", value1, value2, "thumbupCount");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPictureIsNull() {
            addCriterion("user_picture is null");
            return (Criteria) this;
        }

        public Criteria andUserPictureIsNotNull() {
            addCriterion("user_picture is not null");
            return (Criteria) this;
        }

        public Criteria andUserPictureEqualTo(String value) {
            addCriterion("user_picture =", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureNotEqualTo(String value) {
            addCriterion("user_picture <>", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureGreaterThan(String value) {
            addCriterion("user_picture >", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureGreaterThanOrEqualTo(String value) {
            addCriterion("user_picture >=", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureLessThan(String value) {
            addCriterion("user_picture <", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureLessThanOrEqualTo(String value) {
            addCriterion("user_picture <=", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureLike(String value) {
            addCriterion("user_picture like", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureNotLike(String value) {
            addCriterion("user_picture not like", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureIn(List<String> values) {
            addCriterion("user_picture in", values, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureNotIn(List<String> values) {
            addCriterion("user_picture not in", values, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureBetween(String value1, String value2) {
            addCriterion("user_picture between", value1, value2, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureNotBetween(String value1, String value2) {
            addCriterion("user_picture not between", value1, value2, "userPicture");
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