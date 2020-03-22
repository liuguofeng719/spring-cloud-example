package com.springcloud.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
@TableName(value = "asset")
public class Asset {
    /**
     * 自增长ID
     */
    @TableId(value = "asset_id", type = IdType.AUTO)
    private Long assetId;

    /**
     * 资产编号
     */
    @TableField(value = "asset_no")
    private String assetNo;

    /**
     * 借款人账户ID
     */
    @TableField(value = "borrower")
    private String borrower;

    /**
     * 还款人账户ID
     */
    @TableField(value = "repayer")
    private String repayer;

    /**
     * 项目编码
     */
    @TableField(value = "project_code")
    private String projectCode;

    /**
     * 来源系统
     */
    @TableField(value = "from_system")
    private String fromSystem;

    /**
     * 产品编码
     */
    @TableField(value = "product_no")
    private String productNo;

    /**
     * 合同编号
     */
    @TableField(value = "contract_no")
    private String contractNo;

    /**
     * 行内借据号
     */
    @TableField(value = "capital_debt_no")
    private String capitalDebtNo;

    /**
     * 总期次
     */
    @TableField(value = "total_term")
    private Integer totalTerm;

    /**
     * 贷款用途
     */
    @TableField(value = "loan_usage")
    private String loanUsage;

    /**
     * 本金年利率
     */
    @TableField(value = "year_rate")
    private BigDecimal yearRate;

    /**
     * 本金月利率
     */
    @TableField(value = "month_rate")
    private BigDecimal monthRate;

    /**
     * 本金日利率
     */
    @TableField(value = "day_rate")
    private BigDecimal dayRate;

    /**
     * 逾期年利率上浮
     */
    @TableField(value = "ovd_year_rate")
    private BigDecimal ovdYearRate;

    /**
     * 逾期月利率上浮
     */
    @TableField(value = "ovd_month_rate")
    private BigDecimal ovdMonthRate;

    /**
     * 逾期日利率上浮
     */
    @TableField(value = "ovd_day_rate")
    private BigDecimal ovdDayRate;

    /**
     * 宽限期类型 按日宽限期、宽限到月底
     */
    @TableField(value = "grace_type")
    private String graceType;

    /**
     * 宽限期天数
     */
    @TableField(value = "grace_day")
    private Integer graceDay;

    /**
     * 计息方式
     */
    @TableField(value = "int_calc_type")
    private String intCalcType;

    /**
     * 放款本金
     */
    @TableField(value = "prin_amt")
    private Long prinAmt;

    /**
     * 到期应收总利息
     */
    @TableField(value = "total_int_amt")
    private Integer totalIntAmt;

    /**
     * 当前本金利息
     */
    @TableField(value = "int_amt")
    private Long intAmt;

    /**
     * 当前宽限期利息
     */
    @TableField(value = "grace_int_amt")
    private Long graceIntAmt;

    /**
     * 当前逾期本金利息 汇总所有期次的逾期本金利息余额
     */
    @TableField(value = "ovd_prin_int_amt")
    private Long ovdPrinIntAmt;

    /**
     * 已还本金
     */
    @TableField(value = "paid_prin_amt")
    private Long paidPrinAmt;

    /**
     * 已还利息
     */
    @TableField(value = "paid_int_amt")
    private Long paidIntAmt;

    /**
     * 已还宽限期利息
     */
    @TableField(value = "paid_grace_int_amt")
    private Long paidGraceIntAmt;

    /**
     * 已还逾期本金利息
     */
    @TableField(value = "paid_ovd_prin_int_amt")
    private Long paidOvdPrinIntAmt;

    /**
     * 资产当前总金额 本金+当前利息+当前宽限期利息+当前逾期本金利息
     */
    @TableField(value = "total_amt")
    private Long totalAmt;

    /**
     * 资产已还总金额 已还本金+已还利息+已还宽限期利息+已还逾期利息
     */
    @TableField(value = "total_paid_amt")
    private Long totalPaidAmt;

    /**
     * 资产优惠减免金额
     */
    @TableField(value = "total_exempt_amt")
    private Long totalExemptAmt;

    /**
     * 逾期天数
     */
    @TableField(value = "ovd_day")
    private Integer ovdDay;

    /**
     * 资产状态
     */
    @TableField(value = "asset_status")
    private String assetStatus;

    /**
     * 五级分类标识
     */
    @TableField(value = "asset_class")
    private String assetClass;

    /**
     * 逾期状态
     */
    @TableField(value = "ovd_status")
    private String ovdStatus;

    /**
     * 应计状态
     */
    @TableField(value = "accrued_status")
    private String accruedStatus;

    /**
     * 开始生效时间
     */
    @TableField(value = "start_date")
    private Date startDate;

    /**
     * 借款到期时间
     */
    @TableField(value = "end_date")
    private Date endDate;

    /**
     * 申请时间
     */
    @TableField(value = "apply_time")
    private Date applyTime;

    /**
     * 实际放款时间
     */
    @TableField(value = "actual_loan_time")
    private Date actualLoanTime;

    /**
     * 结清时间
     */
    @TableField(value = "payoff_time")
    private Date payoffTime;

    @TableField(value = "call_back_url")
    private String callBackUrl;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    private String createBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 修改人
     */
    @TableField(value = "update_by")
    private String updateBy;

    public static final String COL_ASSET_ID = "asset_id";

    public static final String COL_ASSET_NO = "asset_no";

    public static final String COL_BORROWER = "borrower";

    public static final String COL_REPAYER = "repayer";

    public static final String COL_PROJECT_CODE = "project_code";

    public static final String COL_FROM_SYSTEM = "from_system";

    public static final String COL_PRODUCT_NO = "product_no";

    public static final String COL_CONTRACT_NO = "contract_no";

    public static final String COL_CAPITAL_DEBT_NO = "capital_debt_no";

    public static final String COL_TOTAL_TERM = "total_term";

    public static final String COL_LOAN_USAGE = "loan_usage";

    public static final String COL_YEAR_RATE = "year_rate";

    public static final String COL_MONTH_RATE = "month_rate";

    public static final String COL_DAY_RATE = "day_rate";

    public static final String COL_OVD_YEAR_RATE = "ovd_year_rate";

    public static final String COL_OVD_MONTH_RATE = "ovd_month_rate";

    public static final String COL_OVD_DAY_RATE = "ovd_day_rate";

    public static final String COL_GRACE_TYPE = "grace_type";

    public static final String COL_GRACE_DAY = "grace_day";

    public static final String COL_INT_CALC_TYPE = "int_calc_type";

    public static final String COL_PRIN_AMT = "prin_amt";

    public static final String COL_TOTAL_INT_AMT = "total_int_amt";

    public static final String COL_INT_AMT = "int_amt";

    public static final String COL_GRACE_INT_AMT = "grace_int_amt";

    public static final String COL_OVD_PRIN_INT_AMT = "ovd_prin_int_amt";

    public static final String COL_PAID_PRIN_AMT = "paid_prin_amt";

    public static final String COL_PAID_INT_AMT = "paid_int_amt";

    public static final String COL_PAID_GRACE_INT_AMT = "paid_grace_int_amt";

    public static final String COL_PAID_OVD_PRIN_INT_AMT = "paid_ovd_prin_int_amt";

    public static final String COL_TOTAL_AMT = "total_amt";

    public static final String COL_TOTAL_PAID_AMT = "total_paid_amt";

    public static final String COL_TOTAL_EXEMPT_AMT = "total_exempt_amt";

    public static final String COL_OVD_DAY = "ovd_day";

    public static final String COL_ASSET_STATUS = "asset_status";

    public static final String COL_ASSET_CLASS = "asset_class";

    public static final String COL_OVD_STATUS = "ovd_status";

    public static final String COL_ACCRUED_STATUS = "accrued_status";

    public static final String COL_START_DATE = "start_date";

    public static final String COL_END_DATE = "end_date";

    public static final String COL_APPLY_TIME = "apply_time";

    public static final String COL_ACTUAL_LOAN_TIME = "actual_loan_time";

    public static final String COL_PAYOFF_TIME = "payoff_time";

    public static final String COL_CALL_BACK_URL = "call_back_url";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CREATE_BY = "create_by";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_UPDATE_BY = "update_by";

    /**
     * 获取自增长ID
     *
     * @return asset_id - 自增长ID
     */
    public Long getAssetId() {
        return assetId;
    }

    /**
     * 设置自增长ID
     *
     * @param assetId 自增长ID
     */
    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    /**
     * 获取资产编号
     *
     * @return asset_no - 资产编号
     */
    public String getAssetNo() {
        return assetNo;
    }

    /**
     * 设置资产编号
     *
     * @param assetNo 资产编号
     */
    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo;
    }

    /**
     * 获取借款人账户ID
     *
     * @return borrower - 借款人账户ID
     */
    public String getBorrower() {
        return borrower;
    }

    /**
     * 设置借款人账户ID
     *
     * @param borrower 借款人账户ID
     */
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    /**
     * 获取还款人账户ID
     *
     * @return repayer - 还款人账户ID
     */
    public String getRepayer() {
        return repayer;
    }

    /**
     * 设置还款人账户ID
     *
     * @param repayer 还款人账户ID
     */
    public void setRepayer(String repayer) {
        this.repayer = repayer;
    }

    /**
     * 获取项目编码
     *
     * @return project_code - 项目编码
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * 设置项目编码
     *
     * @param projectCode 项目编码
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    /**
     * 获取来源系统
     *
     * @return from_system - 来源系统
     */
    public String getFromSystem() {
        return fromSystem;
    }

    /**
     * 设置来源系统
     *
     * @param fromSystem 来源系统
     */
    public void setFromSystem(String fromSystem) {
        this.fromSystem = fromSystem;
    }

    /**
     * 获取产品编码
     *
     * @return product_no - 产品编码
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * 设置产品编码
     *
     * @param productNo 产品编码
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    /**
     * 获取合同编号
     *
     * @return contract_no - 合同编号
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * 设置合同编号
     *
     * @param contractNo 合同编号
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    /**
     * 获取行内借据号
     *
     * @return capital_debt_no - 行内借据号
     */
    public String getCapitalDebtNo() {
        return capitalDebtNo;
    }

    /**
     * 设置行内借据号
     *
     * @param capitalDebtNo 行内借据号
     */
    public void setCapitalDebtNo(String capitalDebtNo) {
        this.capitalDebtNo = capitalDebtNo;
    }

    /**
     * 获取总期次
     *
     * @return total_term - 总期次
     */
    public Integer getTotalTerm() {
        return totalTerm;
    }

    /**
     * 设置总期次
     *
     * @param totalTerm 总期次
     */
    public void setTotalTerm(Integer totalTerm) {
        this.totalTerm = totalTerm;
    }

    /**
     * 获取贷款用途
     *
     * @return loan_usage - 贷款用途
     */
    public String getLoanUsage() {
        return loanUsage;
    }

    /**
     * 设置贷款用途
     *
     * @param loanUsage 贷款用途
     */
    public void setLoanUsage(String loanUsage) {
        this.loanUsage = loanUsage;
    }

    /**
     * 获取本金年利率
     *
     * @return year_rate - 本金年利率
     */
    public BigDecimal getYearRate() {
        return yearRate;
    }

    /**
     * 设置本金年利率
     *
     * @param yearRate 本金年利率
     */
    public void setYearRate(BigDecimal yearRate) {
        this.yearRate = yearRate;
    }

    /**
     * 获取本金月利率
     *
     * @return month_rate - 本金月利率
     */
    public BigDecimal getMonthRate() {
        return monthRate;
    }

    /**
     * 设置本金月利率
     *
     * @param monthRate 本金月利率
     */
    public void setMonthRate(BigDecimal monthRate) {
        this.monthRate = monthRate;
    }

    /**
     * 获取本金日利率
     *
     * @return day_rate - 本金日利率
     */
    public BigDecimal getDayRate() {
        return dayRate;
    }

    /**
     * 设置本金日利率
     *
     * @param dayRate 本金日利率
     */
    public void setDayRate(BigDecimal dayRate) {
        this.dayRate = dayRate;
    }

    /**
     * 获取逾期年利率上浮
     *
     * @return ovd_year_rate - 逾期年利率上浮
     */
    public BigDecimal getOvdYearRate() {
        return ovdYearRate;
    }

    /**
     * 设置逾期年利率上浮
     *
     * @param ovdYearRate 逾期年利率上浮
     */
    public void setOvdYearRate(BigDecimal ovdYearRate) {
        this.ovdYearRate = ovdYearRate;
    }

    /**
     * 获取逾期月利率上浮
     *
     * @return ovd_month_rate - 逾期月利率上浮
     */
    public BigDecimal getOvdMonthRate() {
        return ovdMonthRate;
    }

    /**
     * 设置逾期月利率上浮
     *
     * @param ovdMonthRate 逾期月利率上浮
     */
    public void setOvdMonthRate(BigDecimal ovdMonthRate) {
        this.ovdMonthRate = ovdMonthRate;
    }

    /**
     * 获取逾期日利率上浮
     *
     * @return ovd_day_rate - 逾期日利率上浮
     */
    public BigDecimal getOvdDayRate() {
        return ovdDayRate;
    }

    /**
     * 设置逾期日利率上浮
     *
     * @param ovdDayRate 逾期日利率上浮
     */
    public void setOvdDayRate(BigDecimal ovdDayRate) {
        this.ovdDayRate = ovdDayRate;
    }

    /**
     * 获取宽限期类型 按日宽限期、宽限到月底
     *
     * @return grace_type - 宽限期类型 按日宽限期、宽限到月底
     */
    public String getGraceType() {
        return graceType;
    }

    /**
     * 设置宽限期类型 按日宽限期、宽限到月底
     *
     * @param graceType 宽限期类型 按日宽限期、宽限到月底
     */
    public void setGraceType(String graceType) {
        this.graceType = graceType;
    }

    /**
     * 获取宽限期天数
     *
     * @return grace_day - 宽限期天数
     */
    public Integer getGraceDay() {
        return graceDay;
    }

    /**
     * 设置宽限期天数
     *
     * @param graceDay 宽限期天数
     */
    public void setGraceDay(Integer graceDay) {
        this.graceDay = graceDay;
    }

    /**
     * 获取计息方式
     *
     * @return int_calc_type - 计息方式
     */
    public String getIntCalcType() {
        return intCalcType;
    }

    /**
     * 设置计息方式
     *
     * @param intCalcType 计息方式
     */
    public void setIntCalcType(String intCalcType) {
        this.intCalcType = intCalcType;
    }

    /**
     * 获取放款本金
     *
     * @return prin_amt - 放款本金
     */
    public Long getPrinAmt() {
        return prinAmt;
    }

    /**
     * 设置放款本金
     *
     * @param prinAmt 放款本金
     */
    public void setPrinAmt(Long prinAmt) {
        this.prinAmt = prinAmt;
    }

    /**
     * 获取到期应收总利息
     *
     * @return total_int_amt - 到期应收总利息
     */
    public Integer getTotalIntAmt() {
        return totalIntAmt;
    }

    /**
     * 设置到期应收总利息
     *
     * @param totalIntAmt 到期应收总利息
     */
    public void setTotalIntAmt(Integer totalIntAmt) {
        this.totalIntAmt = totalIntAmt;
    }

    /**
     * 获取当前本金利息
     *
     * @return int_amt - 当前本金利息
     */
    public Long getIntAmt() {
        return intAmt;
    }

    /**
     * 设置当前本金利息
     *
     * @param intAmt 当前本金利息
     */
    public void setIntAmt(Long intAmt) {
        this.intAmt = intAmt;
    }

    /**
     * 获取当前宽限期利息
     *
     * @return grace_int_amt - 当前宽限期利息
     */
    public Long getGraceIntAmt() {
        return graceIntAmt;
    }

    /**
     * 设置当前宽限期利息
     *
     * @param graceIntAmt 当前宽限期利息
     */
    public void setGraceIntAmt(Long graceIntAmt) {
        this.graceIntAmt = graceIntAmt;
    }

    /**
     * 获取当前逾期本金利息 汇总所有期次的逾期本金利息余额
     *
     * @return ovd_prin_int_amt - 当前逾期本金利息 汇总所有期次的逾期本金利息余额
     */
    public Long getOvdPrinIntAmt() {
        return ovdPrinIntAmt;
    }

    /**
     * 设置当前逾期本金利息 汇总所有期次的逾期本金利息余额
     *
     * @param ovdPrinIntAmt 当前逾期本金利息 汇总所有期次的逾期本金利息余额
     */
    public void setOvdPrinIntAmt(Long ovdPrinIntAmt) {
        this.ovdPrinIntAmt = ovdPrinIntAmt;
    }

    /**
     * 获取已还本金
     *
     * @return paid_prin_amt - 已还本金
     */
    public Long getPaidPrinAmt() {
        return paidPrinAmt;
    }

    /**
     * 设置已还本金
     *
     * @param paidPrinAmt 已还本金
     */
    public void setPaidPrinAmt(Long paidPrinAmt) {
        this.paidPrinAmt = paidPrinAmt;
    }

    /**
     * 获取已还利息
     *
     * @return paid_int_amt - 已还利息
     */
    public Long getPaidIntAmt() {
        return paidIntAmt;
    }

    /**
     * 设置已还利息
     *
     * @param paidIntAmt 已还利息
     */
    public void setPaidIntAmt(Long paidIntAmt) {
        this.paidIntAmt = paidIntAmt;
    }

    /**
     * 获取已还宽限期利息
     *
     * @return paid_grace_int_amt - 已还宽限期利息
     */
    public Long getPaidGraceIntAmt() {
        return paidGraceIntAmt;
    }

    /**
     * 设置已还宽限期利息
     *
     * @param paidGraceIntAmt 已还宽限期利息
     */
    public void setPaidGraceIntAmt(Long paidGraceIntAmt) {
        this.paidGraceIntAmt = paidGraceIntAmt;
    }

    /**
     * 获取已还逾期本金利息
     *
     * @return paid_ovd_prin_int_amt - 已还逾期本金利息
     */
    public Long getPaidOvdPrinIntAmt() {
        return paidOvdPrinIntAmt;
    }

    /**
     * 设置已还逾期本金利息
     *
     * @param paidOvdPrinIntAmt 已还逾期本金利息
     */
    public void setPaidOvdPrinIntAmt(Long paidOvdPrinIntAmt) {
        this.paidOvdPrinIntAmt = paidOvdPrinIntAmt;
    }

    /**
     * 获取资产当前总金额 本金+当前利息+当前宽限期利息+当前逾期本金利息
     *
     * @return total_amt - 资产当前总金额 本金+当前利息+当前宽限期利息+当前逾期本金利息
     */
    public Long getTotalAmt() {
        return totalAmt;
    }

    /**
     * 设置资产当前总金额 本金+当前利息+当前宽限期利息+当前逾期本金利息
     *
     * @param totalAmt 资产当前总金额 本金+当前利息+当前宽限期利息+当前逾期本金利息
     */
    public void setTotalAmt(Long totalAmt) {
        this.totalAmt = totalAmt;
    }

    /**
     * 获取资产已还总金额 已还本金+已还利息+已还宽限期利息+已还逾期利息
     *
     * @return total_paid_amt - 资产已还总金额 已还本金+已还利息+已还宽限期利息+已还逾期利息
     */
    public Long getTotalPaidAmt() {
        return totalPaidAmt;
    }

    /**
     * 设置资产已还总金额 已还本金+已还利息+已还宽限期利息+已还逾期利息
     *
     * @param totalPaidAmt 资产已还总金额 已还本金+已还利息+已还宽限期利息+已还逾期利息
     */
    public void setTotalPaidAmt(Long totalPaidAmt) {
        this.totalPaidAmt = totalPaidAmt;
    }

    /**
     * 获取资产优惠减免金额
     *
     * @return total_exempt_amt - 资产优惠减免金额
     */
    public Long getTotalExemptAmt() {
        return totalExemptAmt;
    }

    /**
     * 设置资产优惠减免金额
     *
     * @param totalExemptAmt 资产优惠减免金额
     */
    public void setTotalExemptAmt(Long totalExemptAmt) {
        this.totalExemptAmt = totalExemptAmt;
    }

    /**
     * 获取逾期天数
     *
     * @return ovd_day - 逾期天数
     */
    public Integer getOvdDay() {
        return ovdDay;
    }

    /**
     * 设置逾期天数
     *
     * @param ovdDay 逾期天数
     */
    public void setOvdDay(Integer ovdDay) {
        this.ovdDay = ovdDay;
    }

    /**
     * 获取资产状态
     *
     * @return asset_status - 资产状态
     */
    public String getAssetStatus() {
        return assetStatus;
    }

    /**
     * 设置资产状态
     *
     * @param assetStatus 资产状态
     */
    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
    }

    /**
     * 获取五级分类标识
     *
     * @return asset_class - 五级分类标识
     */
    public String getAssetClass() {
        return assetClass;
    }

    /**
     * 设置五级分类标识
     *
     * @param assetClass 五级分类标识
     */
    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    /**
     * 获取逾期状态
     *
     * @return ovd_status - 逾期状态
     */
    public String getOvdStatus() {
        return ovdStatus;
    }

    /**
     * 设置逾期状态
     *
     * @param ovdStatus 逾期状态
     */
    public void setOvdStatus(String ovdStatus) {
        this.ovdStatus = ovdStatus;
    }

    /**
     * 获取应计状态
     *
     * @return accrued_status - 应计状态
     */
    public String getAccruedStatus() {
        return accruedStatus;
    }

    /**
     * 设置应计状态
     *
     * @param accruedStatus 应计状态
     */
    public void setAccruedStatus(String accruedStatus) {
        this.accruedStatus = accruedStatus;
    }

    /**
     * 获取开始生效时间
     *
     * @return start_date - 开始生效时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始生效时间
     *
     * @param startDate 开始生效时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取借款到期时间
     *
     * @return end_date - 借款到期时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置借款到期时间
     *
     * @param endDate 借款到期时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取申请时间
     *
     * @return apply_time - 申请时间
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * 设置申请时间
     *
     * @param applyTime 申请时间
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * 获取实际放款时间
     *
     * @return actual_loan_time - 实际放款时间
     */
    public Date getActualLoanTime() {
        return actualLoanTime;
    }

    /**
     * 设置实际放款时间
     *
     * @param actualLoanTime 实际放款时间
     */
    public void setActualLoanTime(Date actualLoanTime) {
        this.actualLoanTime = actualLoanTime;
    }

    /**
     * 获取结清时间
     *
     * @return payoff_time - 结清时间
     */
    public Date getPayoffTime() {
        return payoffTime;
    }

    /**
     * 设置结清时间
     *
     * @param payoffTime 结清时间
     */
    public void setPayoffTime(Date payoffTime) {
        this.payoffTime = payoffTime;
    }

    /**
     * @return call_back_url
     */
    public String getCallBackUrl() {
        return callBackUrl;
    }

    /**
     * @param callBackUrl
     */
    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取修改人
     *
     * @return update_by - 修改人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置修改人
     *
     * @param updateBy 修改人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}