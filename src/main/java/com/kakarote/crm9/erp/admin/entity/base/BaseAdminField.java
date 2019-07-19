package com.kakarote.crm9.erp.admin.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAdminField<M extends BaseAdminField<M>> extends Model<M> implements IBean {

	public void setFieldId(java.lang.Integer fieldId) {
		set("field_id", fieldId);
	}

	public java.lang.Integer getFieldId() {
		return getInt("field_id");
	}

	public void setFieldName(java.lang.String fieldName) {
		set("field_name", fieldName);
	}

	public java.lang.String getFieldName() {
		return getStr("field_name");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return getStr("name");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}

	public java.lang.Integer getType() {
		return getInt("type");
	}

	public void setLabel(java.lang.Integer label) {
		set("label", label);
	}

	public java.lang.Integer getLabel() {
		return getInt("label");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public void setInputTips(java.lang.String inputTips) {
		set("input_tips", inputTips);
	}

	public java.lang.String getInputTips() {
		return getStr("input_tips");
	}

	public void setMaxLength(java.lang.Integer maxLength) {
		set("max_length", maxLength);
	}

	public java.lang.Integer getMaxLength() {
		return getInt("max_length");
	}

	public void setDefaultValue(java.lang.String defaultValue) {
		set("default_value", defaultValue);
	}

	public java.lang.String getDefaultValue() {
		return getStr("default_value");
	}

	public void setIsUnique(java.lang.Integer isUnique) {
		set("is_unique", isUnique);
	}

	public java.lang.Integer getIsUnique() {
		return getInt("is_unique");
	}

	public void setIsNull(java.lang.Integer isNull) {
		set("is_null", isNull);
	}

	public java.lang.Integer getIsNull() {
		return getInt("is_null");
	}

	public void setSorting(java.lang.Integer sorting) {
		set("sorting", sorting);
	}

	public java.lang.Integer getSorting() {
		return getInt("sorting");
	}

	public void setOptions(java.lang.String options) {
		set("options", options);
	}

	public java.lang.String getOptions() {
		return getStr("options");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public java.lang.Integer getOperating() {
		return getInt("operating");
	}

	public void setOperating(java.lang.Integer operating) {
		set("operating", operating);
	}

	public void setExamineCategoryId(java.lang.Integer examineCategoryId) {
		set("examine_category_id", examineCategoryId);
	}
	public java.lang.Integer getExamineCategoryId() {
		return getInt("examine_category_id");
	}

	public void setFieldType(java.lang.Integer fieldType) {
		set("field_type", fieldType);
	}

	public java.lang.Integer getFieldType() {
		return getInt("field_type");
	}
}
