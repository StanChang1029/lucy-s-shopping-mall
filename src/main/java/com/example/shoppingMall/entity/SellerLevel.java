package com.example.shoppingMall.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Data;

//@IdClass(MemberId.class)
@Entity
@Table(name = "seller_level")
@Data
public class SellerLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seller_level_id")
	@JsonAlias("seller_level_id")
	private BigInteger sellerLevelId;

	
	@JsonAlias("seller_level_type")
	private String sellerLevelType;

	@JsonAlias("member_phone")
	private String memberPhone;

	@Column(name = "member_password")
    @JsonAlias("member_password")
	private String memberPassword;

	@Column(name = "member_name")
    @JsonAlias("member_name")
	private String memberName;

	@Column(name = "seller_point")
    @JsonAlias("seller_point")
	private BigInteger sellerPoint;

	@Column(name = "buyer_point")
    @JsonAlias("buyer_point")
	private BigInteger buyerPoint;

	@Column(name = "create_time")
	@JsonAlias("create_time")
	private Date createTime;

	@Column(name = "edit_time")
    @JsonAlias("edit_time")
	private Date editTime;

	@Column(name = "available")
    @JsonAlias("abailable")
	private Boolean available;
	
}
