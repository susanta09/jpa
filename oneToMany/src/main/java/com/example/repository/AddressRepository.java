package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Address;

import jakarta.transaction.Transactional;

public interface AddressRepository extends JpaRepository<Address, Integer> {
//	@Transactional
//	@Modifying
//	@Query("delete from Address where type=:type")
//	void deleteAddressBYAddressType(String type);
	
	@Transactional
	@Modifying
	@Query(value="delete from Address a where a.empId=:empId and a.type=:type" )
	void deleteAddressBYAddressType(Integer empId,String type);
	
//	@Transactional
//	@Modifying
//	@Query(value="DELETE from address WHERE emp_id =?1 AND type =?2" ,nativeQuery = true)
//	void deleteAddressBYAddressType(Integer empId,String type);

}
