package ru.gb.sales.model.dto;

import lombok.Builder;
import lombok.Data;
import ru.gb.sales.model.Status;

import javax.persistence.ManyToOne;

@Data
@Builder
public class CategoryDTO {

    long id;

    private String name;

    private Status status;
}
