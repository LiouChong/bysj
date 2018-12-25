package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPosterIdIsNull() {
            addCriterion("poster_id is null");
            return (Criteria) this;
        }

        public Criteria andPosterIdIsNotNull() {
            addCriterion("poster_id is not null");
            return (Criteria) this;
        }

        public Criteria andPosterIdEqualTo(Integer value) {
            addCriterion("poster_id =", value, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdNotEqualTo(Integer value) {
            addCriterion("poster_id <>", value, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdGreaterThan(Integer value) {
            addCriterion("poster_id >", value, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("poster_id >=", value, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdLessThan(Integer value) {
            addCriterion("poster_id <", value, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdLessThanOrEqualTo(Integer value) {
            addCriterion("poster_id <=", value, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdIn(List<Integer> values) {
            addCriterion("poster_id in", values, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdNotIn(List<Integer> values) {
            addCriterion("poster_id not in", values, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdBetween(Integer value1, Integer value2) {
            addCriterion("poster_id between", value1, value2, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("poster_id not between", value1, value2, "posterId");
            return (Criteria) this;
        }

        public Criteria andIfGoodIsNull() {
            addCriterion("if_good is null");
            return (Criteria) this;
        }

        public Criteria andIfGoodIsNotNull() {
            addCriterion("if_good is not null");
            return (Criteria) this;
        }

        public Criteria andIfGoodEqualTo(Integer value) {
            addCriterion("if_good =", value, "ifGood");
            return (Criteria) this;
        }

        public Criteria andIfGoodNotEqualTo(Integer value) {
            addCriterion("if_good <>", value, "ifGood");
            return (Criteria) this;
        }

        public Criteria andIfGoodGreaterThan(Integer value) {
            addCriterion("if_good >", value, "ifGood");
            return (Criteria) this;
        }

        public Criteria andIfGoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_good >=", value, "ifGood");
            return (Criteria) this;
        }

        public Criteria andIfGoodLessThan(Integer value) {
            addCriterion("if_good <", value, "ifGood");
            return (Criteria) this;
        }

        public Criteria andIfGoodLessThanOrEqualTo(Integer value) {
            addCriterion("if_good <=", value, "ifGood");
            return (Criteria) this;
        }

        public Criteria andIfGoodIn(List<Integer> values) {
            addCriterion("if_good in", values, "ifGood");
            return (Criteria) this;
        }

        public Criteria andIfGoodNotIn(List<Integer> values) {
            addCriterion("if_good not in", values, "ifGood");
            return (Criteria) this;
        }

        public Criteria andIfGoodBetween(Integer value1, Integer value2) {
            addCriterion("if_good between", value1, value2, "ifGood");
            return (Criteria) this;
        }

        public Criteria andIfGoodNotBetween(Integer value1, Integer value2) {
            addCriterion("if_good not between", value1, value2, "ifGood");
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

        public Criteria andIfDeleteEqualTo(Integer value) {
            addCriterion("if_delete =", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteNotEqualTo(Integer value) {
            addCriterion("if_delete <>", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteGreaterThan(Integer value) {
            addCriterion("if_delete >", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_delete >=", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteLessThan(Integer value) {
            addCriterion("if_delete <", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("if_delete <=", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteIn(List<Integer> values) {
            addCriterion("if_delete in", values, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteNotIn(List<Integer> values) {
            addCriterion("if_delete not in", values, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteBetween(Integer value1, Integer value2) {
            addCriterion("if_delete between", value1, value2, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("if_delete not between", value1, value2, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andPlateIdIsNull() {
            addCriterion("plate_id is null");
            return (Criteria) this;
        }

        public Criteria andPlateIdIsNotNull() {
            addCriterion("plate_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlateIdEqualTo(Integer value) {
            addCriterion("plate_id =", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdNotEqualTo(Integer value) {
            addCriterion("plate_id <>", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThan(Integer value) {
            addCriterion("plate_id >", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plate_id >=", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThan(Integer value) {
            addCriterion("plate_id <", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThanOrEqualTo(Integer value) {
            addCriterion("plate_id <=", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdIn(List<Integer> values) {
            addCriterion("plate_id in", values, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdNotIn(List<Integer> values) {
            addCriterion("plate_id not in", values, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdBetween(Integer value1, Integer value2) {
            addCriterion("plate_id between", value1, value2, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plate_id not between", value1, value2, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateNameIsNull() {
            addCriterion("plate_name is null");
            return (Criteria) this;
        }

        public Criteria andPlateNameIsNotNull() {
            addCriterion("plate_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNameEqualTo(String value) {
            addCriterion("plate_name =", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameNotEqualTo(String value) {
            addCriterion("plate_name <>", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameGreaterThan(String value) {
            addCriterion("plate_name >", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameGreaterThanOrEqualTo(String value) {
            addCriterion("plate_name >=", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameLessThan(String value) {
            addCriterion("plate_name <", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameLessThanOrEqualTo(String value) {
            addCriterion("plate_name <=", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameLike(String value) {
            addCriterion("plate_name like", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameNotLike(String value) {
            addCriterion("plate_name not like", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameIn(List<String> values) {
            addCriterion("plate_name in", values, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameNotIn(List<String> values) {
            addCriterion("plate_name not in", values, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameBetween(String value1, String value2) {
            addCriterion("plate_name between", value1, value2, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameNotBetween(String value1, String value2) {
            addCriterion("plate_name not between", value1, value2, "plateName");
            return (Criteria) this;
        }

        public Criteria andReplyCountIsNull() {
            addCriterion("reply_count is null");
            return (Criteria) this;
        }

        public Criteria andReplyCountIsNotNull() {
            addCriterion("reply_count is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCountEqualTo(Integer value) {
            addCriterion("reply_count =", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotEqualTo(Integer value) {
            addCriterion("reply_count <>", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountGreaterThan(Integer value) {
            addCriterion("reply_count >", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_count >=", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountLessThan(Integer value) {
            addCriterion("reply_count <", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountLessThanOrEqualTo(Integer value) {
            addCriterion("reply_count <=", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountIn(List<Integer> values) {
            addCriterion("reply_count in", values, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotIn(List<Integer> values) {
            addCriterion("reply_count not in", values, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountBetween(Integer value1, Integer value2) {
            addCriterion("reply_count between", value1, value2, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_count not between", value1, value2, "replyCount");
            return (Criteria) this;
        }

        public Criteria andPosterNameIsNull() {
            addCriterion("poster_name is null");
            return (Criteria) this;
        }

        public Criteria andPosterNameIsNotNull() {
            addCriterion("poster_name is not null");
            return (Criteria) this;
        }

        public Criteria andPosterNameEqualTo(String value) {
            addCriterion("poster_name =", value, "posterName");
            return (Criteria) this;
        }

        public Criteria andPosterNameNotEqualTo(String value) {
            addCriterion("poster_name <>", value, "posterName");
            return (Criteria) this;
        }

        public Criteria andPosterNameGreaterThan(String value) {
            addCriterion("poster_name >", value, "posterName");
            return (Criteria) this;
        }

        public Criteria andPosterNameGreaterThanOrEqualTo(String value) {
            addCriterion("poster_name >=", value, "posterName");
            return (Criteria) this;
        }

        public Criteria andPosterNameLessThan(String value) {
            addCriterion("poster_name <", value, "posterName");
            return (Criteria) this;
        }

        public Criteria andPosterNameLessThanOrEqualTo(String value) {
            addCriterion("poster_name <=", value, "posterName");
            return (Criteria) this;
        }

        public Criteria andPosterNameLike(String value) {
            addCriterion("poster_name like", value, "posterName");
            return (Criteria) this;
        }

        public Criteria andPosterNameNotLike(String value) {
            addCriterion("poster_name not like", value, "posterName");
            return (Criteria) this;
        }

        public Criteria andPosterNameIn(List<String> values) {
            addCriterion("poster_name in", values, "posterName");
            return (Criteria) this;
        }

        public Criteria andPosterNameNotIn(List<String> values) {
            addCriterion("poster_name not in", values, "posterName");
            return (Criteria) this;
        }

        public Criteria andPosterNameBetween(String value1, String value2) {
            addCriterion("poster_name between", value1, value2, "posterName");
            return (Criteria) this;
        }

        public Criteria andPosterNameNotBetween(String value1, String value2) {
            addCriterion("poster_name not between", value1, value2, "posterName");
            return (Criteria) this;
        }

        public Criteria andPosterPictureIsNull() {
            addCriterion("poster_picture is null");
            return (Criteria) this;
        }

        public Criteria andPosterPictureIsNotNull() {
            addCriterion("poster_picture is not null");
            return (Criteria) this;
        }

        public Criteria andPosterPictureEqualTo(String value) {
            addCriterion("poster_picture =", value, "posterPicture");
            return (Criteria) this;
        }

        public Criteria andPosterPictureNotEqualTo(String value) {
            addCriterion("poster_picture <>", value, "posterPicture");
            return (Criteria) this;
        }

        public Criteria andPosterPictureGreaterThan(String value) {
            addCriterion("poster_picture >", value, "posterPicture");
            return (Criteria) this;
        }

        public Criteria andPosterPictureGreaterThanOrEqualTo(String value) {
            addCriterion("poster_picture >=", value, "posterPicture");
            return (Criteria) this;
        }

        public Criteria andPosterPictureLessThan(String value) {
            addCriterion("poster_picture <", value, "posterPicture");
            return (Criteria) this;
        }

        public Criteria andPosterPictureLessThanOrEqualTo(String value) {
            addCriterion("poster_picture <=", value, "posterPicture");
            return (Criteria) this;
        }

        public Criteria andPosterPictureLike(String value) {
            addCriterion("poster_picture like", value, "posterPicture");
            return (Criteria) this;
        }

        public Criteria andPosterPictureNotLike(String value) {
            addCriterion("poster_picture not like", value, "posterPicture");
            return (Criteria) this;
        }

        public Criteria andPosterPictureIn(List<String> values) {
            addCriterion("poster_picture in", values, "posterPicture");
            return (Criteria) this;
        }

        public Criteria andPosterPictureNotIn(List<String> values) {
            addCriterion("poster_picture not in", values, "posterPicture");
            return (Criteria) this;
        }

        public Criteria andPosterPictureBetween(String value1, String value2) {
            addCriterion("poster_picture between", value1, value2, "posterPicture");
            return (Criteria) this;
        }

        public Criteria andPosterPictureNotBetween(String value1, String value2) {
            addCriterion("poster_picture not between", value1, value2, "posterPicture");
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

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("last_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("last_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("last_modify_time =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("last_modify_time <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("last_modify_time >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_time >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("last_modify_time <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_time <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("last_modify_time in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("last_modify_time not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_modify_time between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_time not between", value1, value2, "lastModifyTime");
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