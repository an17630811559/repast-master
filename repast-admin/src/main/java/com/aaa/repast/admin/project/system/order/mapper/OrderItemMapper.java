package com.aaa.repast.admin.project.system.order.mapper;

import com.aaa.repast.admin.project.system.order.domain.OrderItem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单中所包含的商品 数据层
 * 
 * @author Seven Lee
 * @date 2020-01-03
 */
@Repository
public interface OrderItemMapper 
{
	/**
     * 查询订单中所包含的商品信息
     * 
     * @param id 订单中所包含的商品ID
     * @return 订单中所包含的商品信息
     */
	public OrderItem selectOrderItemById(Long id);
	
	/**
     * 查询订单中所包含的商品列表
     * 
     * @param orderItem 订单中所包含的商品信息
     * @return 订单中所包含的商品集合
     */
	public List<OrderItem> selectOrderItemList(OrderItem orderItem);
	
	/**
     * 新增订单中所包含的商品
     * 
     * @param orderItem 订单中所包含的商品信息
     * @return 结果
     */
	public int insertOrderItem(OrderItem orderItem);
	
	/**
     * 修改订单中所包含的商品
     * 
     * @param orderItem 订单中所包含的商品信息
     * @return 结果
     */
	public int updateOrderItem(OrderItem orderItem);
	
	/**
     * 删除订单中所包含的商品
     * 
     * @param id 订单中所包含的商品ID
     * @return 结果
     */
	public int deleteOrderItemById(Long id);
	
	/**
     * 批量删除订单中所包含的商品
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrderItemByIds(String[] ids);


	/**
	 * 根据订单编号查
	 *
	 * @param id 订单中所包含的商品ID
	 * @return 订单中所包含的商品信息
	 */
	public List<OrderItem> selectOrderItemByOrderSn(String orderSn);

	
}