package com.mira.common.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class BaseVO implements Serializable {
    private Long id;						                // 自增长主键
    private int createId;                                   // 创建人id
    private LocalDateTime createTime;                       // 创建时间
    private int lastUpdateId;                               // 最后一次更新人id
    private LocalDateTime lastUpdateTime;                   // 最后一次更新时间
}
