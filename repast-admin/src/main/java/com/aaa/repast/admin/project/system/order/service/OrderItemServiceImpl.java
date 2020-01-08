package com.aaa.repast.admin.project.system.order.service;

import com.aaa.repast.admin.project.system.order.domain.OrderItem;
import com.aaa.repast.admin.project.system.order.mapper.OrderItemMapper;
import com.aaa.repast.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单中所包含的商品 服务层实现
 * 
 * @author Seven Lee
 * @date 2020-01-03
 */
@Service
public class OrderItemServiceImpl implements IOrderItemService 
{
	@Autowired
	private OrderItemMapper orderItemMapper;

	/**
     * 查询订单中所包含的商品信息
     * 
     * @param id 订单中所包含的商品ID
     * @return 订单中所包含的商品信息
     */
    @Override
	public OrderItem selectOrderItemById(Long id)
	{
	    return orderItemMapper.selectOrderItemById(id);
	}
	
	/**
     * 查询订单中所包含的商品列表
     * 
     * @param orderItem 订单中所包含的商品信息
     * @return 订单中所包含的商品集合
     */
	@Override
	public List<OrderItem> selectOrderItemList(OrderItem orderItem)
	{
	    return orderItemMapper.selectOrderItemList(orderItem);
	}
	
    /**
     * 新增订单中所包含的商品
     * 
     * @param orderItem 订单中所包含的商品信息
     * @return 结果
     */
	@Override
	public int insertOrderItem(OrderItem orderItem)
	{
	    return orderItemMapper.insertOrderItem(orderItem);
	}
	
	/**
     * 修改订单中所包含的商品
     * 
     * @param orderItem 订单中所包含的商品信息
     * @return 结果
     */
	@Override
	public int updateOrderItem(OrderItem orderItem)
	{
	    return orderItemMapper.updateOrderItem(orderItem);
	}

	/**
     * 删除订单中所包含的商品对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteOrderItemByIds(String ids)
	{
		return orderItemMapper.deleteOrderItemByIds(Convert.toStrArray(ids));
	}


	@Override
	public List<OrderItem> selectOrderItemByOrderSn(String orderSn) {
		List<OrderItem> orderItems = orderItemMapper.selectOrderItemByOrderSn(orderSn);
		return orderItems;
	}

}
