package com.kakarote.crm9.erp.work.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWorkTaskLog<M extends BaseWorkTaskLog<M>> extends Model<M> implements IBean {

	public void setLogId(Integer logId) {
		set("log_id", logId);
	}

	public Integer getLogId() {
		return getInt("log_id");
	}

	public void setUserId(Integer userId) {
		set("user_id", userId);
	}

	public Integer getUserId() {
		return getInt("user_id");
	}

	public void setContent(String content) {
		set("content", content);
	}

	public String getContent() {
		return getStr("content");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setStatus(Integer status) {
		set("status", status);
	}

	public Integer getStatus() {
		return getInt("status");
	}

	public void setTaskId(Integer taskId) {
		set("task_id", taskId);
	}

	public Integer getTaskId() {
		return getInt("task_id");
	}

	public void setWorkId(Integer workId) {
		set("work_id", workId);
	}

	public Integer getWorkId() {
		return getInt("work_id");
	}

}
