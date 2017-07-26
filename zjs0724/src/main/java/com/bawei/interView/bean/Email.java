package com.bawei.interView.bean;

import java.util.Date;

public class Email {
    private Integer sendId;

    private String sendName;

    private Integer sendRead;

    private String sendTitle;

    private Date sendTime;

    @Override
	public String toString() {
		return "Email [sendId=" + sendId + ", sendName=" + sendName
				+ ", sendRead=" + sendRead + ", sendTitle=" + sendTitle
				+ ", sendTime=" + sendTime + "]";
	}

	public Integer getSendId() {
        return sendId;
    }

    public void setSendId(Integer sendId) {
        this.sendId = sendId;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName == null ? null : sendName.trim();
    }

    public Integer getSendRead() {
        return sendRead;
    }

    public void setSendRead(Integer sendRead) {
        this.sendRead = sendRead;
    }

    public String getSendTitle() {
        return sendTitle;
    }

    public void setSendTitle(String sendTitle) {
        this.sendTitle = sendTitle == null ? null : sendTitle.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}