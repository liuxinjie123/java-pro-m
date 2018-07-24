package com.mira.service.entity.admin;

import com.mira.service.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "m_admins_login_log")
@Data
@NoArgsConstructor
public class AdminLoginLogEntity extends BaseEntity {
}
