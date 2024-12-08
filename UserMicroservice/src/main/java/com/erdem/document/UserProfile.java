package com.erdem.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.scheduling.support.SimpleTriggerContext;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class UserProfile {
    @Id
    String id;
    Long authId;
    String userName;
    String name;
    String surName;
    String email;
    String phone;
    String avatar;
    String instagram;
    String twitter;
    Boolean isActive;
    Long creatAt;
}