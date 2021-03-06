package dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Seckill;

public interface SeckillDao {

    //  减小库存
	int reduceNumber(@Param("seckillId")long seckillId,@Param("killTime")Date killTime);
	
	//根据id查询秒杀对象
	Seckill queryById(long seckillId);
	
	//根据偏移量查询秒杀系统列表
	List<Seckill> queryAll(@Param("offset")int offet,@Param("limit")int limit);
	
	
	
}
