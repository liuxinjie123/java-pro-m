package com.mira.service.entity.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "t_dictionary")
@Data
@NoArgsConstructor
public class DictionaryEntity extends BaseEntity implements Serializable {
    @Column(name = "type")
    private String type;

    @Column(name = "sequence")
    private int sequence;

    @Column(name = "name")
    private String name;

}
