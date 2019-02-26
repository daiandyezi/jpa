package cn.itcast.dao;

import cn.itcast.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 符合springDataJpa的dao层规范
 *      JpaRepository<操作的实体类类型,实体类中主键属性的类型>
 *            封装了基本的CRUD操作
 *      JpaSpecificationExecutor<操作的实体类类型>
 *            封装了复杂查询 (分页)
 */
public interface CustomerDao extends JpaRepository<Customer,Long> ,JpaSpecificationExecutor<Customer>{
}
