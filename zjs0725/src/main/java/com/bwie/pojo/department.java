package com.bwie.pojo;

import java.util.List;

public class department {
    private Integer did;

    private String dname;
    
    private List<employee> employee;
    
    @Override
	public String toString() {
		return "department [did=" + did + ", dname=" + dname + ", employee="
				+ employee + "]";
	}

	public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }
    
	public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }
	
	public List<employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<employee> employee) {
		this.employee = employee;
	}
	
	
}