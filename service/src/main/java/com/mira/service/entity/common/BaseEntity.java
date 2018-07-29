package com.mira.service.entity.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

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
    private int createId;                                   //创建人id

    @Column(name = "create_time")
    private LocalDateTime createTime;                       //创建时间

    @Column(name = "last_update_id")
    private int lastUpdateId;                               //最后一次更新人id

    @Column(name = "last_update_time")
    private LocalDateTime lastUpdateTime;                   //最后一次更新时间

    @Transient
    private int sessionId;

    @PrePersist
    public void init() {
        System.out.println(" ------ jpa init method ------ ");
        createId = sessionId;
        createTime = LocalDateTime.now();
        lastUpdateId = sessionId;
        lastUpdateTime = LocalDateTime.now();
    }

    @PreUpdate
    public void update() {
        System.out.println(" ------ jpa update method ------ ");
        lastUpdateId = sessionId;
        lastUpdateTime = LocalDateTime.now();
    }
}
