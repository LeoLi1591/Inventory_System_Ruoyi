package com.ruoyi.storage.material.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 物料仓库管理对象 material_storage
 * 
 * @author ruoyi
 * @date 2024-10-24
 */
public class MaterialStorage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 物料编码 */
    private String materialId;

    /** 名称 */
    @Excel(name = "名称")
    private String materialName;

    /** 种类 */
    @Excel(name = "种类")
    private Long materialType;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String materialSpecifications;

    /** 单位 */
    @Excel(name = "单位")
    private String materialUnits;

    /** 入库时间 */
    @Excel(name = "入库时间")
    private Long materialInTime;

    /** 条形码 */
    @Excel(name = "条形码")
    private String materialBarCode;

    /** 二维码 */
    @Excel(name = "二维码")
    private String materialQrCode;

    public void setMaterialId(String materialId) 
    {
        this.materialId = materialId;
    }

    public String getMaterialId() 
    {
        return materialId;
    }

    public void setMaterialName(String materialName) 
    {
        this.materialName = materialName;
    }

    public String getMaterialName() 
    {
        return materialName;
    }

    public void setMaterialType(Long materialType) 
    {
        this.materialType = materialType;
    }

    public Long getMaterialType() 
    {
        return materialType;
    }

    public void setMaterialSpecifications(String materialSpecifications) 
    {
        this.materialSpecifications = materialSpecifications;
    }

    public String getMaterialSpecifications() 
    {
        return materialSpecifications;
    }

    public void setMaterialUnits(String materialUnits) 
    {
        this.materialUnits = materialUnits;
    }

    public String getMaterialUnits() 
    {
        return materialUnits;
    }

    public void setMaterialInTime(Long materialInTime) 
    {
        this.materialInTime = materialInTime;
    }

    public Long getMaterialInTime() 
    {
        return materialInTime;
    }

    public void setMaterialBarCode(String materialBarCode) 
    {
        this.materialBarCode = materialBarCode;
    }

    public String getMaterialBarCode() 
    {
        return materialBarCode;
    }

    public void setMaterialQrCode(String materialQrCode) 
    {
        this.materialQrCode = materialQrCode;
    }

    public String getMaterialQrCode() 
    {
        return materialQrCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("materialId", getMaterialId())
            .append("materialName", getMaterialName())
            .append("materialType", getMaterialType())
            .append("materialSpecifications", getMaterialSpecifications())
            .append("materialUnits", getMaterialUnits())
            .append("materialInTime", getMaterialInTime())
            .append("materialBarCode", getMaterialBarCode())
            .append("materialQrCode", getMaterialQrCode())
            .toString();
    }
}
