package com.kakarote.crm9.erp.admin.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAdminExamineRecord<M extends BaseAdminExamineRecord<M>> extends Model<M> implements IBean {

	public M setRecordId(Integer recordId) {
		set("record_id", recordId);
		return (M)this;
	}

	public Integer getRecordId() {
		return getInt("record_id");
	}

	public M setExamineId(Integer examineId) {
		set("examine_id", examineId);
		return (M)this;
	}

	public Integer getExamineId() {
		return getInt("examine_id");
	}

	public M setExamineStepId(Long examineStepId) {
		set("examine_step_id", examineStepId);
		return (M)this;
	}

	public Long getExamineStepId() {
		return getLong("examine_step_id");
	}

	public M setExamineStatus(Integer examineStatus) {
		set("examine_status", examineStatus);
		return (M)this;
	}

	public Integer getExamineStatus() {
		return getInt("examine_status");
	}

	public M setCreateUser(Long createUser) {
		set("create_user", createUser);
		return (M)this;
	}

	public Long getCreateUser() {
		return getLong("create_user");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public M setRemarks(String remarks) {
		set("remarks", remarks);
		return (M)this;
	}

	public String getRemarks() {
		return getStr("remarks");
	}

}
