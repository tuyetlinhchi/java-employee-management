package com.asifekbal.management.Repo;

import com.asifekbal.management.Shema.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager,Long> {
}
