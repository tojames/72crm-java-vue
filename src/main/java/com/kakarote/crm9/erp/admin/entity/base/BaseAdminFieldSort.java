package com.kakarote.crm9.erp.admin.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAdminFieldSort<M extends BaseAdminFieldSort<M>> extends Model<M> implements IBean {

	public BaseAdminFieldSort setId(java.lang.Integer id) {
		set("id", id);
		return this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public BaseAdminFieldSort setLabel(java.lang.Integer label) {
		set("label", label);
		return this;
	}
	
	public java.lang.Integer getLabel() {
		return getInt("label");
	}

	public BaseAdminFieldSort setFieldName(java.lang.String fieldName) {
		set("field_name", fieldName);
		return this;
	}
	
	public java.lang.String getFieldName() {
		return getStr("field_name");
	}

	public BaseAdminFieldSort setName(java.lang.String name) {
		set("name", name);
		return this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

    public BaseAdminFieldSort setType(Integer type) {
        set("type", type);
		return this;
	}

    public Integer getType() {
        return getInt("type");
    }

    public BaseAdminFieldSort setSort(Integer sort) {
        set("sort", sort);
        return  this;
    }

    public Integer getSort() {
        return getInt("sort");
    }

	public BaseAdminFieldSort setUserId(java.lang.Long userId) {
		set("user_id", userId);
		return this;
	}
	
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

	public BaseAdminFieldSort setIsHide(java.lang.Integer isHide) {
		set("is_hide", isHide);
		return this;
	}
	
	public java.lang.Integer getIsHide() {
		return getInt("is_hide");
	}

	public BaseAdminFieldSort setFieldId(java.lang.Integer fieldId) {
		set("field_id", fieldId);
		return this;
	}
	
	public java.lang.Integer getFieldId() {
		return getInt("field_id");
	}

}
