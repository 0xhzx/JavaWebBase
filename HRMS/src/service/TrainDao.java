package service;

import java.util.List;

import entity.Train;

public interface TrainDao {
	// ������Ƹ��Ϣ
	public boolean addTrain(Train t);

	// ɾ����Ƹ��Ϣ
	public boolean deleteTrain(String tid);

	// �޸���Ƹ��Ϣ
	public boolean updateTrain(Train t);

	// ��ѯ��Ƹ��Ϣ
	public Train queryTrainByTid(String tid);

	// ��ѯ������Ƹ��Ϣ
	public List<Train> queryAllTrain();
}
