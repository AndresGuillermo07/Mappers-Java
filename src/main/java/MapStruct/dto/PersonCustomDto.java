package MapStruct.dto;

import lombok.Data;

@Data
public class PersonCustomDto {

    private Long idDto;
    private String nameDto;
    private String surnameDto;
    private String emailDto;
    private Integer ageDto;
    private Character genderDto;

    public Long getIdDto() {
        return idDto;
    }

    public void setIdDto(Long idDto) {
        this.idDto = idDto;
    }

    public String getNameDto() {
        return nameDto;
    }

    public void setNameDto(String nameDto) {
        this.nameDto = nameDto;
    }

    public String getSurnameDto() {
        return surnameDto;
    }

    public void setSurnameDto(String surnameDto) {
        this.surnameDto = surnameDto;
    }

    public String getEmailDto() {
        return emailDto;
    }

    public void setEmailDto(String emailDto) {
        this.emailDto = emailDto;
    }

    public Integer getAgeDto() {
        return ageDto;
    }

    public void setAgeDto(Integer ageDto) {
        this.ageDto = ageDto;
    }

    public Character getGenderDto() {
        return genderDto;
    }

    public void setGenderDto(Character genderDto) {
        this.genderDto = genderDto;
    }

    @Override
    public String toString() {
        return "PersonCustomDto{" +
                "idDto=" + idDto +
                ", nameDto='" + nameDto + '\'' +
                ", surnameDto='" + surnameDto + '\'' +
                ", emailDto='" + emailDto + '\'' +
                ", ageDto=" + ageDto +
                ", genderDto=" + genderDto +
                '}';
    }
}
