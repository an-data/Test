package com.t.bean;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 *
 * </p>
 *
 * @author ymx
 * @since 2021-11-01
 */
@Data
@Accessors(chain = true)
@TableName("t_vip_user")
public class VipUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId
    private String id;


    private String vipCode;


    private String password;


    private String realName;

    @TableField(fill = FieldFill.UPDATE)
    private String nickName;


    private String userImg;


    private String phone;


    private String organizationId;


    private Integer customerType;


    private String country;


    private String province;


    private String city;


    private String area;


    private String site;


    private Integer sex;


    private Date birthday;


    private String address;


    private String position;

    private String appellation;


    private Integer identificationType;

    private String identificationNumber;


    private String mail;


    private String weiXin;

    private String openId;


    private String companyName;

    private String hobby;


    private String customerManager;


    private Integer customerSource;


    private String cardIssuingHotel;


    private String invitationUserid;


    private String invitationCode;


    private String memo;

    private String lineState;


}

