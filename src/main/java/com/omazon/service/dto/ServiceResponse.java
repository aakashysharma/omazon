package com.omazon.service.dto;

public class ServiceResponse {
	
	private ServiceStatus status;			
	private IsDTO dto;
	private DTOType dtoType;
	
	public ServiceStatus getStatus() {
		return status;
	}
	public void setStatus(ServiceStatus status) {
		this.status = status;
	}
	public IsDTO getDto() {
		return dto;
	}
	public void setDto(IsDTO dto) {
		this.dto = dto;
	}
	public DTOType getDtoType() {
		return dtoType;
	}
	public void setDtoType(DTOType dtoType) {
		this.dtoType = dtoType;
	}	
}
