package io.mtech.mappers;

import io.mtech.domain.User;
import io.mtech.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserCommand userToUserCommand(User user);
    User userToUserCommand(UserCommand userCommand);
}
