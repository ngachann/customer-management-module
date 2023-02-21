package com.example.customermanagementmodule.repository;

import com.example.customermanagementmodule.entity.Contact;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends Specification<Contact>, JpaAttributeConverter<Contact, Long> {

}
