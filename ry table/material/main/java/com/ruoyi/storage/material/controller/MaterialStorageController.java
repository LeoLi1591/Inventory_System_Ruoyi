package com.ruoyi.storage.material.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.storage.material.domain.MaterialStorage;
import com.ruoyi.storage.material.service.IMaterialStorageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物料仓库管理Controller
 * 
 * @author ruoyi
 * @date 2024-10-24
 */
@Controller
@RequestMapping("/material/storage")
public class MaterialStorageController extends BaseController
{
    private String prefix = "material/storage";

    @Autowired
    private IMaterialStorageService materialStorageService;

    @RequiresPermissions("material:storage:view")
    @GetMapping()
    public String storage()
    {
        return prefix + "/storage";
    }

    /**
     * 查询物料仓库管理列表
     */
    @RequiresPermissions("material:storage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MaterialStorage materialStorage)
    {
        startPage();
        List<MaterialStorage> list = materialStorageService.selectMaterialStorageList(materialStorage);
        return getDataTable(list);
    }

    /**
     * 导出物料仓库管理列表
     */
    @RequiresPermissions("material:storage:export")
    @Log(title = "物料仓库管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MaterialStorage materialStorage)
    {
        List<MaterialStorage> list = materialStorageService.selectMaterialStorageList(materialStorage);
        ExcelUtil<MaterialStorage> util = new ExcelUtil<MaterialStorage>(MaterialStorage.class);
        return util.exportExcel(list, "物料仓库管理数据");
    }

    /**
     * 新增物料仓库管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存物料仓库管理
     */
    @RequiresPermissions("material:storage:add")
    @Log(title = "物料仓库管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MaterialStorage materialStorage)
    {
        return toAjax(materialStorageService.insertMaterialStorage(materialStorage));
    }

    /**
     * 修改物料仓库管理
     */
    @RequiresPermissions("material:storage:edit")
    @GetMapping("/edit/{materialId}")
    public String edit(@PathVariable("materialId") String materialId, ModelMap mmap)
    {
        MaterialStorage materialStorage = materialStorageService.selectMaterialStorageByMaterialId(materialId);
        mmap.put("materialStorage", materialStorage);
        return prefix + "/edit";
    }

    /**
     * 修改保存物料仓库管理
     */
    @RequiresPermissions("material:storage:edit")
    @Log(title = "物料仓库管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MaterialStorage materialStorage)
    {
        return toAjax(materialStorageService.updateMaterialStorage(materialStorage));
    }

    /**
     * 删除物料仓库管理
     */
    @RequiresPermissions("material:storage:remove")
    @Log(title = "物料仓库管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(materialStorageService.deleteMaterialStorageByMaterialIds(ids));
    }
}
