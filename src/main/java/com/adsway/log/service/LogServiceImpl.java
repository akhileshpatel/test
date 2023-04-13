package com.adsway.log.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adsway.log.entity.LogRecord;
import com.adsway.log.repository.LogRepository;

@Service
public class LogServiceImpl implements LogService {
	
	@Autowired
	private LogRepository repository;
	
	@Override
	public LogRecord save(LogRecord logRecord) throws Exception {
		return repository.save(logRecord);
	}
	
	@Override
	public void delete(long id) throws Exception {
		repository.deleteById(id);
		
	}
	
	@Override
	public List<LogRecord> getAllLogRecords() throws Exception {
		return repository.findAll();
	}
	
	@Override
	public LogRecord getLogRecordById(long id) throws Exception {
		return repository.findById(id).orElse(null);
	}
	
	

}
