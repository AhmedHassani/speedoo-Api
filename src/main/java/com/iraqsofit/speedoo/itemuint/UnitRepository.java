package com.iraqsofit.speedoo.itemuint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnitRepository extends JpaRepository<Unit,Long> {
    List<Unit> findByItemCode(long item_code);
}
