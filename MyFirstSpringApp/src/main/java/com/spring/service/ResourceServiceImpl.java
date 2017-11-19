package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.spring.VO.ResourceVO;
import com.spring.model.Resource;
import com.spring.repositories.ResourceRepository;

@Service
public class ResourceServiceImpl {

	@Autowired
	ResourceRepository resourceRepository;

	public Page<ResourceVO> retrieveAllResources(Pageable pageable) {
		Page<ResourceVO> resourcePage = null;
		try {
			resourcePage = resourceRepository.findAll(pageable).map(resource -> {
				ResourceVO resourceVO = new ResourceVO(null, resource.getResourceName(), resource.getResourceType(),
						resource.getPropagationType(), resource.getLob(), resource.getServiceArea());
				return resourceVO;
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resourcePage;
	}
	
	public ResourceVO getResourceById(Integer id) {		
		Resource resource=resourceRepository.getResourceByResourceId(id);
		ResourceVO vo=new ResourceVO();
		vo.setResourceId(resource.getResourceId());
		vo.setResourceName(resource.getResourceName());
		vo.setResourceType(resource.getResourceType());
		vo.setLob(resource.getLob());
		vo.setPropagationType(resource.getPropagationType());
		vo.setServiceArea(resource.getServiceArea());
		return vo;
	}
	

	public ResourceVO getResourceByName(String name) {		
		Resource resource=resourceRepository.getResourceByResourceName(name);
		ResourceVO vo=new ResourceVO();
		vo.setResourceId(resource.getResourceId());
		vo.setResourceName(resource.getResourceName());
		vo.setResourceType(resource.getResourceType());
		vo.setLob(resource.getLob());
		vo.setPropagationType(resource.getPropagationType());
		vo.setServiceArea(resource.getServiceArea());
		return vo;
	}
}
