package com.springboot.forum.dao;

import com.springboot.forum.entity.Logintime;
import com.springboot.forum.entity.LogintimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogintimeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logintime
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    long countByExample(LogintimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logintime
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int deleteByExample(LogintimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logintime
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int deleteByPrimaryKey(Integer timeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logintime
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int insert(Logintime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logintime
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int insertSelective(Logintime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logintime
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    List<Logintime> selectByExample(LogintimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logintime
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    Logintime selectByPrimaryKey(Integer timeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logintime
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int updateByExampleSelective(@Param("record") Logintime record, @Param("example") LogintimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logintime
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int updateByExample(@Param("record") Logintime record, @Param("example") LogintimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logintime
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int updateByPrimaryKeySelective(Logintime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logintime
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int updateByPrimaryKey(Logintime record);
}