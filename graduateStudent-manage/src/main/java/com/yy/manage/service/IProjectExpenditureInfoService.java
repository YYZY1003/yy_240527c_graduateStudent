package com.yy.manage.service;

import java.util.List;
import com.yy.manage.domain.ProjectExpenditureInfo;

/**
 * 支出信息Service接口
 * 
 * @author YY
 * @date 2024-05-29
 */
public interface IProjectExpenditureInfoService 
{
    /**
     * 查询支出信息
     * 
     * @param id 支出信息主键
     * @return 支出信息
     */
    public ProjectExpenditureInfo selectProjectExpenditureInfoById(Long id);

    /**
     * 查询支出信息列表
     * 
     * @param projectExpenditureInfo 支出信息
     * @return 支出信息集合
     */
    public List<ProjectExpenditureInfo> selectProjectExpenditureInfoList(ProjectExpenditureInfo projectExpenditureInfo);

    /**
     * 新增支出信息
     * 
     * @param projectExpenditureInfo 支出信息
     * @return 结果
     */
    public int insertProjectExpenditureInfo(ProjectExpenditureInfo projectExpenditureInfo);

    /**
     * 修改支出信息
     * 
     * @param projectExpenditureInfo 支出信息
     * @return 结果
     */
    public int updateProjectExpenditureInfo(ProjectExpenditureInfo projectExpenditureInfo);

    /**
     * 批量删除支出信息
     * 
     * @param ids 需要删除的支出信息主键集合
     * @return 结果
     */
    public int deleteProjectExpenditureInfoByIds(Long[] ids);

    /**
     * 删除支出信息信息
     * 
     * @param id 支出信息主键
     * @return 结果
     */
    public int deleteProjectExpenditureInfoById(Long id);
}
