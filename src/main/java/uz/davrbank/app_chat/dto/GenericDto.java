package uz.davrbank.app_chat.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GenericDto implements Dto {
    private Long id;
}
