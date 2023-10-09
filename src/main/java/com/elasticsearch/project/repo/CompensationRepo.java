package com.elasticsearch.project.repo;

import com.elasticsearch.project.entity.Compensation;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CompensationRepo extends ElasticsearchRepository<Compensation, String> {
}
