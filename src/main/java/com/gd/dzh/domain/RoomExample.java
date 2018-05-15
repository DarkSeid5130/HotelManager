package com.gd.dzh.domain;

import java.util.ArrayList;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andRoomnumIsNull() {
            addCriterion("roomnum is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNotNull() {
            addCriterion("roomnum is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumEqualTo(String value) {
            addCriterion("roomnum =", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotEqualTo(String value) {
            addCriterion("roomnum <>", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThan(String value) {
            addCriterion("roomnum >", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThanOrEqualTo(String value) {
            addCriterion("roomnum >=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThan(String value) {
            addCriterion("roomnum <", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThanOrEqualTo(String value) {
            addCriterion("roomnum <=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLike(String value) {
            addCriterion("roomnum like", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotLike(String value) {
            addCriterion("roomnum not like", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumIn(List<String> values) {
            addCriterion("roomnum in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotIn(List<String> values) {
            addCriterion("roomnum not in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumBetween(String value1, String value2) {
            addCriterion("roomnum between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotBetween(String value1, String value2) {
            addCriterion("roomnum not between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomstatusIsNull() {
            addCriterion("roomstatus is null");
            return (Criteria) this;
        }

        public Criteria andRoomstatusIsNotNull() {
            addCriterion("roomstatus is not null");
            return (Criteria) this;
        }

        public Criteria andRoomstatusEqualTo(Integer value) {
            addCriterion("roomstatus =", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusNotEqualTo(Integer value) {
            addCriterion("roomstatus <>", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusGreaterThan(Integer value) {
            addCriterion("roomstatus >", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomstatus >=", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusLessThan(Integer value) {
            addCriterion("roomstatus <", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusLessThanOrEqualTo(Integer value) {
            addCriterion("roomstatus <=", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusIn(List<Integer> values) {
            addCriterion("roomstatus in", values, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusNotIn(List<Integer> values) {
            addCriterion("roomstatus not in", values, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusBetween(Integer value1, Integer value2) {
            addCriterion("roomstatus between", value1, value2, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("roomstatus not between", value1, value2, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoompriceIsNull() {
            addCriterion("roomprice is null");
            return (Criteria) this;
        }

        public Criteria andRoompriceIsNotNull() {
            addCriterion("roomprice is not null");
            return (Criteria) this;
        }

        public Criteria andRoompriceEqualTo(Integer value) {
            addCriterion("roomprice =", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceNotEqualTo(Integer value) {
            addCriterion("roomprice <>", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceGreaterThan(Integer value) {
            addCriterion("roomprice >", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomprice >=", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceLessThan(Integer value) {
            addCriterion("roomprice <", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceLessThanOrEqualTo(Integer value) {
            addCriterion("roomprice <=", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceIn(List<Integer> values) {
            addCriterion("roomprice in", values, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceNotIn(List<Integer> values) {
            addCriterion("roomprice not in", values, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceBetween(Integer value1, Integer value2) {
            addCriterion("roomprice between", value1, value2, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceNotBetween(Integer value1, Integer value2) {
            addCriterion("roomprice not between", value1, value2, "roomprice");
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

        public Criteria andRoomtypeIsNull() {
            addCriterion("roomtype is null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNotNull() {
            addCriterion("roomtype is not null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeEqualTo(Integer value) {
            addCriterion("roomtype =", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotEqualTo(Integer value) {
            addCriterion("roomtype <>", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThan(Integer value) {
            addCriterion("roomtype >", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomtype >=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThan(Integer value) {
            addCriterion("roomtype <", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThanOrEqualTo(Integer value) {
            addCriterion("roomtype <=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIn(List<Integer> values) {
            addCriterion("roomtype in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotIn(List<Integer> values) {
            addCriterion("roomtype not in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeBetween(Integer value1, Integer value2) {
            addCriterion("roomtype between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("roomtype not between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andExt01IsNull() {
            addCriterion("ext01 is null");
            return (Criteria) this;
        }

        public Criteria andExt01IsNotNull() {
            addCriterion("ext01 is not null");
            return (Criteria) this;
        }

        public Criteria andExt01EqualTo(String value) {
            addCriterion("ext01 =", value, "ext01");
            return (Criteria) this;
        }

        public Criteria andExt01NotEqualTo(String value) {
            addCriterion("ext01 <>", value, "ext01");
            return (Criteria) this;
        }

        public Criteria andExt01GreaterThan(String value) {
            addCriterion("ext01 >", value, "ext01");
            return (Criteria) this;
        }

        public Criteria andExt01GreaterThanOrEqualTo(String value) {
            addCriterion("ext01 >=", value, "ext01");
            return (Criteria) this;
        }

        public Criteria andExt01LessThan(String value) {
            addCriterion("ext01 <", value, "ext01");
            return (Criteria) this;
        }

        public Criteria andExt01LessThanOrEqualTo(String value) {
            addCriterion("ext01 <=", value, "ext01");
            return (Criteria) this;
        }

        public Criteria andExt01Like(String value) {
            addCriterion("ext01 like", value, "ext01");
            return (Criteria) this;
        }

        public Criteria andExt01NotLike(String value) {
            addCriterion("ext01 not like", value, "ext01");
            return (Criteria) this;
        }

        public Criteria andExt01In(List<String> values) {
            addCriterion("ext01 in", values, "ext01");
            return (Criteria) this;
        }

        public Criteria andExt01NotIn(List<String> values) {
            addCriterion("ext01 not in", values, "ext01");
            return (Criteria) this;
        }

        public Criteria andExt01Between(String value1, String value2) {
            addCriterion("ext01 between", value1, value2, "ext01");
            return (Criteria) this;
        }

        public Criteria andExt01NotBetween(String value1, String value2) {
            addCriterion("ext01 not between", value1, value2, "ext01");
            return (Criteria) this;
        }

        public Criteria andExt02IsNull() {
            addCriterion("ext02 is null");
            return (Criteria) this;
        }

        public Criteria andExt02IsNotNull() {
            addCriterion("ext02 is not null");
            return (Criteria) this;
        }

        public Criteria andExt02EqualTo(String value) {
            addCriterion("ext02 =", value, "ext02");
            return (Criteria) this;
        }

        public Criteria andExt02NotEqualTo(String value) {
            addCriterion("ext02 <>", value, "ext02");
            return (Criteria) this;
        }

        public Criteria andExt02GreaterThan(String value) {
            addCriterion("ext02 >", value, "ext02");
            return (Criteria) this;
        }

        public Criteria andExt02GreaterThanOrEqualTo(String value) {
            addCriterion("ext02 >=", value, "ext02");
            return (Criteria) this;
        }

        public Criteria andExt02LessThan(String value) {
            addCriterion("ext02 <", value, "ext02");
            return (Criteria) this;
        }

        public Criteria andExt02LessThanOrEqualTo(String value) {
            addCriterion("ext02 <=", value, "ext02");
            return (Criteria) this;
        }

        public Criteria andExt02Like(String value) {
            addCriterion("ext02 like", value, "ext02");
            return (Criteria) this;
        }

        public Criteria andExt02NotLike(String value) {
            addCriterion("ext02 not like", value, "ext02");
            return (Criteria) this;
        }

        public Criteria andExt02In(List<String> values) {
            addCriterion("ext02 in", values, "ext02");
            return (Criteria) this;
        }

        public Criteria andExt02NotIn(List<String> values) {
            addCriterion("ext02 not in", values, "ext02");
            return (Criteria) this;
        }

        public Criteria andExt02Between(String value1, String value2) {
            addCriterion("ext02 between", value1, value2, "ext02");
            return (Criteria) this;
        }

        public Criteria andExt02NotBetween(String value1, String value2) {
            addCriterion("ext02 not between", value1, value2, "ext02");
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