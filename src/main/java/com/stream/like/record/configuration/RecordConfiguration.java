package com.stream.like.record.configuration;

import com.stream.like.record.VideoRecord;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecordConfiguration {

    @Bean
    public VideoRecord videoRecord(){
        return new VideoRecord();
    }
}
