package jenkins.docker.api.service;

import jenkins.docker.api.entity.Employee;
import jenkins.docker.api.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public void insertEmployee(Employee employee) {
         employeeRepo.save(employee);
    }
}
