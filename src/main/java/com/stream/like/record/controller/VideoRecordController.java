package com.stream.like.record.controller;

import com.stream.like.record.VideoRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.awt.*;

@Slf4j
@RestController
@RequestMapping("stream/like/record")
public class VideoRecordController {

    @Resource
    private VideoRecord videoRecord;

    @PostMapping(path = "start-recording")
    public String startRecording(@RequestParam("isDefault") String isDefault,
                                 @RequestParam("fileName") String fileName) throws Exception {
        log.info("VideoRecordController startRecording 开始录屏,isDefault:{}",isDefault);
        if ("true".equals(isDefault)){
            doDefaultRecording(fileName);
        }

        return "正在录屏";
    }

    private void doDefaultRecording(String fileName) throws Exception {
        int width = (int) (1110);
        int height = (int)(724);
        Rectangle rectangle = new Rectangle(289,160,width, height); // 截屏的大小

        videoRecord.start(fileName,rectangle,false);
    }

    @PostMapping(path = "stop-record")
    public String stopRecord(){
        log.info("VideoRecordController stopRecord");
        videoRecord.stop();
        return "结束录屏";
    }
}
