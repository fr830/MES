package com.numberONe.mapper;

import java.util.List;
import com.numberONe.entity.DeviceInspectInfoFormMap;
import com.numberONe.entity.DeviceInspectPlanFormMap;
import com.numberONe.mapper.base.BaseMapper;


public interface DeviceInspectMapper extends BaseMapper{
	//点检项目集合列表
	public List<DeviceInspectInfoFormMap> findDeviceInspectInfoPage(DeviceInspectInfoFormMap deviceInspectInfoFormMap);	
	//生成点检条码
	public String findLastCode();
	//点检计划列表
	public List<DeviceInspectPlanFormMap> findDeviceInspectPlanPage(DeviceInspectPlanFormMap deviceInspectPlanFormMap);
}
