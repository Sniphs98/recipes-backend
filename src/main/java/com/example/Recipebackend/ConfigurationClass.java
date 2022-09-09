package com.example.Recipebackend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback;

import java.util.UUID;

@Configuration
public class ConfigurationClass {

    @Bean
    public BeforeConvertCallback<UuidIdentifiedEntity> beforeSaveCallback() {

        return (entity, collection) -> {

            if (entity.getId() == null) {
                entity.setId(UUID.randomUUID());
            }
            return entity;
        };
    }
}
