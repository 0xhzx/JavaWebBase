package service.impl;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import service.TrainDao;
import util.Util;
import entity.Train;

public class TestTrainDaoImpl {
	@Test
	public void TestQueryAllTrain() {
		List<Train> list = new TrainDaoImpl().queryAllTrain();
		for(Train s : list) {
			System.out.println(s.toString());
		}
	}
	
	@Test
	public void TestGetNewId() {
		System.out.println(Util.getNewId("tid", "Train"));
	}
	
	@Test
	public void TestAddTrain() {
		Train e = new Train();
		e.setCount(1000);
		e.setName("����ѵ����Ŀ");
		e.setTutor("������");
		e.setType("����Ȼ");
		TrainDao TrainDao = new TrainDaoImpl();
		Assert.assertEquals(true, TrainDao.addTrain(e));
	}
}
