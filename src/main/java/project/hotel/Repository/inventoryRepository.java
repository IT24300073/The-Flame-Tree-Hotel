package project.hotel.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hotel.Model.inventory;

public interface inventoryRepository extends JpaRepository<inventory, Integer> {
    Optional<inventory> findByItem(String item);
    Optional<inventory> findFirstByItemIgnoreCase(String item);
}
