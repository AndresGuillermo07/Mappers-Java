package MapStruct.mapper;

import MapStruct.dto.PersonCustomDto;
import MapStruct.dto.PersonDefaultDto;
import MapStruct.entities.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDefaultDto personEntityToPersonDefaultDto(PersonEntity personEntity);

    @Mapping(source = "id",target = "idDto")
    @Mapping(source = "name",target = "nameDto")
    @Mapping(source = "surname",target = "surnameDto")
    @Mapping(source = "email",target = "emailDto")
    @Mapping(source = "age",target = "ageDto")
    @Mapping(source = "gender",target = "genderDto")
    PersonCustomDto personEntityToPersonCustomDto(PersonEntity personEntity);

}
