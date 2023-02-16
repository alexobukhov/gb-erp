package ru.gb.sales.repository.cache;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.gb.sales.model.cache.CategoryCache;

@Repository
public interface CategoryCacheRepository extends CrudRepository<CategoryCache, Long> {
}
