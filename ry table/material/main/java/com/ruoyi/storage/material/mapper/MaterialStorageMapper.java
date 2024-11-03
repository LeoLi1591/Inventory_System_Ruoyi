package com.ruoyi.storage.material.mapper;

import java.util.List;
import com.ruoyi.storage.material.domain.MaterialStorage;

/**
 * 物料仓库管理Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-24
 */
public interface MaterialStorageMapper 
{
    /**
     * 查询物料仓库管理
     * 
     * @param materialId 物料仓库管理主键
     * @return 物料仓库管理
     */
    public MaterialStorage selectMaterialStorageByMaterialId(String materialId);

    /**
     * 查询物料仓库管理列表
     * 
     * @param materialStorage 物料仓库管理
     * @return 物料仓库管理集合
     */
    public List<MaterialStorage> selectMaterialStorageList(MaterialStorage materialStorage);

    /**
     * 新增物料仓库管理
     * 
     * @param materialStorage 物料仓库管理
     * @return 结果
     */
    public int insertMaterialStorage(MaterialStorage materialStorage);

    /**
     * 修改物料仓库管理
     * 
     * @param materialStorage 物料仓库管理
     * @return 结果
     */
    public int updateMaterialStorage(MaterialStorage materialStorage);

    /**
     * 删除物料仓库管理
     * 
     * @param materialId 物料仓库管理主键
     * @return 结果
     */
    public int deleteMaterialStorageByMaterialId(String materialId);

    /**
     * 批量删除物料仓库管理
     * 
     * @param materialIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMaterialStorageByMaterialIds(String[] materialIds);
}
