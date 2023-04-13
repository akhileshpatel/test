package com.adsway.log.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LogRecord {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "asset_owner_id")
	private long assetOwnerId;
	
	@Column(name = "asset_id")
	private long assetId;
	
	@Column(name = "asset_type")
	private int assetType;
	
	@Column(name = "log_text")
	private String logText;
	
	@Column(name = "can_edit")
	private boolean canEdit;
	
	@Column(name = "created_by_type")
	private int createdByType;
	
	@Column(name = "created_by_id")
	private long createdById;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "create_on")
	private Date createdOn;
	
	@Column(name = "updated_on")
	private Date updatedOn;

	public LogRecord() {
		super();
	}

	public LogRecord(long id, long assetOwnerId, long assetId, int assetType, String logText, boolean canEdit,
			int createdByType, long createdById, String createdBy, Date createdOn, Date updatedOn) {
		super();
		this.id = id;
		this.assetOwnerId = assetOwnerId;
		this.assetId = assetId;
		this.assetType = assetType;
		this.logText = logText;
		this.canEdit = canEdit;
		this.createdByType = createdByType;
		this.createdById = createdById;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAssetOwnerId() {
		return assetOwnerId;
	}

	public void setAssetOwnerId(long assetOwnerId) {
		this.assetOwnerId = assetOwnerId;
	}

	public long getAssetId() {
		return assetId;
	}

	public void setAssetId(long assetId) {
		this.assetId = assetId;
	}

	public int getAssetType() {
		return assetType;
	}

	public void setAssetType(int assetType) {
		this.assetType = assetType;
	}

	public String getLogText() {
		return logText;
	}

	public void setLogText(String logText) {
		this.logText = logText;
	}

	public boolean isCanEdit() {
		return canEdit;
	}

	public void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}

	public int getCreatedByType() {
		return createdByType;
	}

	public void setCreatedByType(int createdByType) {
		this.createdByType = createdByType;
	}

	public long getCreatedById() {
		return createdById;
	}

	public void setCreatedById(long createdById) {
		this.createdById = createdById;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	
}
