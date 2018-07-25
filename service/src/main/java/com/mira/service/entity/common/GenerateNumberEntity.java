package com.mira.service.entity.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "t_generate_number")
@Data
@NoArgsConstructor
public class GenerateNumberEntity implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;						                // 自增长主键

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "type")
    private String type;

}
