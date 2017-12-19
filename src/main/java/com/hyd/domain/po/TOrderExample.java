package com.hyd.domain.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCompanyidIsNull() {
            addCriterion("companyID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(String value) {
            addCriterion("companyID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(String value) {
            addCriterion("companyID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(String value) {
            addCriterion("companyID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("companyID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(String value) {
            addCriterion("companyID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(String value) {
            addCriterion("companyID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLike(String value) {
            addCriterion("companyID like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotLike(String value) {
            addCriterion("companyID not like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<String> values) {
            addCriterion("companyID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<String> values) {
            addCriterion("companyID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(String value1, String value2) {
            addCriterion("companyID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(String value1, String value2) {
            addCriterion("companyID not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andRevertlocIsNull() {
            addCriterion("revertLoc is null");
            return (Criteria) this;
        }

        public Criteria andRevertlocIsNotNull() {
            addCriterion("revertLoc is not null");
            return (Criteria) this;
        }

        public Criteria andRevertlocEqualTo(String value) {
            addCriterion("revertLoc =", value, "revertloc");
            return (Criteria) this;
        }

        public Criteria andRevertlocNotEqualTo(String value) {
            addCriterion("revertLoc <>", value, "revertloc");
            return (Criteria) this;
        }

        public Criteria andRevertlocGreaterThan(String value) {
            addCriterion("revertLoc >", value, "revertloc");
            return (Criteria) this;
        }

        public Criteria andRevertlocGreaterThanOrEqualTo(String value) {
            addCriterion("revertLoc >=", value, "revertloc");
            return (Criteria) this;
        }

        public Criteria andRevertlocLessThan(String value) {
            addCriterion("revertLoc <", value, "revertloc");
            return (Criteria) this;
        }

        public Criteria andRevertlocLessThanOrEqualTo(String value) {
            addCriterion("revertLoc <=", value, "revertloc");
            return (Criteria) this;
        }

        public Criteria andRevertlocLike(String value) {
            addCriterion("revertLoc like", value, "revertloc");
            return (Criteria) this;
        }

        public Criteria andRevertlocNotLike(String value) {
            addCriterion("revertLoc not like", value, "revertloc");
            return (Criteria) this;
        }

        public Criteria andRevertlocIn(List<String> values) {
            addCriterion("revertLoc in", values, "revertloc");
            return (Criteria) this;
        }

        public Criteria andRevertlocNotIn(List<String> values) {
            addCriterion("revertLoc not in", values, "revertloc");
            return (Criteria) this;
        }

        public Criteria andRevertlocBetween(String value1, String value2) {
            addCriterion("revertLoc between", value1, value2, "revertloc");
            return (Criteria) this;
        }

        public Criteria andRevertlocNotBetween(String value1, String value2) {
            addCriterion("revertLoc not between", value1, value2, "revertloc");
            return (Criteria) this;
        }

        public Criteria andVoyageIsNull() {
            addCriterion("voyage is null");
            return (Criteria) this;
        }

        public Criteria andVoyageIsNotNull() {
            addCriterion("voyage is not null");
            return (Criteria) this;
        }

        public Criteria andVoyageEqualTo(String value) {
            addCriterion("voyage =", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotEqualTo(String value) {
            addCriterion("voyage <>", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageGreaterThan(String value) {
            addCriterion("voyage >", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageGreaterThanOrEqualTo(String value) {
            addCriterion("voyage >=", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageLessThan(String value) {
            addCriterion("voyage <", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageLessThanOrEqualTo(String value) {
            addCriterion("voyage <=", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageLike(String value) {
            addCriterion("voyage like", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotLike(String value) {
            addCriterion("voyage not like", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageIn(List<String> values) {
            addCriterion("voyage in", values, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotIn(List<String> values) {
            addCriterion("voyage not in", values, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageBetween(String value1, String value2) {
            addCriterion("voyage between", value1, value2, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotBetween(String value1, String value2) {
            addCriterion("voyage not between", value1, value2, "voyage");
            return (Criteria) this;
        }

        public Criteria andServiceTermIsNull() {
            addCriterion("service_term is null");
            return (Criteria) this;
        }

        public Criteria andServiceTermIsNotNull() {
            addCriterion("service_term is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTermEqualTo(String value) {
            addCriterion("service_term =", value, "serviceTerm");
            return (Criteria) this;
        }

        public Criteria andServiceTermNotEqualTo(String value) {
            addCriterion("service_term <>", value, "serviceTerm");
            return (Criteria) this;
        }

        public Criteria andServiceTermGreaterThan(String value) {
            addCriterion("service_term >", value, "serviceTerm");
            return (Criteria) this;
        }

        public Criteria andServiceTermGreaterThanOrEqualTo(String value) {
            addCriterion("service_term >=", value, "serviceTerm");
            return (Criteria) this;
        }

        public Criteria andServiceTermLessThan(String value) {
            addCriterion("service_term <", value, "serviceTerm");
            return (Criteria) this;
        }

        public Criteria andServiceTermLessThanOrEqualTo(String value) {
            addCriterion("service_term <=", value, "serviceTerm");
            return (Criteria) this;
        }

        public Criteria andServiceTermLike(String value) {
            addCriterion("service_term like", value, "serviceTerm");
            return (Criteria) this;
        }

        public Criteria andServiceTermNotLike(String value) {
            addCriterion("service_term not like", value, "serviceTerm");
            return (Criteria) this;
        }

        public Criteria andServiceTermIn(List<String> values) {
            addCriterion("service_term in", values, "serviceTerm");
            return (Criteria) this;
        }

        public Criteria andServiceTermNotIn(List<String> values) {
            addCriterion("service_term not in", values, "serviceTerm");
            return (Criteria) this;
        }

        public Criteria andServiceTermBetween(String value1, String value2) {
            addCriterion("service_term between", value1, value2, "serviceTerm");
            return (Criteria) this;
        }

        public Criteria andServiceTermNotBetween(String value1, String value2) {
            addCriterion("service_term not between", value1, value2, "serviceTerm");
            return (Criteria) this;
        }

        public Criteria andEtdIsNull() {
            addCriterion("ETD is null");
            return (Criteria) this;
        }

        public Criteria andEtdIsNotNull() {
            addCriterion("ETD is not null");
            return (Criteria) this;
        }

        public Criteria andEtdEqualTo(Date value) {
            addCriterionForJDBCDate("ETD =", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdNotEqualTo(Date value) {
            addCriterionForJDBCDate("ETD <>", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdGreaterThan(Date value) {
            addCriterionForJDBCDate("ETD >", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ETD >=", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdLessThan(Date value) {
            addCriterionForJDBCDate("ETD <", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ETD <=", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdIn(List<Date> values) {
            addCriterionForJDBCDate("ETD in", values, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdNotIn(List<Date> values) {
            addCriterionForJDBCDate("ETD not in", values, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ETD between", value1, value2, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ETD not between", value1, value2, "etd");
            return (Criteria) this;
        }

        public Criteria andEtaIsNull() {
            addCriterion("ETA is null");
            return (Criteria) this;
        }

        public Criteria andEtaIsNotNull() {
            addCriterion("ETA is not null");
            return (Criteria) this;
        }

        public Criteria andEtaEqualTo(Date value) {
            addCriterionForJDBCDate("ETA =", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotEqualTo(Date value) {
            addCriterionForJDBCDate("ETA <>", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaGreaterThan(Date value) {
            addCriterionForJDBCDate("ETA >", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ETA >=", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaLessThan(Date value) {
            addCriterionForJDBCDate("ETA <", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ETA <=", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaIn(List<Date> values) {
            addCriterionForJDBCDate("ETA in", values, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotIn(List<Date> values) {
            addCriterionForJDBCDate("ETA not in", values, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ETA between", value1, value2, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ETA not between", value1, value2, "eta");
            return (Criteria) this;
        }

        public Criteria andCyOpeningDateIsNull() {
            addCriterion("CY_Opening_Date is null");
            return (Criteria) this;
        }

        public Criteria andCyOpeningDateIsNotNull() {
            addCriterion("CY_Opening_Date is not null");
            return (Criteria) this;
        }

        public Criteria andCyOpeningDateEqualTo(Date value) {
            addCriterionForJDBCDate("CY_Opening_Date =", value, "cyOpeningDate");
            return (Criteria) this;
        }

        public Criteria andCyOpeningDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CY_Opening_Date <>", value, "cyOpeningDate");
            return (Criteria) this;
        }

        public Criteria andCyOpeningDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CY_Opening_Date >", value, "cyOpeningDate");
            return (Criteria) this;
        }

        public Criteria andCyOpeningDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CY_Opening_Date >=", value, "cyOpeningDate");
            return (Criteria) this;
        }

        public Criteria andCyOpeningDateLessThan(Date value) {
            addCriterionForJDBCDate("CY_Opening_Date <", value, "cyOpeningDate");
            return (Criteria) this;
        }

        public Criteria andCyOpeningDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CY_Opening_Date <=", value, "cyOpeningDate");
            return (Criteria) this;
        }

        public Criteria andCyOpeningDateIn(List<Date> values) {
            addCriterionForJDBCDate("CY_Opening_Date in", values, "cyOpeningDate");
            return (Criteria) this;
        }

        public Criteria andCyOpeningDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CY_Opening_Date not in", values, "cyOpeningDate");
            return (Criteria) this;
        }

        public Criteria andCyOpeningDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CY_Opening_Date between", value1, value2, "cyOpeningDate");
            return (Criteria) this;
        }

        public Criteria andCyOpeningDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CY_Opening_Date not between", value1, value2, "cyOpeningDate");
            return (Criteria) this;
        }

        public Criteria andSiCutoffDateIsNull() {
            addCriterion("SI_cutoff_date is null");
            return (Criteria) this;
        }

        public Criteria andSiCutoffDateIsNotNull() {
            addCriterion("SI_cutoff_date is not null");
            return (Criteria) this;
        }

        public Criteria andSiCutoffDateEqualTo(Date value) {
            addCriterionForJDBCDate("SI_cutoff_date =", value, "siCutoffDate");
            return (Criteria) this;
        }

        public Criteria andSiCutoffDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SI_cutoff_date <>", value, "siCutoffDate");
            return (Criteria) this;
        }

        public Criteria andSiCutoffDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SI_cutoff_date >", value, "siCutoffDate");
            return (Criteria) this;
        }

        public Criteria andSiCutoffDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SI_cutoff_date >=", value, "siCutoffDate");
            return (Criteria) this;
        }

        public Criteria andSiCutoffDateLessThan(Date value) {
            addCriterionForJDBCDate("SI_cutoff_date <", value, "siCutoffDate");
            return (Criteria) this;
        }

        public Criteria andSiCutoffDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SI_cutoff_date <=", value, "siCutoffDate");
            return (Criteria) this;
        }

        public Criteria andSiCutoffDateIn(List<Date> values) {
            addCriterionForJDBCDate("SI_cutoff_date in", values, "siCutoffDate");
            return (Criteria) this;
        }

        public Criteria andSiCutoffDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SI_cutoff_date not in", values, "siCutoffDate");
            return (Criteria) this;
        }

        public Criteria andSiCutoffDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SI_cutoff_date between", value1, value2, "siCutoffDate");
            return (Criteria) this;
        }

        public Criteria andSiCutoffDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SI_cutoff_date not between", value1, value2, "siCutoffDate");
            return (Criteria) this;
        }

        public Criteria andCyClosingDateIsNull() {
            addCriterion("CY_closing_date is null");
            return (Criteria) this;
        }

        public Criteria andCyClosingDateIsNotNull() {
            addCriterion("CY_closing_date is not null");
            return (Criteria) this;
        }

        public Criteria andCyClosingDateEqualTo(Date value) {
            addCriterionForJDBCDate("CY_closing_date =", value, "cyClosingDate");
            return (Criteria) this;
        }

        public Criteria andCyClosingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CY_closing_date <>", value, "cyClosingDate");
            return (Criteria) this;
        }

        public Criteria andCyClosingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CY_closing_date >", value, "cyClosingDate");
            return (Criteria) this;
        }

        public Criteria andCyClosingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CY_closing_date >=", value, "cyClosingDate");
            return (Criteria) this;
        }

        public Criteria andCyClosingDateLessThan(Date value) {
            addCriterionForJDBCDate("CY_closing_date <", value, "cyClosingDate");
            return (Criteria) this;
        }

        public Criteria andCyClosingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CY_closing_date <=", value, "cyClosingDate");
            return (Criteria) this;
        }

        public Criteria andCyClosingDateIn(List<Date> values) {
            addCriterionForJDBCDate("CY_closing_date in", values, "cyClosingDate");
            return (Criteria) this;
        }

        public Criteria andCyClosingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CY_closing_date not in", values, "cyClosingDate");
            return (Criteria) this;
        }

        public Criteria andCyClosingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CY_closing_date between", value1, value2, "cyClosingDate");
            return (Criteria) this;
        }

        public Criteria andCyClosingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CY_closing_date not between", value1, value2, "cyClosingDate");
            return (Criteria) this;
        }

        public Criteria andCommodityIsNull() {
            addCriterion("commodity is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIsNotNull() {
            addCriterion("commodity is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityEqualTo(String value) {
            addCriterion("commodity =", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotEqualTo(String value) {
            addCriterion("commodity <>", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityGreaterThan(String value) {
            addCriterion("commodity >", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityGreaterThanOrEqualTo(String value) {
            addCriterion("commodity >=", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLessThan(String value) {
            addCriterion("commodity <", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLessThanOrEqualTo(String value) {
            addCriterion("commodity <=", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLike(String value) {
            addCriterion("commodity like", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotLike(String value) {
            addCriterion("commodity not like", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityIn(List<String> values) {
            addCriterion("commodity in", values, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotIn(List<String> values) {
            addCriterion("commodity not in", values, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityBetween(String value1, String value2) {
            addCriterion("commodity between", value1, value2, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotBetween(String value1, String value2) {
            addCriterion("commodity not between", value1, value2, "commodity");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceIsNull() {
            addCriterion("receipt_place is null");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceIsNotNull() {
            addCriterion("receipt_place is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceEqualTo(String value) {
            addCriterion("receipt_place =", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceNotEqualTo(String value) {
            addCriterion("receipt_place <>", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceGreaterThan(String value) {
            addCriterion("receipt_place >", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_place >=", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceLessThan(String value) {
            addCriterion("receipt_place <", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceLessThanOrEqualTo(String value) {
            addCriterion("receipt_place <=", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceLike(String value) {
            addCriterion("receipt_place like", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceNotLike(String value) {
            addCriterion("receipt_place not like", value, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceIn(List<String> values) {
            addCriterion("receipt_place in", values, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceNotIn(List<String> values) {
            addCriterion("receipt_place not in", values, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceBetween(String value1, String value2) {
            addCriterion("receipt_place between", value1, value2, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andReceiptPlaceNotBetween(String value1, String value2) {
            addCriterion("receipt_place not between", value1, value2, "receiptPlace");
            return (Criteria) this;
        }

        public Criteria andLodingPortIsNull() {
            addCriterion("Loding_port is null");
            return (Criteria) this;
        }

        public Criteria andLodingPortIsNotNull() {
            addCriterion("Loding_port is not null");
            return (Criteria) this;
        }

        public Criteria andLodingPortEqualTo(String value) {
            addCriterion("Loding_port =", value, "lodingPort");
            return (Criteria) this;
        }

        public Criteria andLodingPortNotEqualTo(String value) {
            addCriterion("Loding_port <>", value, "lodingPort");
            return (Criteria) this;
        }

        public Criteria andLodingPortGreaterThan(String value) {
            addCriterion("Loding_port >", value, "lodingPort");
            return (Criteria) this;
        }

        public Criteria andLodingPortGreaterThanOrEqualTo(String value) {
            addCriterion("Loding_port >=", value, "lodingPort");
            return (Criteria) this;
        }

        public Criteria andLodingPortLessThan(String value) {
            addCriterion("Loding_port <", value, "lodingPort");
            return (Criteria) this;
        }

        public Criteria andLodingPortLessThanOrEqualTo(String value) {
            addCriterion("Loding_port <=", value, "lodingPort");
            return (Criteria) this;
        }

        public Criteria andLodingPortLike(String value) {
            addCriterion("Loding_port like", value, "lodingPort");
            return (Criteria) this;
        }

        public Criteria andLodingPortNotLike(String value) {
            addCriterion("Loding_port not like", value, "lodingPort");
            return (Criteria) this;
        }

        public Criteria andLodingPortIn(List<String> values) {
            addCriterion("Loding_port in", values, "lodingPort");
            return (Criteria) this;
        }

        public Criteria andLodingPortNotIn(List<String> values) {
            addCriterion("Loding_port not in", values, "lodingPort");
            return (Criteria) this;
        }

        public Criteria andLodingPortBetween(String value1, String value2) {
            addCriterion("Loding_port between", value1, value2, "lodingPort");
            return (Criteria) this;
        }

        public Criteria andLodingPortNotBetween(String value1, String value2) {
            addCriterion("Loding_port not between", value1, value2, "lodingPort");
            return (Criteria) this;
        }

        public Criteria andDischangePortIsNull() {
            addCriterion("dischange_port is null");
            return (Criteria) this;
        }

        public Criteria andDischangePortIsNotNull() {
            addCriterion("dischange_port is not null");
            return (Criteria) this;
        }

        public Criteria andDischangePortEqualTo(String value) {
            addCriterion("dischange_port =", value, "dischangePort");
            return (Criteria) this;
        }

        public Criteria andDischangePortNotEqualTo(String value) {
            addCriterion("dischange_port <>", value, "dischangePort");
            return (Criteria) this;
        }

        public Criteria andDischangePortGreaterThan(String value) {
            addCriterion("dischange_port >", value, "dischangePort");
            return (Criteria) this;
        }

        public Criteria andDischangePortGreaterThanOrEqualTo(String value) {
            addCriterion("dischange_port >=", value, "dischangePort");
            return (Criteria) this;
        }

        public Criteria andDischangePortLessThan(String value) {
            addCriterion("dischange_port <", value, "dischangePort");
            return (Criteria) this;
        }

        public Criteria andDischangePortLessThanOrEqualTo(String value) {
            addCriterion("dischange_port <=", value, "dischangePort");
            return (Criteria) this;
        }

        public Criteria andDischangePortLike(String value) {
            addCriterion("dischange_port like", value, "dischangePort");
            return (Criteria) this;
        }

        public Criteria andDischangePortNotLike(String value) {
            addCriterion("dischange_port not like", value, "dischangePort");
            return (Criteria) this;
        }

        public Criteria andDischangePortIn(List<String> values) {
            addCriterion("dischange_port in", values, "dischangePort");
            return (Criteria) this;
        }

        public Criteria andDischangePortNotIn(List<String> values) {
            addCriterion("dischange_port not in", values, "dischangePort");
            return (Criteria) this;
        }

        public Criteria andDischangePortBetween(String value1, String value2) {
            addCriterion("dischange_port between", value1, value2, "dischangePort");
            return (Criteria) this;
        }

        public Criteria andDischangePortNotBetween(String value1, String value2) {
            addCriterion("dischange_port not between", value1, value2, "dischangePort");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceIsNull() {
            addCriterion("delivery_place is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceIsNotNull() {
            addCriterion("delivery_place is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceEqualTo(String value) {
            addCriterion("delivery_place =", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceNotEqualTo(String value) {
            addCriterion("delivery_place <>", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceGreaterThan(String value) {
            addCriterion("delivery_place >", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_place >=", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceLessThan(String value) {
            addCriterion("delivery_place <", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceLessThanOrEqualTo(String value) {
            addCriterion("delivery_place <=", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceLike(String value) {
            addCriterion("delivery_place like", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceNotLike(String value) {
            addCriterion("delivery_place not like", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceIn(List<String> values) {
            addCriterion("delivery_place in", values, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceNotIn(List<String> values) {
            addCriterion("delivery_place not in", values, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceBetween(String value1, String value2) {
            addCriterion("delivery_place between", value1, value2, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceNotBetween(String value1, String value2) {
            addCriterion("delivery_place not between", value1, value2, "deliveryPlace");
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