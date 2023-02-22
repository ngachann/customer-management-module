package com.example.customermanagementmodule.service.customer;

import com.example.customermanagementmodule.dto.CustomerDTO;
import com.example.customermanagementmodule.dto.Customers20To30AgeDTO;
import com.example.customermanagementmodule.dto.ResultDto;
import com.example.customermanagementmodule.dto.show.ContactDto;
import com.example.customermanagementmodule.dto.show.CustomerDto;
import com.example.customermanagementmodule.entity.Contact;
import com.example.customermanagementmodule.entity.Customer;
import com.example.customermanagementmodule.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ModelMapper mapper;
    @Override
    public List<CustomerDto> showListCustomerByListString(String str) {
        var x = str.replaceAll(" ", ""); // thay thế các phần tử trắng bẳng phần tử rỗng , lúc này trong mảng ch còn code khách hàng vàdấu phẩy
        String[] y = x.split(",");
        List<Customer> customerList = new ArrayList<>();
        for(String i : y){                  // gọi ra và lưu các phần tử vào mảng có kiểu customer
            customerList.add(customerRepository.findCustomerByCustomerCode(i));
        }
        List<CustomerDto> customerDtos = new ArrayList<>();
        for (Customer i : customerList){ // map mảng trên thành kiều dto
            CustomerDto a = mapper.map(i,CustomerDto.class);
            customerDtos.add(a);
        }
        return customerDtos;
    }

    @Override
    public ResultDto createCustomer(Customer customer) {
        try {
            customerRepository.save(customer);
        }catch (Exception e){
            return ResultDto.builder().code(400).message(e.getMessage()).build();
        }
        return ResultDto.builder().code(200).message("thanh cong").build();
    }
    @Override
    public List<Object> showListCustomerByAge20_30() {
        List<Object> customerList = customerRepository.findListBetween20and30(); // 1 mảng customer chứa yêu cầu đề bài
//        List<Customers20To30AgeDTO> contacts = new ArrayList<>();
//        for (Object i : customerList){
//            Customers20To30AgeDTO x = mapper.map(i,Customers20To30AgeDTO.class);
//            contacts.add(x);
//        }
        return customerList;
    }



//    private Specification<Customer> buildSpec(ListFileImportLimitCreditRequestDTO requestDTO) {
//        return (root, cq, cb) -> {
//            List<Predicate> predicates = new ArrayList<>();
//            if (StringUtils.isNotEmpty(requestDTO.getByUser())) {
//                predicates.add(cb.equal(cb.upper(root.get(STR_CREATED_BY)), StringUtils.trimToEmpty(requestDTO.getByUser().toUpperCase())));
//            }
//            if (StringUtils.isNotEmpty(requestDTO.getUserApprove())) {
//                predicates.add(cb.equal(cb.upper(root.get("approveBy")), StringUtils.trimToEmpty(requestDTO.getUserApprove().toUpperCase())));
//            }
//            if (StringUtils.isNotEmpty(requestDTO.getStatus())) {
//                predicates.add(cb.equal(cb.upper(root.get("status")), StringUtils.trimToEmpty(requestDTO.getStatus().toUpperCase())));
//            }
//            if (StringUtils.isNotEmpty(requestDTO.getFileName())) {
//                predicates.add(cb.like(cb.upper(root.get(STR_FILE_NAME)), appendLikeExpression(StringUtils.trimToEmpty(requestDTO.getFileName().toUpperCase()))));
//            }
//            if (StringUtils.isNotEmpty(requestDTO.getCardId())) {
//                Join<CreditLimit, CreditLimitDetail> sync = root.join("limitCreditDetailList");
//                predicates.add(cb.equal(sync.get("cardId"), StringUtils.trimToEmpty(requestDTO.getCardId())));
//            }
//            specCreateDate(requestDTO, root, cb, predicates);
//            specApproveDate(requestDTO, root, cb, predicates);
//            return cq.where(predicates.toArray(new Predicate[0])).getRestriction();
//        };
//    }
}
