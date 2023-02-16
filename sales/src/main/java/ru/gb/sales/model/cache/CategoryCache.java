package ru.gb.sales.model.cache;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.redis.core.RedisHash;
import ru.gb.sales.model.Status;

import java.io.Serializable;

@RedisHash("Category")
@Data
@Builder
public class CategoryCache implements Serializable {

    long id;

    private String name;

    private Status status;
}
