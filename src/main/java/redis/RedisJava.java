package redis;

import redis.clients.jedis.Jedis;

public class RedisJava {
	public static void main(String[] args) {
		//���ӱ��ص�redis����
		Jedis jedis = new Jedis("localhost");
		System.out.println("���ӳɹ�");
		//�鿴�����Ƿ�����
		System.out.println("������������:"+jedis.ping());
	}
}
