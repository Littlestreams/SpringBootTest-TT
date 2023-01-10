package com.no4.virpay;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.ListUtils;
import com.no4.virpay.dao.dto.ComplexHeadDataDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

/**
 * @author lvqi
 * @Title:
 * @Package
 * @Description:
 * @date 2023/1/6 16:44
 */
@SpringBootTest
public class EasyExcelTest {
    private final String path ="D:\\easyExcel\\";
    @Test
    public void  ComplexHeadDataTest() {
        String fileName = path + "complexHeadWrite" + System.currentTimeMillis() + ".xlsx";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        EasyExcel.write(fileName, ComplexHeadDataDTO.class).sheet("复杂模板").doWrite(data());
    }
    private List<ComplexHeadDataDTO> data() {
        List<ComplexHeadDataDTO> list = ListUtils.newArrayList();
        for (int i = 0; i < 10; i++) {
            ComplexHeadDataDTO data = new ComplexHeadDataDTO();
            data.setString("字符串" + i);
            data.setDate(new Date());
            data.setDoubleData(0.56);
            list.add(data);
        }
        return list;
    }
}
