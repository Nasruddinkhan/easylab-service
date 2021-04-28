package com.easylab.service.repsoitory;

import com.easylab.service.entity.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Nasruddin
 */
@Repository
public interface InquiryRepository extends JpaRepository<Inquiry, Long> {
}
