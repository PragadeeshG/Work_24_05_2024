package com.test1;

public class CountryDataRendering {
	private String countryCode;
	private String renderingId;
	private String isPrimary;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CountryDataRendering() {

	}

	public CountryDataRendering(String countryCode, String renderingId, String isPrimary, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.countryCode = countryCode;
		this.renderingId = renderingId;
		this.isPrimary = isPrimary;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getRenderingId() {
		return renderingId;
	}

	public void setRenderingId(String renderingId) {
		this.renderingId = renderingId;
	}

	public String getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
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
