package ru.skillbox.diplom.group42.social.service.dto.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class EventNotificationDto {
    private Long authorId;
    private Long receiverId;
    private NotificationType notificationType;
    private String content;

}
