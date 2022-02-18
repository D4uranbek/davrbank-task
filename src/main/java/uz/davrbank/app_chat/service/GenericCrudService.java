package uz.davrbank.app_chat.service;

import uz.davrbank.app_chat.dto.Dto;
import uz.davrbank.app_chat.dto.GenericDto;

import java.io.Serializable;

public interface GenericCrudService<
        D extends GenericDto,
        CD extends Dto,
        UD extends GenericDto,
        K extends Serializable> extends GenericService<D, K> {

    K create(CD createDto);

    Boolean update(UD updateDto);

    Void delete(K id);

}
