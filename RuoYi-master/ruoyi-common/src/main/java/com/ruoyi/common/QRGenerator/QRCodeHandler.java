package com.ruoyi.common.QRGenerator;

import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

public class QRCodeHandler {
    /**
     *  生成二维码
     * @param type 二维码的类型，为了演示效果，1跳百度的，2是跳CSDN

     * */
    public void getCode(int type , HttpServletResponse response) throws IOException {
        // 设置响应流信息
        response.setContentType("image/jpg");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        OutputStream stream = response.getOutputStream();

        //type是1，生成活动详情、报名的二维码，type是2，生成活动签到的二维码
        String content = (type == 1 ? "http://www.baidu.com" : "https://blog.csdn.net/m0_46991147?spm=1000.2115.3001.5343");
        //获取一个二维码图片
        BitMatrix bitMatrix = QRCodeUtils.createCode(content);
        //以流的形式输出到前端
        MatrixToImageWriter.writeToStream(bitMatrix , "jpg" , stream);
    }
}
