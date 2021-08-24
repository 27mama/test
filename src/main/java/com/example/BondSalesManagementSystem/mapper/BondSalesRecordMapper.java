package com.example.BondSalesManagementSystem.mapper;

import com.example.BondSalesManagementSystem.model.BondSalesRecord;
import com.example.BondSalesManagementSystem.model.BondSalesRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BondSalesRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonds_sales_record
     *
     * @mbggenerated Fri Aug 20 11:26:29 CST 2021
     */
    int countByExample(BondSalesRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonds_sales_record
     *
     * @mbggenerated Fri Aug 20 11:26:29 CST 2021
     */
    int deleteByExample(BondSalesRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonds_sales_record
     *
     * @mbggenerated Fri Aug 20 11:26:29 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonds_sales_record
     *
     * @mbggenerated Fri Aug 20 11:26:29 CST 2021
     */
    int insert(BondSalesRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonds_sales_record
     *
     * @mbggenerated Fri Aug 20 11:26:29 CST 2021
     */
    int insertSelective(BondSalesRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonds_sales_record
     *
     * @mbggenerated Fri Aug 20 11:26:29 CST 2021
     */
    List<BondSalesRecord> selectByExample(BondSalesRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonds_sales_record
     *
     * @mbggenerated Fri Aug 20 11:26:29 CST 2021
     */
    BondSalesRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonds_sales_record
     *
     * @mbggenerated Fri Aug 20 11:26:29 CST 2021
     */
    int updateByExampleSelective(@Param("record") BondSalesRecord record, @Param("example") BondSalesRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonds_sales_record
     *
     * @mbggenerated Fri Aug 20 11:26:29 CST 2021
     */
    int updateByExample(@Param("record") BondSalesRecord record, @Param("example") BondSalesRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonds_sales_record
     *
     * @mbggenerated Fri Aug 20 11:26:29 CST 2021
     */
    int updateByPrimaryKeySelective(BondSalesRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonds_sales_record
     *
     * @mbggenerated Fri Aug 20 11:26:29 CST 2021
     */
    int updateByPrimaryKey(BondSalesRecord record);
}