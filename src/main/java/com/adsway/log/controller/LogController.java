package com.adsway.log.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adsway.log.entity.LogRecord;
import com.adsway.log.service.LogService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("cms")
public class LogController {
	
	@Autowired
	private LogService logService;
	
	@GetMapping("/log/test")
	private LogRecord test() {
		return new LogRecord(1l, 1l, 1l, 2, "logText", true, 1, 3222l, "createdBy", new Date(), new Date());
	}
	
	@PostMapping("log")
	public LogRecord saveLogRecord(@RequestBody LogRecord logRecord, Principal principal){
		System.out.println(principal.getName());
        try {
        	
			return logService.save(logRecord);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return null;
    }
	
	@PutMapping("log")
	public LogRecord updateLogRecord(@RequestBody LogRecord logRecord){
        try {
			return logService.save(logRecord);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return null;
    }
	
	@DeleteMapping("log/{id}")
	public boolean deleteLogRecord(@PathVariable long id){
		//make sure it will delete the LogRecord_role table data also.
		boolean isDeleted = false;
        try {
        	logService.delete(id);
			isDeleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
        return isDeleted;
    }
	
	@GetMapping("log")
	public List<LogRecord> getLogRecords(Principal principal){
		System.out.println(principal.getName());
		List<LogRecord> LogRecords = new ArrayList<LogRecord>();
		try {
			LogRecords = logService.getAllLogRecords();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return LogRecords;
	}
	
	@GetMapping("log/{id}")
	public LogRecord getLogRecord(@PathVariable long id){
		LogRecord LogRecord = null;
		try {
			LogRecord = logService.getLogRecordById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return LogRecord;
	}

}
