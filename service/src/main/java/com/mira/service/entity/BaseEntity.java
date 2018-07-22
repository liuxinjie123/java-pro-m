package com.mira.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;						                // 自增长主键

    @Version
    private int version;

    @Column(name = "create_id")
    private String createId;                                //创建人id

    @Column(name = "create_time")
    private Date createTime;                                //创建时间

    @Column(name = "last_update_id")
    private String lastUpdateId;                            //最后一次更新人id

    @Column(name = "last_update_time")
    private Date lastUpdateTime;                            //最后一次更新时间

    @PrePersist
    public void init() {
        System.out.println(" ------ jpa init method ------ ");
    }

    @PreUpdate
    public void update() {
        System.out.println(" ------ jpa update method ------ ");
    }
}
