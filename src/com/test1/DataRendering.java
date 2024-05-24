package com.test1;

public class DataRendering {
	private long renderingId;
	private String renderingName;
	private String renderingType;
	private String renderingBehaviour;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataRendering() {

	}

	public DataRendering(long renderingId, String renderingName, String renderingType, String renderingBehaviour,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.renderingId = renderingId;
		this.renderingName = renderingName;
		this.renderingType = renderingType;
		this.renderingBehaviour = renderingBehaviour;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getRenderingId() {
		return renderingId;
	}

	public void setRenderingId(long renderingId) {
		this.renderingId = renderingId;
	}

	public String getRenderingName() {
		return renderingName;
	}

	public void setRenderingName(String renderingName) {
		this.renderingName = renderingName;
	}

	public String getRenderingType() {
		return renderingType;
	}

	public void setRenderingType(String renderingType) {
		this.renderingType = renderingType;
	}

	public String getRenderingBehaviour() {
		return renderingBehaviour;
	}

	public void setRenderingBehaviour(String renderingBehaviour) {
		this.renderingBehaviour = renderingBehaviour;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
