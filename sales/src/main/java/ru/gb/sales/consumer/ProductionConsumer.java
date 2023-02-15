package ru.gb.sales.consumer;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import ru.gb.sales.model.ProductionStatusChange;
import ru.gb.sales.service.SalesService;
import ru.gb.sales.service.impl.SalesServiceImpl;

@Component
@AllArgsConstructor
public class ProductionConsumer {

    @Autowired
    private SalesServiceImpl salesService;

    @JmsListener(destination = "productionStatusChange")
    public void consumeProductionStatusChangeMessage(String message) {
        ProductionStatusChange productionStatusChange = new Gson().fromJson(message, ProductionStatusChange.class);
        salesService.changeOrderStatus(salesService.getOrder(productionStatusChange.getSalesOrderId()),
                productionStatusChange.getSalesOrderStatus());
    }
}
