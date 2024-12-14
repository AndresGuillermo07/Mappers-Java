package MapStruct;

import MapStruct.dto.PersonCustomDto;
import MapStruct.dto.PersonDefaultDto;
import MapStruct.entities.PersonEntity;
import MapStruct.mapper.PersonMapper;

public class Main {

    // MAPSTRUCT DEFAULT MAPPER

//    public static void main(String[] args) {
//        PersonEntity person = new PersonEntity(1L,"Andres","Aviles","andres@gmail",17,'M');
//        System.out.println(person);
//
//
//        PersonDefaultDto personDefaultDto =  PersonMapper.INSTANCE.personEntityToPersonDefaultDto(person);
//        System.out.println(personDefaultDto);
//
//    }

    // MAPSTRUCT CUSTOM MAPPER

    public static void main(String[] args) {

        PersonEntity person = new PersonEntity(1L,"Andres","Aviles","andres@gmail",17,'M');
        System.out.println(person);

        PersonCustomDto personCustomDto = PersonMapper.INSTANCE.personEntityToPersonCustomDto(person);
        System.out.println(personCustomDto);

    }
}
