package com.cvproject.herokushop.model.jpaspecification;

import com.cvproject.herokushop.model.entity.Product;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ProductSpec implements Specification {
//    public static Specification<Product> filterByName(String name) {
//        return new Specification<Product>() {
//            @Override
//            public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//                return criteriaBuilder.equal(root.get("name"), name);
//
//            }
//        };
//    }
//
//    public static Specification<Product> filterByCountry(String country) {
//        return new Specification<Product>() {
//            @Override
//            public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//                return criteriaBuilder.equal(root.get("country"), country);
//            }
//        };
//    }
//
//    public static Specification<Product> filterByManufacturer(String manufacturer) {
//        return new Specification<Product>() {
//            @Override
//            public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//                return criteriaBuilder.equal(root.get("manufacturer"), manufacturer);
//            }
//        };
//    }

    private Product filter;

    public ProductSpec(Product filter) {
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicateList = new ArrayList<>();

        if (filter.getName() != null && !filter.getName().equals("")) {
            predicateList.add((criteriaBuilder.equal(root.get("name"), filter.getName())));
        }

        if (filter.getCountry() != null && !filter.getCountry().equals("")) {
            predicateList.add((criteriaBuilder.equal(root.get("country"), filter.getCountry())));
        }

        if (filter.getManufacturer() != null && !filter.getManufacturer().equals("")) {
            predicateList.add((criteriaBuilder.equal(root.get("manufacturer"), filter.getManufacturer())));
        }
        return criteriaBuilder.and(predicateList.toArray(new Predicate[0]));
    }
}
