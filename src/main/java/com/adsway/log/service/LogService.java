package com.adsway.log.service;

import java.util.List;

import com.adsway.log.entity.LogRecord;

public interface LogService {

	LogRecord save(LogRecord logRecord) throws Exception;

	void delete(long id) throws Exception;

	List<LogRecord> getAllLogRecords() throws Exception;

	LogRecord getLogRecordById(long id) throws Exception;

}
