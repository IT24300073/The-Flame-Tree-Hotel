package project.hotel.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hotel.Model.housekeepingInventoryUsage;

public interface housekeepingInventoryUsageRepository extends JpaRepository<housekeepingInventoryUsage, Integer> {
    List<housekeepingInventoryUsage> findAllByOrderByUsedAtDesc();
}
