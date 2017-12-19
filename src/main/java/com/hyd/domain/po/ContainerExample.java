package com.hyd.domain.po;

import java.util.ArrayList;
import java.util.List;

public class ContainerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContainerExample() {
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

        public Criteria andContaineridIsNull() {
            addCriterion("containerID is null");
            return (Criteria) this;
        }

        public Criteria andContaineridIsNotNull() {
            addCriterion("containerID is not null");
            return (Criteria) this;
        }

        public Criteria andContaineridEqualTo(String value) {
            addCriterion("containerID =", value, "containerid");
            return (Criteria) this;
        }

        public Criteria andContaineridNotEqualTo(String value) {
            addCriterion("containerID <>", value, "containerid");
            return (Criteria) this;
        }

        public Criteria andContaineridGreaterThan(String value) {
            addCriterion("containerID >", value, "containerid");
            return (Criteria) this;
        }

        public Criteria andContaineridGreaterThanOrEqualTo(String value) {
            addCriterion("containerID >=", value, "containerid");
            return (Criteria) this;
        }

        public Criteria andContaineridLessThan(String value) {
            addCriterion("containerID <", value, "containerid");
            return (Criteria) this;
        }

        public Criteria andContaineridLessThanOrEqualTo(String value) {
            addCriterion("containerID <=", value, "containerid");
            return (Criteria) this;
        }

        public Criteria andContaineridLike(String value) {
            addCriterion("containerID like", value, "containerid");
            return (Criteria) this;
        }

        public Criteria andContaineridNotLike(String value) {
            addCriterion("containerID not like", value, "containerid");
            return (Criteria) this;
        }

        public Criteria andContaineridIn(List<String> values) {
            addCriterion("containerID in", values, "containerid");
            return (Criteria) this;
        }

        public Criteria andContaineridNotIn(List<String> values) {
            addCriterion("containerID not in", values, "containerid");
            return (Criteria) this;
        }

        public Criteria andContaineridBetween(String value1, String value2) {
            addCriterion("containerID between", value1, value2, "containerid");
            return (Criteria) this;
        }

        public Criteria andContaineridNotBetween(String value1, String value2) {
            addCriterion("containerID not between", value1, value2, "containerid");
            return (Criteria) this;
        }

        public Criteria andShiporderidIsNull() {
            addCriterion("shipOrderID is null");
            return (Criteria) this;
        }

        public Criteria andShiporderidIsNotNull() {
            addCriterion("shipOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andShiporderidEqualTo(String value) {
            addCriterion("shipOrderID =", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidNotEqualTo(String value) {
            addCriterion("shipOrderID <>", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidGreaterThan(String value) {
            addCriterion("shipOrderID >", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidGreaterThanOrEqualTo(String value) {
            addCriterion("shipOrderID >=", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidLessThan(String value) {
            addCriterion("shipOrderID <", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidLessThanOrEqualTo(String value) {
            addCriterion("shipOrderID <=", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidLike(String value) {
            addCriterion("shipOrderID like", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidNotLike(String value) {
            addCriterion("shipOrderID not like", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidIn(List<String> values) {
            addCriterion("shipOrderID in", values, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidNotIn(List<String> values) {
            addCriterion("shipOrderID not in", values, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidBetween(String value1, String value2) {
            addCriterion("shipOrderID between", value1, value2, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidNotBetween(String value1, String value2) {
            addCriterion("shipOrderID not between", value1, value2, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andDriveridIsNull() {
            addCriterion("driverID is null");
            return (Criteria) this;
        }

        public Criteria andDriveridIsNotNull() {
            addCriterion("driverID is not null");
            return (Criteria) this;
        }

        public Criteria andDriveridEqualTo(Integer value) {
            addCriterion("driverID =", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotEqualTo(Integer value) {
            addCriterion("driverID <>", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridGreaterThan(Integer value) {
            addCriterion("driverID >", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridGreaterThanOrEqualTo(Integer value) {
            addCriterion("driverID >=", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridLessThan(Integer value) {
            addCriterion("driverID <", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridLessThanOrEqualTo(Integer value) {
            addCriterion("driverID <=", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridIn(List<Integer> values) {
            addCriterion("driverID in", values, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotIn(List<Integer> values) {
            addCriterion("driverID not in", values, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridBetween(Integer value1, Integer value2) {
            addCriterion("driverID between", value1, value2, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotBetween(Integer value1, Integer value2) {
            addCriterion("driverID not between", value1, value2, "driverid");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("cType is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("cType is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(String value) {
            addCriterion("cType =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(String value) {
            addCriterion("cType <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(String value) {
            addCriterion("cType >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(String value) {
            addCriterion("cType >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(String value) {
            addCriterion("cType <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(String value) {
            addCriterion("cType <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLike(String value) {
            addCriterion("cType like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotLike(String value) {
            addCriterion("cType not like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<String> values) {
            addCriterion("cType in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<String> values) {
            addCriterion("cType not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(String value1, String value2) {
            addCriterion("cType between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(String value1, String value2) {
            addCriterion("cType not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCsizeIsNull() {
            addCriterion("cSize is null");
            return (Criteria) this;
        }

        public Criteria andCsizeIsNotNull() {
            addCriterion("cSize is not null");
            return (Criteria) this;
        }

        public Criteria andCsizeEqualTo(String value) {
            addCriterion("cSize =", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeNotEqualTo(String value) {
            addCriterion("cSize <>", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeGreaterThan(String value) {
            addCriterion("cSize >", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeGreaterThanOrEqualTo(String value) {
            addCriterion("cSize >=", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeLessThan(String value) {
            addCriterion("cSize <", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeLessThanOrEqualTo(String value) {
            addCriterion("cSize <=", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeLike(String value) {
            addCriterion("cSize like", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeNotLike(String value) {
            addCriterion("cSize not like", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeIn(List<String> values) {
            addCriterion("cSize in", values, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeNotIn(List<String> values) {
            addCriterion("cSize not in", values, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeBetween(String value1, String value2) {
            addCriterion("cSize between", value1, value2, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeNotBetween(String value1, String value2) {
            addCriterion("cSize not between", value1, value2, "csize");
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