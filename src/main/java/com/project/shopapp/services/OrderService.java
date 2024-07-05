package com.project.shopapp.services;

import com.project.shopapp.dtos.OrderDTO;
import com.project.shopapp.exception.DataNotFoundException;
import com.project.shopapp.models.Order;
import com.project.shopapp.models.User;
import com.project.shopapp.repositories.OrderRepository;
import com.project.shopapp.repositories.UserRepository;
import com.project.shopapp.responses.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService implements IOrderService{
    private final UserRepository userRepository;

    private final OrderRepository orderRepository;

    private ModelMapper modelMapper;

    @Override
    public OrderResponse createOrder(OrderDTO orderDTO) throws DataNotFoundException {
        // Tìm kiếm xem user id có tồn tại không
        User user = userRepository.findById(orderDTO.getUserId()).orElseThrow(() -> new DataNotFoundException(("Cannot find user with id : " + orderDTO.getUserId())));

        // convert orderDTO => Oder
        modelMapper.typeMap(OrderDTO.class, Order.class).addMappings(mapper -> mapper.skip(Order::setId));
        return null;
    }

    @Override
    public OrderResponse getOrder(Long id) {
        return null;
    }

    @Override
    public OrderResponse updateOrder(Long id, OrderDTO orderDTO) {
        return null;
    }

    @Override
    public void deleteOrder(Long id) {

    }

    @Override
    public List<OrderResponse> getAllOrders(Long userId) {
        return null;
    }
}
