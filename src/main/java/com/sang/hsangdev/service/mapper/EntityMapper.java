package com.sang.hsangdev.service.mapper;

import org.mapstruct.Mapper;

public interface EntityMapper<D, E> {
    E toEntity(D d);
    D toDto(E e);
}
