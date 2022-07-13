/*package com.ninja.dietician.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninja.dietician.entity.Morbidity;
import com.ninja.dietician.repository.MorbidityRepository;
import com.ninja.dietician.service.MorbidityService;

@Service
public class MorbidityServiceImpl implements MorbidityService {

	@Autowired
	MorbidityRepository morbidityRepository;

	@Override
	public List<Morbidity> getAllMorbidities() {
		List<Morbidity> list = new ArrayList<>();

		this.morbidityRepository.findAll().forEach(m -> {
			if (m.getMorbidityTestId() != null) {
				list.add(m);
			}
		});
		return list;
	}



}
*/