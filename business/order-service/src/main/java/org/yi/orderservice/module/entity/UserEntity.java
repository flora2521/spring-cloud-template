package org.yi.orderservice.module.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Mao xiaolin
 * @version 1.0
 * @date 2021/6/15 15:48
 */
@Getter
@Setter
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -2966580167406527877L;
    private Long id;

    private String name;

    private String password;
}
