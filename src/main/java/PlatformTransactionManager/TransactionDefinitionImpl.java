package PlatformTransactionManager;

import org.springframework.transaction.TransactionDefinition;

public class TransactionDefinitionImpl implements TransactionDefinition{

	/*�������*/
	/*�������ĸ�����ACID*/
	/**
	 * ԭ����(Atomicity):������һ��ԭ�Ӳ���,��һϵ�ж������.�����ԭ����ȷ������Ҫôȫ����ɣ�Ҫô��ȫ�������á�
	 * һ���ԣ�Consistency����һ��������ɣ����ܳɹ�����ʧ�ܣ���ϵͳ����ȷ��������ģ��ҵ����һ�µ�״̬���������ǲ�����ɲ���ʧ�ܡ�����ʵ�е����ݲ�Ӧ�ñ��ƻ���
	 * �����ԣ�Isolation������������������ͬʱ������ͬ�����ݣ����ÿ������Ӧ��������������뿪������ֹ�����𻵡�
	 * �־��ԣ�Durability����һ��������ɣ����۷���ʲôϵͳ�������Ľ������Ӧ���ܵ�Ӱ�죬�������ܴ��κ�ϵͳ�����лָ�������ͨ������£�����Ľ����д���־û��洢���С�
	 * */
	/*���Ľӿ�TransactionDefinition*/
	@Override
	/*������뼶��*/
	public int getIsolationLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/*���񴫲���Ϊ*/
	public int getPropagationBehavior() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	/*����ʱ*/
	public int getTimeout() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	/*ֻ��״̬*/
	public boolean isReadOnly() {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * ���θ�����������ӿ�
	 * PlatformTransactionManager
	 * */

}
