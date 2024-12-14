package OrikaMapper;

import OrikaMapper.dto.PersonCustomDto;
import OrikaMapper.dto.PersonDefaultDto;
import OrikaMapper.entities.PersonEntity;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class Main {

//    // ORIKA MAPPER DEFAULT
//
//    public static void main(String[] args) {
//
//        MapperFactory factory = new DefaultMapperFactory.Builder().build();
//        factory.classMap(PersonEntity.class, PersonDefaultDto.class);
//
//        MapperFacade mapper = factory.getMapperFacade();
//
//        PersonEntity person = new PersonEntity(
//                1L,"Andres","Aviles","andres@gmail.com",17,'M'
//        );
//        System.out.println(person);
//
//        PersonDefaultDto personDefaultDto = mapper.map(person, PersonDefaultDto.class);
//        System.out.println(personDefaultDto);
//    }

    // ORIKA MAPPER CUSTOM

    public static void main(String[] args) {

        MapperFactory factory = new DefaultMapperFactory.Builder().build();
        factory.classMap(PersonEntity.class, PersonCustomDto.class)
                .field("id","idDto")
                .field("name","nameDto")
                .field("surname","surnameDto")
                .field("email","emailDto")
                .field("age","ageDto")
                .field("gender","genderDto")
                .byDefault()
                .register();

        MapperFacade mapper = factory.getMapperFacade();

        PersonEntity person = new PersonEntity(
                1L,"Andres","Aviles","andres@gmail.com",17,'M'
        );
        System.out.println(person);

        PersonCustomDto personDefaultDto = mapper.map(person, PersonCustomDto.class);
        System.out.println(personDefaultDto);
    }
}
