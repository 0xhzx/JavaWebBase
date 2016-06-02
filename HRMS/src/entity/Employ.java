package entity;

import java.util.Date;

//��Ƹ��Ϣ��
public class Employ {
	// ��Ƹ���
	private String eid;
	// ��Ƹ��λ
	private String job;
	// ��Ƹ����
	private int count;
	// ��λ˵��
	private String illustration;
	// ��Ƹ��ʼʱ��
	private Date startTime;
	// ��Ƹ��ֹʱ��
	private Date endTime;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getIllustration() {
		return illustration;
	}

	public void setIllustration(String illustration) {
		this.illustration = illustration;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Employ [eid=" + eid + ", job=" + job + ", count=" + count
				+ ", illustration=" + illustration + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}

	public Employ(String eid, String job, int count, String illustration,
			Date startTime, Date endTime) {
		this.eid = eid;
		this.job = job;
		this.count = count;
		this.illustration = illustration;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Employ() {
	}
}
