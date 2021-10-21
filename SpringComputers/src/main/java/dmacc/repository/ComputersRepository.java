package dmacc.repository;

import org.springframework.stereotype.Repository;

import dmacc.beans.Computers;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */

@Repository
public interface ComputersRepository extends JpaRepository<Computers, Long> {
	

}
