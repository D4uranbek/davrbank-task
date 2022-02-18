package uz.davrbank.app_chat.service;

import uz.davrbank.app_chat.mapper.Mapper;
import uz.davrbank.app_chat.reposiroty.AbstractRepository;


public abstract class AbstractService<
        R extends AbstractRepository,
        M extends Mapper> {

    protected final R repository;
    protected final M mapper;

    protected AbstractService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}
