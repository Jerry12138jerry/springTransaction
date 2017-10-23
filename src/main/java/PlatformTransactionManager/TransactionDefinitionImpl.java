package PlatformTransactionManager;

import org.springframework.transaction.TransactionDefinition;

public class TransactionDefinitionImpl implements TransactionDefinition{

	/*初步理解*/
	/*事务有四个特性ACID*/
	/**
	 * 原子性(Atomicity):事务是一个原子操作,由一系列动作组成.事务的原子性确保动作要么全部完成，要么完全不起作用。
	 * 一致性（Consistency）：一旦事务完成（不管成功还是失败），系统必须确保它所建模的业务处于一致的状态，而不会是部分完成部分失败。在现实中的数据不应该被破坏。
	 * 隔离性（Isolation）：可能有许多事务会同时处理相同的数据，因此每个事务都应该与其他事务隔离开来，防止数据损坏。
	 * 持久性（Durability）：一旦事务完成，无论发生什么系统错误，它的结果都不应该受到影响，这样就能从任何系统崩溃中恢复过来。通常情况下，事务的结果被写到持久化存储器中。
	 * */
	/*核心接口TransactionDefinition*/
	@Override
	/*事务隔离级别*/
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
	/*事务传播行为*/
	public int getPropagationBehavior() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	/*事务超时*/
	public int getTimeout() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	/*只读状态*/
	public boolean isReadOnly() {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * 传参给事务管理器接口
	 * PlatformTransactionManager
	 * */

}
