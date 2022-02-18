package uz.davrbank.app_chat.service;

import uz.davrbank.app_chat.dto.GenericDto;

import java.io.Serializable;
import java.util.List;


public interface GenericService<
        D extends GenericDto,
        K extends Serializable> extends BaseService {

    List<D> getAll();

    D get(K id);

}
