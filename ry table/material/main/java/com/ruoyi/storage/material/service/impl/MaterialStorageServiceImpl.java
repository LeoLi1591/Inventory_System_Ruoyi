package com.ruoyi.storage.material.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.storage.material.mapper.MaterialStorageMapper;
import com.ruoyi.storage.material.domain.MaterialStorage;
import com.ruoyi.storage.material.service.IMaterialStorageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 物料仓库管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-24
 */
@Service
public class MaterialStorageServiceImpl implements IMaterialStorageService 
{
    @Autowired
    private MaterialStorageMapper materialStorageMapper;

    /**
     * 查询物料仓库管理
     * 
     * @param materialId 物料仓库管理主键
     * @return 物料仓库管理
     */
    @Override
    public MaterialStorage selectMaterialStorageByMaterialId(String materialId)
    {
        return materialStorageMapper.selectMaterialStorageByMaterialId(materialId);
    }

    /**
     * 查询物料仓库管理列表
     * 
     * @param materialStorage 物料仓库管理
     * @return 物料仓库管理
     */
    @Override
    public List<MaterialStorage> selectMaterialStorageList(MaterialStorage materialStorage)
    {
        return materialStorageMapper.selectMaterialStorageList(materialStorage);
    }

    /**
     * 新增物料仓库管理
     * 
     * @param materialStorage 物料仓库管理
     * @return 结果
     */
    @Override
    public int insertMaterialStorage(MaterialStorage materialStorage)
    {
        return materialStorageMapper.insertMaterialStorage(materialStorage);
    }

    /**
     * 修改物料仓库管理
     * 
     * @param materialStorage 物料仓库管理
     * @return 结果
     */
    @Override
    public int updateMaterialStorage(MaterialStorage materialStorage)
    {
        return materialStorageMapper.updateMaterialStorage(materialStorage);
    }

    /**
     * 批量删除物料仓库管理
     * 
     * @param materialIds 需要删除的物料仓库管理主键
     * @return 结果
     */
    @Override
    public int deleteMaterialStorageByMaterialIds(String materialIds)
    {
        return materialStorageMapper.deleteMaterialStorageByMaterialIds(Convert.toStrArray(materialIds));
    }

    /**
     * 删除物料仓库管理信息
     * 
     * @param materialId 物料仓库管理主键
     * @return 结果
     */
    @Override
    public int deleteMaterialStorageByMaterialId(String materialId)
    {
        return materialStorageMapper.deleteMaterialStorageByMaterialId(materialId);
    }
}
