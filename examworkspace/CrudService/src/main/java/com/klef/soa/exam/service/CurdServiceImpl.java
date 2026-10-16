package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.Curd;
import com.klef.soa.exam.repository.CurdRepository;

@Service
public class CurdServiceImpl implements CurdService {

	@Autowired
	public CurdRepository service;
	
	@Override
	public Curd addCurd(Curd curd) {
		return service.save(curd);
	}

	@Override
	public List<Curd> displayall() {
		return service.findAll();
	}

	@Override
	public String deleteByid(Long id) {
		boolean flag=service.existsById(id);
		if(flag) {
			service.deleteById(id);
			return "doctor deleted successfully";
		}else {
			return "doctor id not found";
		}
	}

}
