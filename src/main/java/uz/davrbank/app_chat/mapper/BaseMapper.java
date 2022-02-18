package uz.davrbank.app_chat.mapper;

import uz.davrbank.app_chat.dto.Dto;
import uz.davrbank.app_chat.dto.GenericDto;
import uz.davrbank.app_chat.entity.BaseEntity;

import java.util.List;

/**
 * Base mapper
 *
 * @param <E>  entity
 * @param <D>  dto
 * @param <CD> create dto
 * @param <UD> update dto
 */
public interface BaseMapper<
        E extends BaseEntity,
        D extends GenericDto,
        CD extends Dto,
        UD extends GenericDto> extends Mapper {

    D toDto(E e);

    List<D> toDto(List<E> e);

    E fromCreateDto(CD cd);

    E fromUpdateDto(UD ud);

}
