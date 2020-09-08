package org.cskj.boot.goods.service.impl;

import java.util.List;

import org.cskj.boot.goods.bean.Goods;
import org.cskj.boot.goods.mapper.GoodsMapper;
import org.cskj.boot.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsMapper goodsmapper;
	
	@Override
	public List<Goods> queryGoodsAll() {
		// TODO Auto-generated method stub
		return goodsmapper.queryGoodsAll();
	}

	@Override
	public int addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsmapper.addGoods(goods);
	}

	@Override
	public int deleteGoods(int id) {
		// TODO Auto-generated method stub
		return goodsmapper.deleteGoods(id);
	}

	@Override
	public Goods queryGoodsById(Goods goods) {
		// TODO Auto-generated method stub
		return goodsmapper.queryGoodsById(goods);
	}

	@Override
	public int updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsmapper.updateGoods(goods);
	}

}
