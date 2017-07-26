package com.bwie.pojo;

public class employee {
    private Integer eid;

    private String ename;

    private Integer level;

    private Integer dId;
    
    private department department;
    
    @Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + ", level=" + level
				+ ", dId=" + dId + ", department=" + department + "]";
	}

	public department getDepartment() {
		return department;
	}

	public void setDepartment(department department) {
		this.department = department;
	}

	public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
}