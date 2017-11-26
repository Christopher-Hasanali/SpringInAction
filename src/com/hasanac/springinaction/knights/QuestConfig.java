package com.hasanac.springinaction.knights;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class QuestConfig {
    @Bean
    public Quest quest() {
        return new SlayDragonOnQuest(System.out);
    }
}
