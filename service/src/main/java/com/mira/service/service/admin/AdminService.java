package com.mira.service.service.admin;

import com.mira.common.dto.admin.AdminDTO;
import com.mira.common.vo.Page;

import java.util.List;

public interface AdminService {
    void save(AdminDTO admin);

    AdminDTO findByUsername(String username);

    List<AdminDTO> list(Page page);
}
