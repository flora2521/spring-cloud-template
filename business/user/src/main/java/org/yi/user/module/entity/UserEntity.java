package org.yi.user.module.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Mao xiaolin
 * @version 1.0
 * @date 2021/6/15 15:48
 */
@Getter
@Setter
@Entity(name = "user")
//@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -2966580167406527877L;
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = true, length = 30)
    private String name;

    @Column(name = "password", nullable = true, length = 30)
    private String password;
}
