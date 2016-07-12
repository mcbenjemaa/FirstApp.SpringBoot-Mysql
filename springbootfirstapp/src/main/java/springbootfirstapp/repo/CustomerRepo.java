package springbootfirstapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootfirstapp.domain.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
