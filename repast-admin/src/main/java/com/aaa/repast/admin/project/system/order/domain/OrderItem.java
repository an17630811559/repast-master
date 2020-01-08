package com.aaa.repast.admin.project.system.order.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.repast.admin.framework.web.domain.BaseEntity;

import java.math.BigDecimal;

/**
 * 订单中所包含的商品表 oms_order_item
 * 
 * @author Seven Lee
 * @date 2020-01-03
 */
public class OrderItem extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/** 订单id */
	private Long orderId;
	/** 订单编号 */
	private String orderSn;
	/**  */
	private Long productId;
	/**  */
	private String productPic;
	/**  */
	private String productName;
	/**  */
	private String productBrand;
	/**  */
	private String productSn;
	/** 销售价格 */
	private BigDecimal productPrice;
	/** 购买数量 */
	private Integer productQuantity;
	/** 商品sku编号 */
	private Long productSkuId;
	/** 商品sku条码 */
	private String productSkuCode;
	/** 商品分类id */
	private Long productCategoryId;
	/** 商品的销售属性 */
	private String sp1;
	/**  */
	private String sp2;
	/**  */
	private String sp3;
	/** 商品促销名称 */
	private String promotionName;
	/** 商品促销分解金额 */
	private BigDecimal promotionAmount;
	/** 优惠券优惠分解金额 */
	private BigDecimal couponAmount;
	/** 积分优惠分解金额 */
	private BigDecimal integrationAmount;
	/** 该商品经过优惠后的分解金额 */
	private BigDecimal realAmount;
	/**  */
	private Integer giftIntegration;
	/**  */
	private Integer giftGrowth;
	/** 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}] */
	private String productAttr;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setOrderId(Long orderId) 
	{
		this.orderId = orderId;
	}

	public Long getOrderId() 
	{
		return orderId;
	}
	public void setOrderSn(String orderSn) 
	{
		this.orderSn = orderSn;
	}

	public String getOrderSn() 
	{
		return orderSn;
	}
	public void setProductId(Long productId) 
	{
		this.productId = productId;
	}

	public Long getProductId() 
	{
		return productId;
	}
	public void setProductPic(String productPic) 
	{
		this.productPic = productPic;
	}

	public String getProductPic() 
	{
		return productPic;
	}
	public void setProductName(String productName) 
	{
		this.productName = productName;
	}

	public String getProductName() 
	{
		return productName;
	}
	public void setProductBrand(String productBrand) 
	{
		this.productBrand = productBrand;
	}

	public String getProductBrand() 
	{
		return productBrand;
	}
	public void setProductSn(String productSn) 
	{
		this.productSn = productSn;
	}

	public String getProductSn() 
	{
		return productSn;
	}
	public void setProductPrice(BigDecimal productPrice) 
	{
		this.productPrice = productPrice;
	}

	public BigDecimal getProductPrice() 
	{
		return productPrice;
	}
	public void setProductQuantity(Integer productQuantity) 
	{
		this.productQuantity = productQuantity;
	}

	public Integer getProductQuantity() 
	{
		return productQuantity;
	}
	public void setProductSkuId(Long productSkuId) 
	{
		this.productSkuId = productSkuId;
	}

	public Long getProductSkuId() 
	{
		return productSkuId;
	}
	public void setProductSkuCode(String productSkuCode) 
	{
		this.productSkuCode = productSkuCode;
	}

	public String getProductSkuCode() 
	{
		return productSkuCode;
	}
	public void setProductCategoryId(Long productCategoryId) 
	{
		this.productCategoryId = productCategoryId;
	}

	public Long getProductCategoryId() 
	{
		return productCategoryId;
	}
	public void setSp1(String sp1) 
	{
		this.sp1 = sp1;
	}

	public String getSp1() 
	{
		return sp1;
	}
	public void setSp2(String sp2) 
	{
		this.sp2 = sp2;
	}

	public String getSp2() 
	{
		return sp2;
	}
	public void setSp3(String sp3) 
	{
		this.sp3 = sp3;
	}

	public String getSp3() 
	{
		return sp3;
	}
	public void setPromotionName(String promotionName) 
	{
		this.promotionName = promotionName;
	}

	public String getPromotionName() 
	{
		return promotionName;
	}
	public void setPromotionAmount(BigDecimal promotionAmount) 
	{
		this.promotionAmount = promotionAmount;
	}

	public BigDecimal getPromotionAmount() 
	{
		return promotionAmount;
	}
	public void setCouponAmount(BigDecimal couponAmount) 
	{
		this.couponAmount = couponAmount;
	}

	public BigDecimal getCouponAmount() 
	{
		return couponAmount;
	}
	public void setIntegrationAmount(BigDecimal integrationAmount) 
	{
		this.integrationAmount = integrationAmount;
	}

	public BigDecimal getIntegrationAmount() 
	{
		return integrationAmount;
	}
	public void setRealAmount(BigDecimal realAmount) 
	{
		this.realAmount = realAmount;
	}

	public BigDecimal getRealAmount() 
	{
		return realAmount;
	}
	public void setGiftIntegration(Integer giftIntegration) 
	{
		this.giftIntegration = giftIntegration;
	}

	public Integer getGiftIntegration() 
	{
		return giftIntegration;
	}
	public void setGiftGrowth(Integer giftGrowth) 
	{
		this.giftGrowth = giftGrowth;
	}

	public Integer getGiftGrowth() 
	{
		return giftGrowth;
	}
	public void setProductAttr(String productAttr) 
	{
		this.productAttr = productAttr;
	}

	public String getProductAttr() 
	{
		return productAttr;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderId", getOrderId())
            .append("orderSn", getOrderSn())
            .append("productId", getProductId())
            .append("productPic", getProductPic())
            .append("productName", getProductName())
            .append("productBrand", getProductBrand())
            .append("productSn", getProductSn())
            .append("productPrice", getProductPrice())
            .append("productQuantity", getProductQuantity())
            .append("productSkuId", getProductSkuId())
            .append("productSkuCode", getProductSkuCode())
            .append("productCategoryId", getProductCategoryId())
            .append("sp1", getSp1())
            .append("sp2", getSp2())
            .append("sp3", getSp3())
            .append("promotionName", getPromotionName())
            .append("promotionAmount", getPromotionAmount())
            .append("couponAmount", getCouponAmount())
            .append("integrationAmount", getIntegrationAmount())
            .append("realAmount", getRealAmount())
            .append("giftIntegration", getGiftIntegration())
            .append("giftGrowth", getGiftGrowth())
            .append("productAttr", getProductAttr())
            .toString();
    }
}
