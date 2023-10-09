package com.elasticsearch.project.service;

import com.elasticsearch.project.entity.Compensation;
import com.elasticsearch.project.repo.CompensationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompensationService {

    private final CompensationRepo compensationRepo;

    @Autowired
    public CompensationService(CompensationRepo compensationRepo)
    {
        this.compensationRepo = compensationRepo;
    }

    public void save(Compensation compensation)
    {
        compensationRepo.save(compensation);
    }

    public void saveBulk()
    {
        int i=20;
        do {
            Compensation document = new Compensation();
            document.setTimeStamp("2023-10-02T10:09:12.962+05:30");
            document.setEmployer("Employer " + i);
            document.setLocation("Location " + i);
            document.setJobTitle("Job Title " + i);
            document.setYearsAtEmployer("2");
            document.setYearsOfExperience("13");
            document.setAnnualBasePay(125000.0);
            document.setSigningBonus(5000.0);
            document.setAnnualBonus(0.0);
            document.setAnnualStockValueOrBonus("5000 shares");
            document.setGender("female");
            document.setAdditionalComments("Comment " + i);
            compensationRepo.save(document);
            ++i;
        }while (i<=50);
    }

    public List<Compensation> findAll()
    {
        Iterable<Compensation> iterable = compensationRepo.findAll();
        List<Compensation> compensationList = new ArrayList<>();
        iterable.forEach(compensationList::add);
        return compensationList;
    }
}
