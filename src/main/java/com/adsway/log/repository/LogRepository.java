package com.adsway.log.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adsway.log.entity.LogRecord;

@Repository
public interface LogRepository extends JpaRepository<LogRecord, Long> {

}
