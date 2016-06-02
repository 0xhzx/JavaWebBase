package service;

import java.util.List;

import entity.Contract;

public interface ContractDao {
	// ������Ƹ��Ϣ
	public boolean addContract(Contract c);

	// ɾ����Ƹ��Ϣ
	public boolean deleteContract(String cid);

	// �޸���Ƹ��Ϣ
	public boolean updateContract(Contract c);

	// ��ѯ��Ƹ��Ϣ
	public Contract queryContractByCid(String cid);

	// ��ѯ������Ƹ��Ϣ
	public List<Contract> queryAllContract();
}
