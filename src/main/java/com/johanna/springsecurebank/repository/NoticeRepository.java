package com.johanna.springsecurebank.repository;

import com.johanna.springsecurebank.model.Notice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NoticeRepository extends CrudRepository<Notice, Long> {

    @Query(value = "from Notice n where current_date BETWEEN noticBegDt AND noticEndDt")
    List<Notice> findAllActiveNotices();

}
