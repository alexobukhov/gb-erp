package ru.gb.sales.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ProductionStatusChange {

    private long salesOrderId;

    private long productionOrderId;

    private Status salesOrderStatus;
}
