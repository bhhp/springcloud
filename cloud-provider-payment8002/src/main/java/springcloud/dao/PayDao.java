package springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import springcloud.entities.Payment;

@Mapper
public interface PayDao {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") int id);
}
