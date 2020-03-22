package com.springcloud.example.entity;

import java.util.Date;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
public class CoreSysDate {
    /**
     * 主键编码
     */
    private Long oid;

    /**
     * 项目编码
     */
    private String projectCode;

    /**
     * 核心日期
     */
    private Date coreSysDate;

    /**
     * 跑批状态 核心状态 跑批准备、跑批中、正常
     */
    private String coreSysStatus;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    public static final String COL_OID = "oid";

    public static final String COL_PROJECT_CODE = "project_code";

    public static final String COL_CORE_SYS_DATE = "core_sys_date";

    public static final String COL_CORE_SYS_STATUS = "core_sys_status";

    public static final String COL_CREATE_BY = "create_by";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_BY = "update_by";

    public static final String COL_UPDATE_TIME = "update_time";

    /**
     * 获取主键编码
     *
     * @return oid - 主键编码
     */
    public Long getOid() {
        return oid;
    }

    /**
     * 设置主键编码
     *
     * @param oid 主键编码
     */
    public void setOid(Long oid) {
        this.oid = oid;
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
     * 获取核心日期
     *
     * @return core_sys_date - 核心日期
     */
    public Date getCoreSysDate() {
        return coreSysDate;
    }

    /**
     * 设置核心日期
     *
     * @param coreSysDate 核心日期
     */
    public void setCoreSysDate(Date coreSysDate) {
        this.coreSysDate = coreSysDate;
    }

    /**
     * 获取跑批状态 核心状态 跑批准备、跑批中、正常
     *
     * @return core_sys_status - 跑批状态 核心状态 跑批准备、跑批中、正常
     */
    public String getCoreSysStatus() {
        return coreSysStatus;
    }

    /**
     * 设置跑批状态 核心状态 跑批准备、跑批中、正常
     *
     * @param coreSysStatus 跑批状态 核心状态 跑批准备、跑批中、正常
     */
    public void setCoreSysStatus(String coreSysStatus) {
        this.coreSysStatus = coreSysStatus;
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
     * 获取更新人
     *
     * @return update_by - 更新人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新人
     *
     * @param updateBy 更新人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
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
}