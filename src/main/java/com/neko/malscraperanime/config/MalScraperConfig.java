package com.neko.malscraperanime.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MalScraperConfig {

    @Getter
    @Value("${mal.topanime}")
    private String topAnimeUrl;

}
