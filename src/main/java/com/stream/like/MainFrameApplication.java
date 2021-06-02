package com.stream.like;

import com.stream.like.record.MainFrame;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

public class MainFrameApplication {

    public static void main(String[] args) {
        Application.launch(MainFrame.class);
    }
}
