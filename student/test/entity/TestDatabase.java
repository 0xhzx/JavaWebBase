package entity;

import java.util.Date;
import java.util.EnumSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.junit.Test;

public class TestDatabase {

	// ��Ӳ�������
	@Test
	public void testAddStudent() {
		// �������ö���
		Configuration configuration = new Configuration().configure();
		// ����SessionFactory����
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		// ����session����
		Session session = sessionFactory.getCurrentSession();
		// �����������
		Transaction ts = session.beginTransaction();

		Student s1 = new Student("S0000001", "skyward", "��", new Date(), "δ֪����");
		Student s2 = new Student("S0000002", "geek", "��", new Date(), "δ֪����");
		Student s3 = new Student("S0000004", "hacker", "��", new Date(), "δ֪����");

		session.save(s1);
		session.save(s2);
		session.save(s3);

		ts.commit();
		sessionFactory.close();
	}

	@Test
	public void testSchemaExport() {
		// �������ö���
		Configuration configuration = new Configuration().configure();
		// ��������ע�����
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure().build();
		// ����SessionFactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		// ����session����
		Session session = sessionFactory.getCurrentSession();
		// ����SchemaExport����
		SchemaExport schemaExport = new SchemaExport();

		Metadata metadata = new MetadataSources(serviceRegistry)
				.buildMetadata();

		schemaExport.create(EnumSet.of(TargetType.DATABASE), metadata);
	}

}
