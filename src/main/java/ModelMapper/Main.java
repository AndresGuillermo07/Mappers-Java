package ModelMapper;

import ModelMapper.dto.PersonCustomDto;
import ModelMapper.dto.PersonDefaultDto;
import ModelMapper.entities.PersonEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class Main {

//    /* Model Mapper - Default */
//    public static void main(String[] args) {
//        ModelMapper modelMapper = new ModelMapper();
//
//        PersonEntity person = new PersonEntity(
//                1L, "Santiago", "Perez", "santi@gmail.com", 25, 'M'
//        );
//
//        PersonDefaultDto personDefaultDto = modelMapper.map(person, PersonDefaultDto.class);
//
//        System.out.println("Person Entity: " + person);
//        System.out.println("Person Default DTO: " + personDefaultDto);
//    }

    /* Model Mapper - Custom */
    public static void main(String[] args) {
        ModelMapper modelMapper = new ModelMapper();

        TypeMap<PersonEntity,PersonCustomDto> propertyMapper = modelMapper.createTypeMap(PersonEntity.class, PersonCustomDto.class);

        propertyMapper.addMapping(PersonEntity::getId, PersonCustomDto::setIdDto);
        propertyMapper.addMapping(PersonEntity::getName, PersonCustomDto::setNameDto);

        PersonEntity person = new PersonEntity(
                1L, "Santiago", "Perez", "santi@gmail.com", 25, 'M'
        );

        PersonCustomDto personCustomDto = modelMapper.map(person, PersonCustomDto.class);

        System.out.println("Person Entity: " + person);
        System.out.println("Person Custom DTO: " + personCustomDto);
    }

}
