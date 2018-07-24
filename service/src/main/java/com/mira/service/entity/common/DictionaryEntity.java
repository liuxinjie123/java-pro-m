package com.mira.service.entity.common;

import com.mira.service.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_dictionary")
@Data
@NoArgsConstructor
public class DictionaryEntity extends BaseEntity {
}
