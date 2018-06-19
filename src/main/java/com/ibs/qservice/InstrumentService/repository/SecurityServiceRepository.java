package com.ibs.qservice.InstrumentService.repository;

import com.ibs.qservice.InstrumentService.model.SecurityServiceBean;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Balagan on 5/9/2018.
 */
public interface SecurityServiceRepository extends JpaRepository<SecurityServiceBean,Long> {
}
