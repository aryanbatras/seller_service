package com.sashel.seller_service.repo;

import com.sashel.seller_service.entity.EntitySeller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SellerRepository extends JpaRepository<EntitySeller, Long> {
    Optional<EntitySeller> findBySellerId(Long sellerId);
}
