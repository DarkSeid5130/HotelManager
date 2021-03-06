package com.gd.dzh.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIsNull() {
            addCriterion("checkintime is null");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIsNotNull() {
            addCriterion("checkintime is not null");
            return (Criteria) this;
        }

        public Criteria andCheckintimeEqualTo(Date value) {
            addCriterion("checkintime =", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotEqualTo(Date value) {
            addCriterion("checkintime <>", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeGreaterThan(Date value) {
            addCriterion("checkintime >", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checkintime >=", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeLessThan(Date value) {
            addCriterion("checkintime <", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeLessThanOrEqualTo(Date value) {
            addCriterion("checkintime <=", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIn(List<Date> values) {
            addCriterion("checkintime in", values, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotIn(List<Date> values) {
            addCriterion("checkintime not in", values, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeBetween(Date value1, Date value2) {
            addCriterion("checkintime between", value1, value2, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotBetween(Date value1, Date value2) {
            addCriterion("checkintime not between", value1, value2, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckouttimeIsNull() {
            addCriterion("checkouttime is null");
            return (Criteria) this;
        }

        public Criteria andCheckouttimeIsNotNull() {
            addCriterion("checkouttime is not null");
            return (Criteria) this;
        }

        public Criteria andCheckouttimeEqualTo(Date value) {
            addCriterion("checkouttime =", value, "checkouttime");
            return (Criteria) this;
        }

        public Criteria andCheckouttimeNotEqualTo(Date value) {
            addCriterion("checkouttime <>", value, "checkouttime");
            return (Criteria) this;
        }

        public Criteria andCheckouttimeGreaterThan(Date value) {
            addCriterion("checkouttime >", value, "checkouttime");
            return (Criteria) this;
        }

        public Criteria andCheckouttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checkouttime >=", value, "checkouttime");
            return (Criteria) this;
        }

        public Criteria andCheckouttimeLessThan(Date value) {
            addCriterion("checkouttime <", value, "checkouttime");
            return (Criteria) this;
        }

        public Criteria andCheckouttimeLessThanOrEqualTo(Date value) {
            addCriterion("checkouttime <=", value, "checkouttime");
            return (Criteria) this;
        }

        public Criteria andCheckouttimeIn(List<Date> values) {
            addCriterion("checkouttime in", values, "checkouttime");
            return (Criteria) this;
        }

        public Criteria andCheckouttimeNotIn(List<Date> values) {
            addCriterion("checkouttime not in", values, "checkouttime");
            return (Criteria) this;
        }

        public Criteria andCheckouttimeBetween(Date value1, Date value2) {
            addCriterion("checkouttime between", value1, value2, "checkouttime");
            return (Criteria) this;
        }

        public Criteria andCheckouttimeNotBetween(Date value1, Date value2) {
            addCriterion("checkouttime not between", value1, value2, "checkouttime");
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