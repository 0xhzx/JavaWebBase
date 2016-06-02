package service;

import java.util.List;

import entity.Employ;

public interface EmployDao {
	// ������Ƹ��Ϣ
	public boolean addEmploy(Employ e);

	// ɾ����Ƹ��Ϣ
	public boolean deleteEmploy(String eid);

	// �޸���Ƹ��Ϣ
	public boolean updateEmploy(Employ e);

	// ��ѯ��Ƹ��Ϣ
	public Employ queryEmployByEid(String eid);

	// ��ѯ������Ƹ��Ϣ
	public List<Employ> queryAllEmploy();
}
