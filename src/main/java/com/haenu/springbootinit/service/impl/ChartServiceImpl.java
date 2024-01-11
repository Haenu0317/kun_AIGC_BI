package com.haenu.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haenu.springbootinit.mapper.ChartMapper;
import com.haenu.springbootinit.model.entity.Chart;
import com.haenu.springbootinit.service.ChartService;
import org.springframework.stereotype.Service;

/**
* @author Haenu0317
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-01-12 00:17:44
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService {

}




