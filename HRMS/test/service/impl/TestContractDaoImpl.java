package service.impl;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import service.ContractDao;
import util.Util;
import entity.Contract;

public class TestContractDaoImpl {
	
	//���Ժ�ͬ��ѯ��Ԫ
	@Test
	public void TestQueryAllContract() {
		List<Contract> list = new ContractDaoImpl().queryAllContract();
		for (Contract c : list) {
			System.out.println(c.toString());
		}
	}

	//������Ӻ�ͬ��Ԫ
	@Test
	public void TestAddContract() {
		Contract c = new Contract();
		c.setSalary(1000000);
		c.setSid("1");
		c.setType("δ֪����");
		c.setYear(10000);
		ContractDao ContractDao = new ContractDaoImpl();
		Assert.assertEquals(true, ContractDao.addContract(c));
	}

	//�����޸ĺ�ͬ��Ԫ
	@Test
	public void TestUpdateContract() {
		Contract c = new Contract();
		c.setCid("C0000004");
		c.setSalary(1000000);
		c.setSid("1");
		c.setType("kk����");
		c.setYear(10000);
		ContractDao ContractDao = new ContractDaoImpl();
		Assert.assertEquals(true, ContractDao.updateContract(c));
	}

	//����ɾ����ͬ��Ԫ
	@Test
	public void TestDeleteContract() {
		ContractDao ContractDao = new ContractDaoImpl();
		Assert.assertEquals(true, ContractDao.deleteContract("C0000002"));
	}
}
